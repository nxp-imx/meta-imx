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

SRC_URI[md5sum] = "49074dc5831a26753818e37f05dae754"
SRC_URI[sha256sum] = "8bf0895a158581e18bbba6e47f0f2109d4f8fb48bf23d1db03d50e550b545a27"

PLATFORM_mx7 = "IMX7D"
PLATFORM_mx6ul = "IMX6UL"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6|mx7|imx6ul)"
