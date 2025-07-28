# Copyright 2023-2025 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mn-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
LIC_FILES_CHKSUM:mx8mnul-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

LIC_FILES_CHKSUM:mx8mp-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
LIC_FILES_CHKSUM:mx8mpul-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

LIC_FILES_CHKSUM:mx95-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

SRC_URI[imx8mn.sha256sum] = "f31fb5eabfc2b3377c0c75866e4d54079c5bc9a7d02de6ef2553c50cc1d5046d"
SRC_URI[imx8mnddr3l.sha256sum] = "41e89664e39cca676f8b27ffbd0d3b03ba65cef54f10fcf34ea1f0314f143100"

SRC_URI[imx8mp.sha256sum] = "d75c4081df59d790cb757fa144b245c78f9e12ef90e446bd6222b85e93af9ca5"

SRC_URI[imx95.sha256sum] = "d4777e3ca6815bf726488c5a4c8d8c7168dc4cf41e149c9e44a4a20c390f203b"

COMPATIBLE_MACHINE = "(mx8mn-nxp-bsp|mx8mnul-nxp-bsp|mx8mp-nxp-bsp|mx8mpul-nxp-bsp|mx95-nxp-bsp)"

