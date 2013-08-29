# Copyright (C) 2013 Freescale Semiconductor

require recipes-bsp/imx-lib/imx-lib.inc

inherit fsl-eula-unpack

DESCRIPTION = "Freescale VPU library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://vpu/EULA.txt;md5=b063366b066c9f10037c59756a9ced54"

PE = "1"

SRC_URI = "${FSL_MIRROR}/imx-vpu-${PV}.bin;fsl-eula=true"
SRC_URI[md5sum] = "662796b298639f4ff49aca5299508c82"
SRC_URI[sha256sum] = "596a50c0f1e4215273d235e530fd44011cfd855846e3b06d29b218e0e6f7cb75"

do_compile () {
    INCLUDE_DIR="-I${STAGING_INCDIR}/uapi -I${STAGING_KERNEL_DIR}/include/uapi -I${STAGING_KERNEL_DIR}/include"

    oe_runmake CROSS_COMPILE="${HOST_PREFIX}" PLATFORM="${PLATFORM}" INCLUDE="${INCLUDE_DIR}" all
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx6)"
