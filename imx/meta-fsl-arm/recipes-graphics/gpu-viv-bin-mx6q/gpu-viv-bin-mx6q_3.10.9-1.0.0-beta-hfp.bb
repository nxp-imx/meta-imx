# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/gpu-viv-bin-mx6q/gpu-viv-bin-mx6q.inc

SRC_URI[md5sum] = "0fdde1a4fb851b8ae7fc9d4b6a7c56ab"
SRC_URI[sha256sum] = "bd8869bbfd10cc8fb67c0792a6b8333aab56b2279e17585b81493a1082989927"

PACKAGE_FP_TYPE = "hardfp"

RDEPENDS_libgl-mx6-dev = "libgl-mesa-dev"
