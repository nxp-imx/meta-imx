# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "d72ac7280a982dd906cde7627970e3e5"
SRC_URI[sha256sum] = "a41881f5ad29fdc879cc23dd3ff744ea7fd5c56d81ae8ba1a08b9d6e281027a5"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
