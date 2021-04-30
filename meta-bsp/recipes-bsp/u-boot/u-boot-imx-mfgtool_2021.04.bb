# Copyright (C) 2014 O.S. Systems Software LTDA.
# Copyright (C) 2014-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP

require u-boot-imx_${PV}.bb
require recipes-bsp/u-boot/u-boot-mfgtool.inc

SPL_IMAGE = "${SPL_BINARYNAME}-${MACHINE}-mfgtool-${PV}-${PR}"
SPL_SYMLINK = "${SPL_BINARYNAME}-mfgtool-${MACHINE}"
