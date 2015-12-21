# Update the dependency on imx-vpuwrap
DEPENDS_remove_mx6q = " libfslvpuwrap"
DEPENDS_remove_mx6dl = " libfslvpuwrap"

DEPENDS_append_mx6q = " imx-vpuwrap"
DEPENDS_append_mx6dl = " imx-vpuwrap"

# Don't use X if it's running through Wayland
ENABLE_X11 = "${@base_contains('DISTRO_FEATURES', 'wayland', '0', \
                 base_contains('DISTRO_FEATURES', 'x11', '1', \
                 '0', d), d)}"
ENABLE_WAYLAND = "${@base_contains('DISTRO_FEATURES', 'wayland', '1', '0', d)}"
