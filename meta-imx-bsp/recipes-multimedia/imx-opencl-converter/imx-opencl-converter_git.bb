# Copyright 2023-2024,2026 NXP
DESCRIPTION = "NXP Multimedia opencl converter lib"
LICENSE = "BSD-3-Clause"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=a93d5dd70d0a316d4d6d0a736c716513"

DEPENDS = "virtual/libopencl1"

PV = "1.0.0+git"

SRCBRANCH = "master"
OPENCL_CONVERTER_SRC ?= "git://github.com/nxp-imx/imx-opencl-converter.git;protocol=https"
SRC_URI = "${OPENCL_CONVERTER_SRC};branch=${SRCBRANCH}"
SRCREV = "efc4997243e2b7614e13991cfd925066ec07891e"

inherit pkgconfig meson

FILES:${PN} += "${datadir}/"

COMPATIBLE_MACHINE               = "(^$)"
COMPATIBLE_MACHINE:imxgpu        = "(mx8-nxp-bsp|mx9-nxp-bsp)"
COMPATIBLE_MACHINE:mx8mm-nxp-bsp = "(^$)"
