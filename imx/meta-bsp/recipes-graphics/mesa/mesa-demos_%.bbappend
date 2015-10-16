DEPENDS = "mesa"

PACKAGECONFIG_append = "${@base_contains('DISTRO_FEATURES', 'x11', \
                            base_contains('DISTRO_FEATURES', 'wayland',' wayland vg', '', d), \
                               base_contains('DISTRO_FEATURES', 'wayland',' wayland vg', '', d), d)}"
