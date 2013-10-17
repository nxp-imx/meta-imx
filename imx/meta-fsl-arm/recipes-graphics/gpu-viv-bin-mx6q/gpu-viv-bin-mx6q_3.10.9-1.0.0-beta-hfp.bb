# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/gpu-viv-bin-mx6q/gpu-viv-bin-mx6q.inc

SRC_URI[md5sum] = "b1d066f3f2554a788b5b2979b57cc985"
SRC_URI[sha256sum] = "dac0bf03f29a4f7813bb9ffdd64f11cd10bc16d8db1530c99e77987b00f28361"

PACKAGE_FP_TYPE = "hardfp"

RDEPENDS_libgl-mx6-dev = "libgl-mesa-dev"
