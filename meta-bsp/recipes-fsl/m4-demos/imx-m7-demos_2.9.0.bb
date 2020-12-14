# Copyright 2019-2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos-2.8.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

SRC_URI[imx8mp.md5sum] = "402ee570070c3c10fb5dec9599a88d72"
SRC_URI[imx8mp.sha256sum] = "343ecc380ab549d7d345947d360ef949f90f929e93e4bf504bd4a884756ccf72"

SRC_URI[imx8mnddr3l.md5sum] = "08f25c70319dee9c328fd6158b8403db"
SRC_URI[imx8mnddr3l.sha256sum] = "b299c886df49da3bc6da99c40bc66b058051661cea49dbe6e176a1743f9223c4"

COMPATIBLE_MACHINE = "(mx8mp|mx8mnlite)"
