# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "86967a806216b0ab85709a1ee71da493"
SRC_URI[sha256sum] = "2afb8efab6a6e788fe9adae3ea4cf68d9159c64c2ac84edbc3cdf19dbae53d2d"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
