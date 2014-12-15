# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslcodec/libfslcodec.inc

# FIXME: mx6sx do not support vpu
VPU_SUPPORT_mx6sx = "--disable-vpu"
EXTRA_OECONF += "${VPU_SUPPORT}"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "a89ffc781292c56d4664f1ec67331243"
SRC_URI[sha256sum] = "d5baa92fefe68f7456380172fefc14ec9e4c155e1d2f6672c23bc5e06841bd1a"

# FIXME: The wrap and lib names does not match
FILES_${PN}-nb += "${libdir}/imx-mm/audio-codec/wrap/lib_nbamrd_wrap_arm*_elinux.so.*"
FILES_${PN}-wb += "${libdir}/imx-mm/audio-codec/wrap/lib_wbamrd_wrap_arm*_elinux.so.*"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
