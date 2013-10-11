# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/gpu-viv-bin-mx6q/gpu-viv-bin-mx6q.inc

SRC_URI[md5sum] = "e5d62e3186dd087fe2b099794cc8fe1a"
SRC_URI[sha256sum] = "ffd479b6336196e0134024540d4fd6d2ced8b0246b131424afd4838a04bdcdf7"

PACKAGE_FP_TYPE = "hardfp"

RDEPENDS_libgl-mx6-dev = "libgl-mesa-dev"
