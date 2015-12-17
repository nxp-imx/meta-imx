# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

#require recipes-multimedia/libfslcodec/libfslcodec.inc
require recipes-multimedia/imx-codec/imx-codec.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=3880bb9c943b135a30fad5e8aabd3ee9"

SRC_URI[md5sum] = "cfd901db2ec9f0bfe1e7cbd4c72c9f26"
SRC_URI[sha256sum] = "e0ef580ea6a534c17f1b8efebf734035805fa8e0d775d05a3ab57b47990e76c0"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6|mx6ul|mx7)"
