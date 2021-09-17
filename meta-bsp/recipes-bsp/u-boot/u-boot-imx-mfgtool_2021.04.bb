# Copyright (C) 2014 O.S. Systems Software LTDA.
# Copyright (C) 2014-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP

require u-boot-imx_${PV}.bb
require recipes-bsp/u-boot/u-boot-mfgtool.inc

UBOOT_TAGGED_BINARY = "u-boot-mfgtool-tagged.${UBOOT_SUFFIX}"
