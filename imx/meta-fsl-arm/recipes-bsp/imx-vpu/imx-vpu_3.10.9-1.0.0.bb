# Copyright (C) 2013 Freescale Semiconductor

require recipes-bsp/imx-lib/imx-lib.inc

DESCRIPTION = "Freescale VPU library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://vpu/EULA.txt;md5=b063366b066c9f10037c59756a9ced54"

PE = "1"

SRC_URI = "${FSL_MIRROR}/imx-vpu-${PV}.bin;fsl-eula=true"
SRC_URI[md5sum] = "f824bed66759cbf10952ae5a880c484b"
SRC_URI[sha256sum] = "452f3d294861a5a0f85f6be393a1f003864e6beb5ad2a76f14cc9365bbf1a9e0"

do_compile () {
    INCLUDE_DIR="-I${STAGING_INCDIR}/uapi -I${STAGING_KERNEL_DIR}/include/uapi -I${STAGING_KERNEL_DIR}/include"

    oe_runmake CROSS_COMPILE="${HOST_PREFIX}" PLATFORM="${PLATFORM}" INCLUDE="${INCLUDE_DIR}" all
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx6)"
