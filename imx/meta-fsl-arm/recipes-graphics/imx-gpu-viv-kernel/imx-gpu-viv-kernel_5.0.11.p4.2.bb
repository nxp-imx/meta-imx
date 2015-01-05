SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Provides flexibility to switch graphics between different kernels in future \
releases.This package uses same source code as GPU kernel driver source."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
          "
SRC_URI[md5sum] = "13da2d9e482a7d2cb71b24e5a395a6a2"
SRC_URI[sha256sum] = "ba7778c32b5a08b1e3e034a0b8345e151366c934109b556b2072e905e3064426"

S = "${WORKDIR}/${PN}-${PV}"

EXTRA_OEMAKE += " AQROOT=${S}/imx-gpu-viv-kernel-src"
