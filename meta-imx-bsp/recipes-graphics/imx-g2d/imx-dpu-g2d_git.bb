# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "G2D library using i.MX DPU"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=0858ec9c7a80c4a2cf16e4f825a2cc91"
DEPENDS = "libdrm opencl-headers"
PROVIDES += "virtual/libg2d"

PV = "2.5.0+git"

SRC_URI = "${IMX_DPU_G2D_SRC};branch=${SRCBRANCH}"
IMX_DPU_G2D_SRC ?= "git://github.com/nxp-imx/imx-dpu-g2d.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "df4a195de8d2928376960749674b52062bf2d5d9"

S:append = "/source"

inherit use-imx-headers pkgconfig

EXTRA_OEMAKE:imxmali = "BUILD_DPU_VERSION=2"

do_install () {
   install -d ${D}${libdir}
   install -d ${D}${includedir}
   cp -d --no-preserve=ownership ${S}/../lib/lib*.so* ${D}${libdir}
   cp -d --no-preserve=ownership ${S}/../include/* ${D}${includedir}
}

INSANE_SKIP:append:libc-musl = " file-rdeps"
RDEPENDS:${PN}:append:libc-musl = " gcompat"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(imxdpu)"
