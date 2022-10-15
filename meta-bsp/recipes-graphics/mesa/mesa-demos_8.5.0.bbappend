DEPENDS += "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland-protocols', '', d)}"
