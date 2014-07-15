# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslcodec/libfslcodec.inc

# FIXME: mx6sx do not support vpu
VPU_SUPPORT_mx6sx = "--disable-vpu"
EXTRA_OECONF += "${VPU_SUPPORT}"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "6f41d660de351a6cbc8dabe67e1a4774"
SRC_URI[sha256sum] = "ea135ccb3c8b24c1a73ec8c6085a57e03dc721903a8c717a9b9781030471d5a7"

# FIXME: The wrap and lib names does not match
FILES_${PN}-nb += "${libdir}/imx-mm/audio-codec/wrap/lib_nbamrd_wrap_arm*_elinux.so.*"
FILES_${PN}-wb += "${libdir}/imx-mm/audio-codec/wrap/lib_wbamrd_wrap_arm*_elinux.so.*"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
