# Copyright (C) 2013 Freescale Semiconductor

require recipes-bsp/imx-test/imx-test.inc

SRC_URI = "${FSL_MIRROR}/imx-test-${PV}-1.0.0.tar.gz \
            file://clocks.sh \
            file://0001-ENGR00268211-imx-test-fixes-for-breaks-in-Yocto-buil.patch"

SRC_URI[md5sum] = "1c2dc20419acba21064b65096c892ac6"
SRC_URI[sha256sum] = "be9d539eacd16f95438d04a9aa352dca58d7166e113c2fe68c2487e860063001"
S = "${WORKDIR}/${PN}-${PV}-1.0.0"

COMPATIBLE_MACHINE = "(mx6)"
