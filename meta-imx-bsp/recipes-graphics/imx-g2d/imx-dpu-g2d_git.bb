# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "G2D library using i.MX DPU"
# FIXME
LICENSE = "CLOSED"
#LICENSE = "Proprietary"
#LIC_FILES_CHKSUM = "file://../LICENSE;md5=5a5269faabff841b575efa468fe8a52e"
DEPENDS = "libdrm"
PROVIDES += "virtual/libg2d"

PV = "2.5.0+git"

SRC_URI = "${IMX_DPU_G2D_SRC};branch=${SRCBRANCH}"
IMX_DPU_G2D_SRC ?= "git://github.com/nxp-imx/imx-dpu-g2d.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "e29cea6d9ecf35a083c1413c6b5718cc7b2ddc01"

S:append = "/source"

inherit use-imx-headers pkgconfig

PACKAGECONFIG:imxmali = "mali"
PACKAGECONFIG:imxviv  = "vivante"

PACKAGECONFIG[mali] = "BUILD_DPU_VERSION=2,,,,,vivante"
PACKAGECONFIG[vivante] = ",,opencl-headers,,,mali"

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
