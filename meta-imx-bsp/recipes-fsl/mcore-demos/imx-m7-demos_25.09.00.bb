# Copyright 2023-2025 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mn-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
LIC_FILES_CHKSUM:mx8mnul-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

LIC_FILES_CHKSUM:mx8mp-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
LIC_FILES_CHKSUM:mx8mpul-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

LIC_FILES_CHKSUM:mx95-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

SRC_URI[imx8mn.sha256sum] = "1999eeef3b484093274cff8a0242cc36aa6e06a68fa772c1b8866924b8ebf104"
SRC_URI[imx8mnddr3l.sha256sum] = "41e89664e39cca676f8b27ffbd0d3b03ba65cef54f10fcf34ea1f0314f143100"

SRC_URI[imx8mp.sha256sum] = "d75c4081df59d790cb757fa144b245c78f9e12ef90e446bd6222b85e93af9ca5"

SRC_URI[imx95.sha256sum] = "19c7196caeb632090de3d62e90a9fb027b626808db39b99e88bb8b6050973a81"

COMPATIBLE_MACHINE = "(mx8mn-nxp-bsp|mx8mnul-nxp-bsp|mx8mp-nxp-bsp|mx8mpul-nxp-bsp|mx95-nxp-bsp)"

