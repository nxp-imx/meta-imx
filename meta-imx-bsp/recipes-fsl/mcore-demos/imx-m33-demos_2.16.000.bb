# Copyright 2023-2024 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"
LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"

SRC_URI[imx8ulp.md5sum] = "47beeae7b9d5112c25fc0111427ce411"
SRC_URI[imx8ulp.sha256sum] = "b4ec0648e2c4d2a44235ba21856d986c319e1bda3b72286790a7ca189de51fbb"

SRC_URI[imx93.md5sum] = "b1fe2e0ed0f7e5094e0c8129f44f80a8"
SRC_URI[imx93.sha256sum] = "6a94fc318b0948483d542ca1deedaf4bf2397462942d389f4fcbb22ab484064b"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
