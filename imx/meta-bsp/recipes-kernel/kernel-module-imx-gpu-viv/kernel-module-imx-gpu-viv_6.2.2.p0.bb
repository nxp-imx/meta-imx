# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dfb16fe1bf7a421a4eca08ea21939d2f"
SRC_URI[sha256sum] = "129fc90464eb4834e21fe5bb94bbf97c87cc946c488c1752a0dc894ba5e9d8d6"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
