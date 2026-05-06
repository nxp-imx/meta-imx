#!/usr/bin/env bash
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
	if ((__count <= 0)); then
		printf -v "$__var" "%s" ""
		return
	fi
	local out=""
	local i
	for ((i = 0; i < __count; i++)); do
		out+="$__unit"
	done
	printf -v "$__var" "%s" "$out"
}

_repeat_char() {
	local __var="$1" __count="$2" __char="$3"
	if ((__count <= 0)); then
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

	((vis < 0)) && vis=0
	((width < vis)) && width="$vis"

	total_pad=$((width - vis))
	((total_pad < 0)) && total_pad=0

	left=$((total_pad / 2))
	right=$((total_pad - left))

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

	outer_target=$((visible + 2 + 2))
	if ((outer_target < min_width)); then
		outer_target="$min_width"
	fi

	local inner_width=$((outer_target - 2))
	((inner_width < 0)) && inner_width=0

	local horiz
	_repeat_unit horiz "$inner_width" "$border_pad"

	printf "\n"
	echo -e "${BOLD}${CYAN}╔""$horiz""╗${RESET}"
	echo -e -n "${BOLD}${CYAN}║${RESET}  "

	local content_area=$((inner_width - 4))
	((content_area < 0)) && content_area=0

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
PACKAGE_NAME="rt-sdk-ara2"
PACKAGE_VERSION="2.0.4"

# Base directory where your Kinara scripts live
SERVICE_NAME="rt-sdk-ara2.service"

# Detect SoC platform
SOC_ID=$(cat /sys/devices/soc0/soc_id 2>/dev/null || echo "Unknown")

# Display header
header "${PACKAGE_NAME} v${PACKAGE_VERSION} - Installation"

info "Installing on ${SOC_ID} Platform"

# Determine swap size based on platform
if [[ "$SOC_ID" == "i.MX8MP" ]]; then
	SWAP_SIZE=5
	info "Detected i.MX8MP platform - using ${SWAP_SIZE}GB swap"
else
	SWAP_SIZE=2
	info "Using default ${SWAP_SIZE}GB swap"
fi

# 1) Resize the disk memory
echo
section "Resizing disk partition"
if command -v resize_disk_max >/dev/null 2>&1; then
	resize_disk_max
	echo
	success "Disk partition resized to maximum"
else
	error "resize_disk_max command not found"
fi

# 2) Enable swap
echo
section "Configuring swap memory"
info "Enabling ${SWAP_SIZE}GB of swap memory"
if command -v enable_swap >/dev/null 2>&1; then
	enable_swap $SWAP_SIZE
	echo
	success "Swap memory enabled (${SWAP_SIZE}GB)"
else
	error "enable_swap command not found"
fi

# 3) Creating directories
echo
section "Creating application directories"
mkdir -vp /usr/share/{cnn,llm} 2>&1 | while read line; do
	success "$line"
done

# 4) Enable rt-sdk-ara2.service
echo
section "Configuring systemd service"
if [ -f "/etc/systemd/system/$SERVICE_NAME" ]; then
	systemctl daemon-reload
	systemctl enable "$SERVICE_NAME"
	echo
	success "$SERVICE_NAME has been enabled"
	info "Service will start automatically on boot"
	echo ""
	info "To disable: ${BOLD}systemctl disable $SERVICE_NAME${RESET}"
	info "To start now: ${BOLD}systemctl start $SERVICE_NAME${RESET}"
else
	warning "$SERVICE_NAME not found at /etc/systemd/system/"
fi

# 6) Reload udev rules
echo
section "Reloading udev rules"
udevadm control --reload-rules
success "Udev rules reloaded"

# Final success message
echo ""
header "Installation completed successfully!"
echo ""
success "Package ${BOLD}${PACKAGE_NAME}${RESET} installed successfully"
info "All scripts are now available system-wide"
echo ""

# End of postinst script
exit 0
