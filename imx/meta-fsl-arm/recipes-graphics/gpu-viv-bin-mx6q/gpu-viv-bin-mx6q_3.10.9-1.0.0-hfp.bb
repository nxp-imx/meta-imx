# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/gpu-viv-bin-mx6q/gpu-viv-bin-mx6q.inc

SRC_URI[md5sum] = "f38bd625a2cc49697c7558db7456d784"
SRC_URI[sha256sum] = "95e9d7be47deeaa262e6f1327a5cfc84c61564b0818dc40cf04d685cc8c0e3c4"

PACKAGE_FP_TYPE = "hardfp"

RDEPENDS_libgl-mx6-dev = "libgl-mesa-dev"
