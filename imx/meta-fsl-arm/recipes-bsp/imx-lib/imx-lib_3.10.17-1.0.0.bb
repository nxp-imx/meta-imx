# Copyright (C) 2013 Freescale Semiconductor

require recipes-bsp/imx-lib/imx-lib.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}_beta.tar.gz"
S="${WORKDIR}/${PN}-${PV}_beta"

SRC_URI[md5sum] = "5eb40bfc58d84b0e189993bb281d5b45"
SRC_URI[sha256sum] = "e82d7f920b94d3784af2d365efa2182687d98c07e545154cda81658f3b8b5d40"

COMPATIBLE_MACHINE = "(mx6)"

