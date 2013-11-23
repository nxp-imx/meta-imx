# Copyright (C) 2013 Freescale Semiconductor

require recipes-bsp/imx-lib/imx-lib.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}_beta.tar.gz"
S="${WORKDIR}/${PN}-${PV}_beta"

SRC_URI[md5sum] = "f2eb8618ccee512733ff993d414ab9c7"
SRC_URI[sha256sum] = "81fb491608d8f48fe3e30e8caabafd6121c0f126172e4f282c92374ddedaa6df"

COMPATIBLE_MACHINE = "(mx6)"