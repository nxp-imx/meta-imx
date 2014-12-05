SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Provides flexibility to switch graphics between different kernels in future \
releases.This package uses same source code as GPU kernel driver source."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI = "${FSL_MIRROR}/imx-gpu-viv-kernel-5.0.11.p4.1.tar.gz \
           file://Makefile \
           file://COPYING \
          "
SRC_URI[md5sum] = "44635dee57c16c8e9082917a35821a7e"
SRC_URI[sha256sum] = "9253b93691214fd20a45b7bb4059e2515b10a6c1e603fd36a8d4483914688a20"

S = "${WORKDIR}"

EXTRA_OEMAKE += " AQROOT=${S}/imx-gpu-viv-kernel-5.0.11.p4.1"
