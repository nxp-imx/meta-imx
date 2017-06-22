# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8cb7b9428f941751b67a91f1c77e84f4"
SRC_URI[sha256sum] = "f367e37eca9fd851da44135bed38c08fe446710b3f3a27166678b776f4a2a24a"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
