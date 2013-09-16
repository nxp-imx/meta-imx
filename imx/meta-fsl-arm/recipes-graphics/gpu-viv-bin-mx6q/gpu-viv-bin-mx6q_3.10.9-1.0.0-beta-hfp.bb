# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/gpu-viv-bin-mx6q/gpu-viv-bin-mx6q.inc

SRC_URI[md5sum] = "63c8ef3881735e4763da7de24737d3c0"
SRC_URI[sha256sum] = "a3f1679abe8dde7a5ecacbb003b18b210458494c739d16e29ca6a8c991ebdeda"

PACKAGE_FP_TYPE = "hardfp"

RDEPENDS_libgl-mx6-dev = "libgl-mesa-dev"
