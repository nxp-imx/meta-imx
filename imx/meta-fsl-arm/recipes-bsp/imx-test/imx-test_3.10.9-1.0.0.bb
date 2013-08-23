# Copyright (C) 2013 Freescale Semiconductor

include imx-test.inc

PE = "1"

SRC_URI += "file://0001-ENGR00268211-imx-test-fixes-for-breaks-in-Yocto-buil.patch"

SRC_URI[md5sum] = "e39834a3a665be51e5dc52d36046bd51"
SRC_URI[sha256sum] = "6d07ed90aa32714f057b8b3dcf3cf3c1ac505bdb9aa1af20174bc7860f3859ed"

COMPATIBLE_MACHINE = "(mx6)"
