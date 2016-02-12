# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

LIC_FILES_CHKSUM = "file://COPYING-LGPL-2.1;md5=fbc093901857fcd118f065f900982c24"

PE = "1"

SRC_URI[md5sum] = "d73ac7a2b2ea0362cf061400c149d8e6"
SRC_URI[sha256sum] = "08323d36ddc5b2ad50c2eeb2f46dfabc93ccd48305320768471ee3f7ee06d632"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"

PLATFORM_mx7 = "IMX7"
PLATFORM_mx6ul = "IMX6UL"
