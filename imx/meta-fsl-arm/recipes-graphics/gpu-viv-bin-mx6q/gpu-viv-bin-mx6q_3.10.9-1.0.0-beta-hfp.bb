# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/gpu-viv-bin-mx6q/gpu-viv-bin-mx6q.inc

SRC_URI[md5sum] = "c8e9bcd81b11ff7e4e39b36f332b984d"
SRC_URI[sha256sum] = "288157b9535661a68eeae54f4e7e97ea54823b8fcacddf041974e108301075e9"

PACKAGE_FP_TYPE = "hardfp"

RDEPENDS_libgl-mx6-dev = "libgl-mesa-dev"
