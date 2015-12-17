# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

#require recipes-multimedia/libfslcodec/libfslcodec.inc
require recipes-multimedia/imx-codec/imx-codec.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=3880bb9c943b135a30fad5e8aabd3ee9"

SRC_URI[md5sum] = "12787b1403d9d1636e33f14a975ae7c3"
SRC_URI[sha256sum] = "ef5b89aecc363833c59e6030964c95fa85f26cc731b3bbb290878e392f56da05"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6|mx6ul|mx7)"
