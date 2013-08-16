# Copyright (C) 2013 Freescale Semiconductor

require recipes-bsp/imx-lib/imx-lib.inc

DESCRIPTION = "Freescale VPU library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://EULA;md5=6df184a9b1950b68e17fdcd7513bdb97"

SRC_URI = "${FSL_MIRROR}/imx-vpu-${PV}-1.0.0.bin;fsl-eula=true"
SRC_URI[md5sum] = "03872c64cc503996d82f309f29298c32"
SRC_URI[sha256sum] = "1b49703c24a792ae7a5b302fad0b2dec762762a981e86c3468788a41c72a3821"
S = "${WORKDIR}/${PN}-${PV}-1.0.0"

do_compile () {
    INCLUDE_DIR="-I${STAGING_INCDIR}/uapi -I${STAGING_KERNEL_DIR}/include/uapi -I${STAGING_KERNEL_DIR}/include"

    oe_runmake CROSS_COMPILE="${HOST_PREFIX}" PLATFORM="${PLATFORM}" INCLUDE="${INCLUDE_DIR}" all
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx6)"
