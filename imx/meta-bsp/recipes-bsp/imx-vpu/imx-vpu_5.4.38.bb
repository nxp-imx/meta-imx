# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP

require recipes-bsp/imx-vpu/imx-vpu.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"

PE = "1"

SRC_URI[md5sum] = "6906619a5c3d4c13c15072487b003a19"
SRC_URI[sha256sum] = "702678b8ab12844216037a6cd04a2ba9ac61b9af3e1d6757dcf6752406b86c1f"

# Compatible only for i.MX with Chips&Media VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpucnm = "${MACHINE}"
