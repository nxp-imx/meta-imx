# Copyright 2017-2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829" 

SRC_URI[imx8mm.md5sum] = "0dcfefa043e7900e28399bbdcd9a4c6d"
SRC_URI[imx8mm.sha256sum] = "50038a2bb8389c1cce2abd97107480ed146826c6cae1402ebeadd49793ca62b9"

SRC_URI[imx8mq.md5sum] = "4a7924be3d8d2d72411fcfcbca8ed86a"
SRC_URI[imx8mq.sha256sum] = "46d68353b58929dadae732fbe058fe9af0ee7ea0a6bf8c6cec4b0a0ffd886173"

COMPATIBLE_MACHINE = "(mx8mm-nxp-bsp|mx8mq-nxp-bsp)"
