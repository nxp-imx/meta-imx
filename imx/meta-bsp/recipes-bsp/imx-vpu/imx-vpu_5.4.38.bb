# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP

require recipes-bsp/imx-vpu/imx-vpu.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"

PE = "1"

SRC_URI[md5sum] = "9d51f6595dbb9ef73af219a250908e35"
SRC_URI[sha256sum] = "d34f0432ef07c2fff1600a4846dd42313db8fd97ab25c369b780002db9c80148"

# Compatible only for i.MX with Chips&Media VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpucnm = "${MACHINE}"
