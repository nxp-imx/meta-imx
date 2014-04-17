# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gpu-viv-bin-mx6q.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}_alpha.tar.gz"
S="${WORKDIR}/${PN}-${PV}_alpha"

SRC_URI[md5sum] = "5ea6423b9924700807dfeb62426fdbf9"
SRC_URI[sha256sum] = "05afc5d4f2f496f5839fe134eb42a1d14b6d55697eead8e1b79ad285209da18d"

PACKAGE_FP_TYPE = "hardfp"
