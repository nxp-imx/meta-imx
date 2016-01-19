# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

#require recipes-multimedia/libfslcodec/libfslcodec.inc
require recipes-multimedia/imx-codec/imx-codec.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=3880bb9c943b135a30fad5e8aabd3ee9"

SRC_URI[md5sum] = "c3f0fc78a2bd9124120d7e06fab816f6"
SRC_URI[sha256sum] = "82343ff9a35c6a66d2e1d20e0dabe3ef063f2226282478340da3750ac8d0322d"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6|mx6ul|mx7)"
