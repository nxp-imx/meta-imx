# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslcodec/libfslcodec.inc

# FIXME: mx6sx do not support vpu
VPU_SUPPORT_mx6sx = "--disable-vpu"
EXTRA_OECONF += "${VPU_SUPPORT}"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "76c3775e0f42abd6fc5d71c614e07e75"
SRC_URI[sha256sum] = "30d19e792d3e402c640e85eca4c048147008761f0e3349928c56f97c690855da"

# FIXME: The wrap and lib names does not match
FILES_${PN}-nb += "${libdir}/imx-mm/audio-codec/wrap/lib_nbamrd_wrap_arm*_elinux.so.*"
FILES_${PN}-wb += "${libdir}/imx-mm/audio-codec/wrap/lib_wbamrd_wrap_arm*_elinux.so.*"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
