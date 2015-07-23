# Don't use X if it's running through Wayland
ENABLE_X11 = "${@base_contains('DISTRO_FEATURES', 'wayland', '0', \
                 base_contains('DISTRO_FEATURES', 'x11', '1', \
                 '0', d), d)}"
ENABLE_WAYLAND = "${@base_contains('DISTRO_FEATURES', 'wayland', '1', '0', d)}"
