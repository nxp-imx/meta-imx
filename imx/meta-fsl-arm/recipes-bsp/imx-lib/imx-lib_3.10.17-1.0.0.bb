# Copyright (C) 2013 Freescale Semiconductor

require recipes-bsp/imx-lib/imx-lib.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}_beta.tar.gz"
S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "7980e614dfefb7b257b18b046f47422c"
SRC_URI[sha256sum] = "6a967b9dd99cd103f917f1f7403959235b8d224e4e055b3533f7be72eed9b98c"

COMPATIBLE_MACHINE = "(mx6)"

