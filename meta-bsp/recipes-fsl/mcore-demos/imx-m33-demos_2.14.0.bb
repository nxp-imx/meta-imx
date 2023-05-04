# Copyright 2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374"
LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374"

SRC_URI[imx8ulp.md5sum] = "849871405542b02a50dfdd0a16ff3fa0"
SRC_URI[imx8ulp.sha256sum] = "030824e6f5bc00207689d9a892f8e0f43fd8fa64ab410b4652f6df7d530398f7"

SRC_URI[imx93.md5sum] = "c6e96b850196f60a1e6cc512965f8257"
SRC_URI[imx93.sha256sum] = "81b373dcccc6d446d026ddeef7ce0b14452a0ff090b7d9594e5bb79dfa3e5567"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
