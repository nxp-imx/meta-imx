# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "GPU G2D library and apps for i.MX with 2D GPU and DPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"
PROVIDES += "virtual/libg2d"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"
SRC_URI[md5sum] = "0d27168bc13d2b5ab3b5435b2c2e0856"
SRC_URI[sha256sum] = "74cd0137c31ebae72bb0e3e47cf41ecac5fe81dddab3bea63eda9b45fbc7573d"

inherit fsl-eula-unpack

do_install () {
    install -d ${D}${libdir}
    install -d ${D}${includedir}
    cp -r --no-preserve=ownership ${S}/g2d/usr/lib/*.so* ${D}${libdir}
    cp -r --no-preserve=ownership ${S}/g2d/usr/include/* ${D}${includedir}
    cp -r -d --no-preserve=ownership ${S}/gpu-demos/opt ${D}
}

FILES_${PN} += "/opt"
INSANE_SKIP_${PN} += "ldflags"

RDEPENDS_${PN} = "libgal-imx libdrm"

# This is required to provide support for VPU Amphion HEVC tile format
# From NXP [MGS-5547] (commit e175d6b4f78deab24d319b852998bef55cdecc99):
# VPU Amphion HEVC tile support was added using OpenCL, so add a dependency on libopencl-imx.
RDEPENDS_${PN} += "libopencl-imx"

COMPATIBLE_MACHINE = "(imxdpu)"
