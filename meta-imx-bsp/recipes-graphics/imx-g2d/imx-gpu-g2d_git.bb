# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2026 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=5a5269faabff841b575efa468fe8a52e"
DEPENDS = "imx-gpu-viv"
PROVIDES = "virtual/libg2d"

PV = "2.5.0+git"

SRC_URI = "${IMX_GPU_G2D_SRC};branch=${SRCBRANCH}"
IMX_GPU_G2D_SRC ?= "git://github.com/nxp-imx/imx-gpu-g2d.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "c73523df70e5c34549413e9f34a6ad44b4af18e7"

S:append = "/source"

inherit use-imx-headers

EXTRA_OEMAKE = " \
    ARCH=${ARCH} \
    ROOTFS_USR=${STAGING_DIR_HOST}/usr \
    CPU_TYPE=0 \
    YOCTO_BUILD=1 \
    BUILD_HARD_VFP=1 \
    USE_OPENCL=${USE_OPENCL}"
ARCH         = ""
ARCH:aarch64 = "arm64-yocto"
USE_OPENCL               = "1"
USE_OPENCL:arm           = "0"
USE_OPENCL:mx8mm-nxp-bsp = "0"

do_install () {
    install -d ${D}${libdir}
    install -d ${D}${includedir}
    cp -d --no-preserve=ownership ${S}/../lib/lib*.so* ${D}${libdir}
    cp -d --no-preserve=ownership ${S}/../include/* ${D}${includedir}
}

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(imxgpu2d)"
