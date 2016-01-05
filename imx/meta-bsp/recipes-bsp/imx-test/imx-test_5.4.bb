# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx7d = "virtual/kernel imx-lib imx-vpu"

DEPENDS_mx6q += "${@base_contains('DISTRO_FEATURES', 'x11', \
                   ' libx11 libxdamage libxrender libxrandr', '', d)}"
DEPENDS_mx6dl += "${@base_contains('DISTRO_FEATURES', 'x11', \
                   ' libx11 libxdamage libxrender libxrandr', '', d)}"
DEPENDS_mx6sl += "${@base_contains('DISTRO_FEATURES', 'x11', \
                   ' libx11 libxdamage libxrender libxrandr', '', d)}"
DEPENDS_mx6sx += "${@base_contains('DISTRO_FEATURES', 'x11', \
                   ' libx11 libxdamage libxrender libxrandr', '', d)}"
DEPENDS_mx6ul += "${@base_contains('DISTRO_FEATURES', 'x11', \
                   ' libx11 libxdamage libxrender libxrandr', '', d)}"
DEPENDS_mx7d += "${@base_contains('DISTRO_FEATURES', 'x11', \
                   ' libx11 libxdamage libxrender libxrandr', '', d)}"

SRC_URI_append_mx5 = " file://clocks.sh"
SRC_URI_append_mxs = " file://clocks.sh"

SRC_URI[md5sum] = "3314a33c92122ca35b9919f04d31d28a"
SRC_URI[sha256sum] = "49f21f6a66adf0c151c54fc9acf7b26eb66643b66f783e66e5aa82e46c6a2034"

PLATFORM_mx7 = "IMX7D"
PLATFORM_mx6ul = "IMX6UL"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6|mx6ul|mx7)"
