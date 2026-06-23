# Copyright 2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

SRC_URI[imx8ulp.sha256sum] = "a1555921b5d0660b3e06ca377c1d767b5bbafa61b72d4cf2f6a9ea15f1eeeabb"

SRC_URI[imx93.sha256sum] = "c2761a010f99b0a6df7177acbba4e8ab8832bcb4d206b31a1702b85a3aa3d06a"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"

