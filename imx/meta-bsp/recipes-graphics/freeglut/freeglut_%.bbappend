DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "mesa", "", d)}"
