# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI += " file://Stop-using-Git-to-write-local-version.patch \
             file://rc.autohdmi"

SRC_URI[md5sum] = "562381adae7b733bc8ecc6bf283aad5b"
SRC_URI[sha256sum] = "1767689687655bc9484109f9c6646029a9e321922ee19d3aae527faf8475c618"

RDEPENDS_${PN}_remove = "libvivante-dri-mx6"

RDEPENDS_${PN}_append = " libvivante-dri-imx"

COMPATIBLE_MACHINE = "(mx6|mx8)"
