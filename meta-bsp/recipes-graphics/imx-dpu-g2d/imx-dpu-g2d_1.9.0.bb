# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "GPU G2D library and apps for i.MX with 2D GPU and DPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=231e11849a4331fcbb19d7f4aab4a659"
PROVIDES += "virtual/libg2d"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"
SRC_URI[md5sum] = "db1a06c21326c3e8893954e90b0a091b"
SRC_URI[sha256sum] = "7ff8a9a2a3cec1f5d1bcb63f4a169bf0a2657384dea7f8bc7b121f1ed8113a80"

inherit fsl-eula-unpack

do_install () {
    install -d ${D}${libdir}
    install -d ${D}${includedir}
    cp -r ${S}/g2d/usr/lib/*.so* ${D}${libdir}
    cp -Pr ${S}/g2d/usr/include/* ${D}${includedir}
    cp -r ${S}/gpu-demos/opt ${D}
}

FILES_${PN} = "${libdir}/libg2d* /opt"
FILES_${PN}-dev = "${libdir}/libg2d${SOLIBSDEV} ${includedir}"
INSANE_SKIP_${PN} += "ldflags"

RDEPENDS_${PN} = "libgal-imx libdrm libopencl-imx"

# This is required to provide support for VPU Amphion HEVC tile format
# From NXP [MGS-5547] (commit e175d6b4f78deab24d319b852998bef55cdecc99):
# VPU Amphion HEVC tile support was added using OpenCL, so add a dependency on libopencl-imx.
RDEPENDS_${PN} += "libopencl-imx"

COMPATIBLE_MACHINE = "(imxdpu)"
