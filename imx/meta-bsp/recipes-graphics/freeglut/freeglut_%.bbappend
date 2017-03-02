DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "imx_v6_graphics", "", \
               bb.utils.contains("DISTRO_FEATURES", "x11",             "mesa", \
                                                                       "", d), d)}"
