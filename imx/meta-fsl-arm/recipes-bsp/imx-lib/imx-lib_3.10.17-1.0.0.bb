# Copyright (C) 2013 Freescale Semiconductor

require recipes-bsp/imx-lib/imx-lib.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}_beta.tar.gz"
S="${WORKDIR}/${PN}-${PV}_beta"

SRC_URI[md5sum] = "b59adaf9e3ca8c19aceb3d6c1a8a2af0"
SRC_URI[sha256sum] = "d3688168e7b73e1e3b76de2c7ceffbbff685d2c4760a45f9967c72b9d40ed317"

COMPATIBLE_MACHINE = "(mx6)"