
# Disable wayland backend for X11 to get past the gtk+3 errors till we upgrade to Wayland 1.4.0


PACKAGECONFIG_append_mx6 = "${@base_contains('DISTRO_FEATURES', 'x11', '--disable-wayland-backend', ' ', d)}"
