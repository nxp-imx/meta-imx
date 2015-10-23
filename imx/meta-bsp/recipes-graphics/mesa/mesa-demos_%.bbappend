DEPENDS = "mesa"

PACKAGECONFIG_remove_mx6 = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', \
        bb.utils.contains('DISTRO_FEATURES', 'wayland','x11 glu','',d), \
           bb.utils.contains('DISTRO_FEATURES', 'wayland','glu','',d),d)}"

PACKAGECONFIG_append = "${@base_contains('DISTRO_FEATURES', 'x11', \
                            base_contains('DISTRO_FEATURES', 'wayland',' wayland vg', '', d), \
                               base_contains('DISTRO_FEATURES', 'wayland',' wayland vg', '', d), d)}"
