# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "G2D library using i.MX DPU"
# FIXME
LICENSE = "CLOSED"
#LICENSE = "Proprietary"
#LIC_FILES_CHKSUM = "file://../LICENSE;md5=5a5269faabff841b575efa468fe8a52e"
DEPENDS = "libdrm opencl-headers"
PROVIDES += "virtual/libg2d"

PV = "2.5.0+git"

SRC_URI = "${IMX_DPU_G2D_SRC};branch=${SRCBRANCH}"
IMX_DPU_G2D_SRC ?= "git://github.com/nxp-imx/imx-dpu-g2d.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "8e275a74cfa3fb67672f038a509d989ebdef61b7"

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
