DEPENDS = "mesa"

PACKAGECONFIG_append = "${@base_contains('DISTRO_FEATURES', 'wayland', \
                    base_contains('DISTRO_FEATURES', 'x11',' wayland vg', ' wayland vg', d), '', d)}"
