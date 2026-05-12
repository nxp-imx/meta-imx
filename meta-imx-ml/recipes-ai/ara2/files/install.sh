#!/bin/sh
# Copyright 2025-2026 NXP
# SPDX-License-Identifier: BSD-3-Clause

set -e

# Color definitions
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[38;5;117m'
MAGENTA='\033[0;35m'
CYAN='\033[0;36m'
BOLD='\033[1m'
RESET='\033[0m'

CHECK="✓"
CROSS="✗"
ARROW="→"
WARNING="⚠"

_strip_ansi() {
  sed -E 's/\x1B\[[0-9;]*[[:alpha:]]//g'
}

_repeat_unit() {
  local __var="$1" __count="$2" __unit="$3"
  if (( __count <= 0 )); then
    printf -v "$__var" "%s" ""
    return
  fi
  local out=""
  local i
  for (( i=0; i<__count; i++ )); do
    out+="$__unit"
  done
  printf -v "$__var" "%s" "$out"
}

_repeat_char() {
  local __var="$1" __count="$2" __char="$3"
  if (( __count <= 0 )); then
    printf -v "$__var" "%s" ""
    return
  fi
  local spaces
  printf -v spaces "%*s" "$__count" ""
  local ch="${__char:0:1}"
  local val
  val=$(printf "%s" "$spaces" | LC_ALL=C tr ' ' "$ch")
  printf -v "$__var" "%s" "$val"
}

_center_visible() {
  local text="$1" width="$2" pad="${3:- }"
  local vis stripped total_pad left right L R
  stripped="$(printf "%s" "$text" | _strip_ansi)"
  vis="${#stripped}"

  (( vis < 0 )) && vis=0
  (( width < vis )) && width="$vis"

  total_pad=$(( width - vis ))
  (( total_pad < 0 )) && total_pad=0

  left=$(( total_pad / 2 ))
  right=$(( total_pad - left ))

  _repeat_char L "$left" "$pad"
  _repeat_char R "$right" "$pad"

  echo -e -n "$L" "${BOLD}${text}${RESET}" "$R"
}

header() {
  local title="$1"
  local min_width="80"
  local border_pad="═"

  if ! [[ "$min_width" =~ ^[0-9]+$ ]]; then
    printf "header: MIN_WIDTH must be an integer (got: %s)\n" "$min_width" >&2
    return 2
  fi

  local content
  content="${title}"

  local stripped visible inner_target outer_target
  stripped="$(printf "%s" "$content" | _strip_ansi)"
  visible="${#stripped}"

  outer_target=$(( visible + 2 + 2 ))
  if (( outer_target < min_width )); then
    outer_target="$min_width"
  fi

  local inner_width=$(( outer_target - 2 ))
  (( inner_width < 0 )) && inner_width=0

  local horiz
  _repeat_unit horiz "$inner_width" "$border_pad"

  printf "\n"
  echo -e "${BOLD}${CYAN}╔""$horiz""╗${RESET}"
  echo -e -n "${BOLD}${CYAN}║${RESET}  "

  local content_area=$(( inner_width - 4 ))
  (( content_area < 0 )) && content_area=0

  _center_visible "${content}" "$content_area" " "

  echo -e "${BOLD}${CYAN}║${RESET}"
  echo -e "${BOLD}${CYAN}╚""$horiz""╝${RESET}"
  printf "\n"
}

section() {
  echo -e "\n${BOLD}${BLUE}${ARROW} $1${RESET}"
  local sec
  _repeat_unit sec 80 "─"
  echo -e "${BLUE}${sec}${RESET}"
}

success() {
  echo -e "  ${GREEN}${CHECK}${RESET} $1"
}

error() {
  echo -e "  ${RED}${CROSS}${RESET} $1"
}

info() {
  echo -e "    $1"
}

warning() {
  echo -e "  ${YELLOW}${WARNING}${RESET}  $1"
}

# Package information
PACKAGE_NAME="eIQ AAF Connector"
PACKAGE_VERSION="2.0"

# Display header
header "${PACKAGE_NAME} v${PACKAGE_VERSION} - Installation"

# Create Python virtual environment
section "Setting up eIQ AAF Connector environment"

info "Creating python venv (/usr/share/eiq/aaf-connector/venv)..."
uv venv "/usr/share/eiq/aaf-connector/venv"
source "/usr/share/eiq/aaf-connector/venv/bin/activate"

section "Installing dependencies in venv"
uv pip install --no-progress /usr/share/python-wheels/optimum_ara-2.1.1-py3-none-any.whl
uv pip install --no-progress /usr/share/python-wheels/eiq_aaf_connector-2.1-py3-none-any.whl
success "Python packages installed"

deactivate

# Fetch Models
readonly FETCH_MODELS_SCRIPT="uvx --from /usr/share/python-wheels/fetch_models-1.0.0-py3-none-any.whl fetch_models"

# Create systemd service file
section "Creating systemd service..."
cat > /etc/systemd/system/eiq-aaf-connector.service << EOF
[Unit]
Description=eIQ AAF Connector Service
After=network.target rt-sdk-ara2.service

[Service]
Type=simple
User=root
WorkingDirectory=/usr/share/eiq/aaf-connector
ExecStart=/usr/share/eiq/aaf-connector/venv/bin/connector --host 127.0.0.1 --port 8000
Restart=on-failure
RestartSec=5s
StandardOutput=journal
StandardError=journal

[Install]
WantedBy=multi-user.target
EOF

success "Systemd service file created"

# Reload systemd and enable service for automatic start on boot
section "Configuring service to start on boot..."
systemctl daemon-reload
systemctl enable eiq-aaf-connector.service
success "Service enabled for automatic start on boot"

# Start the service now
section "Starting eIQ AAF Connector service..."
systemctl start eiq-aaf-connector.service
success "Service started"

header "Installation completed successfully!"
info "eIQ AAF Connector is now running and will start automatically on boot."
info ""
info "Installation directory: /usr/share/eiq/aaf-connector"
info "  ├── venv/              # Python virtual environment"
info "  ├── wheels/            # Python wheel packages"
info "  ├── server_config.json # Configuration file"
info "  ├── LICENSE            # License file"
info "  └── SBOM.spdx.json     # Software Bill of Materials"
info ""
info "Useful commands:"
info "  - Check status: systemctl status eiq-aaf-connector.service"
info "  - View logs: journalctl -u eiq-aaf-connector.service -f"
info "  - Stop service: systemctl stop eiq-aaf-connector.service"
info "  - Disable auto-start: systemctl disable eiq-aaf-connector.service"
