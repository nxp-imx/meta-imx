# Copyright 2019-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos-2.8.inc

LIC_FILES_CHKSUM_mx8mp = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"
LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a"

SRC_URI[imx8mn.md5sum] = "0c8ff449830a0460aec54d1797b8fd90"
SRC_URI[imx8mn.sha256sum] = "163b760ab0a1c9e695c53a81155c876071352e3dc142249c5bc975520ed41a62"

SRC_URI[imx8mp.md5sum] = "402ee570070c3c10fb5dec9599a88d72"
SRC_URI[imx8mp.sha256sum] = "343ecc380ab549d7d345947d360ef949f90f929e93e4bf504bd4a884756ccf72"

COMPATIBLE_MACHINE = "(mx8mn|mx8mp)"
