# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc
DEPENDS_mx7d = "virtual/kernel imx-lib"

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

SRC_URI[md5sum] = "b72e526cfd424ded15174bdf82dc8fe8"
SRC_URI[sha256sum] = "cf42a0128607244808dd618342e114cde2f3709d6648eb2e2f7910d52be80c6e"

PLATFORM_mx7 = "IMX7D"
PLATFORM_mx6ul = "IMX6UL"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6|mx7|imx6ul)"
