# Copyright 2023-2024 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"
LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"

SRC_URI[imx8ulp.md5sum] = "47beeae7b9d5112c25fc0111427ce411"
SRC_URI[imx8ulp.sha256sum] = "b4ec0648e2c4d2a44235ba21856d986c319e1bda3b72286790a7ca189de51fbb"

SRC_URI[imx93.md5sum] = "293b097136b5c2c857057d1724b468ac"
SRC_URI[imx93.sha256sum] = "c954b9bc32cfdea9b696fa0b02f934812054e3ab445b5dd8eb7898d427e47526"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
