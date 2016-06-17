# Copyright (C) 2013-2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "9cee94c3aa0dc5a43286fec8180a810e"
SRC_URI[sha256sum] = "b355480743c142d3e59c4eb56dc82d190806c0c5af0589938e233910ba1057ec"

PACKAGE_FP_TYPE = "hardfp"

COMPATIBLE_MACHINE = "(mx8)"
