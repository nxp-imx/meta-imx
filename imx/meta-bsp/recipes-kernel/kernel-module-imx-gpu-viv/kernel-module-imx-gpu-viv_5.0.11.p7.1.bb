# Copyright (C) 2015 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Provides flexibility to switch graphics between different kernels in future \
releases. This package uses same source code as GPU kernel driver source."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ec30f4355dfdd50fb92fc08ff8410624"
SRC_URI[sha256sum] = "9ce6ed386f0d8b6316a4e33073c6b40905ef7ec453258d2a6232582599b61253"
