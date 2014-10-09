# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslcodec/libfslcodec.inc

# FIXME: mx6sx do not support vpu
VPU_SUPPORT_mx6sx = "--disable-vpu"
EXTRA_OECONF += "${VPU_SUPPORT}"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "3220fa2f90919dafd5d1e0d026f5fa8a"
SRC_URI[sha256sum] = "54b54fc805a44592dbf9e337a4d76e7c09e0b586e600e8ff33196cd8cb5b8cea"

# FIXME: The wrap and lib names does not match
FILES_${PN}-nb += "${libdir}/imx-mm/audio-codec/wrap/lib_nbamrd_wrap_arm*_elinux.so.*"
FILES_${PN}-wb += "${libdir}/imx-mm/audio-codec/wrap/lib_wbamrd_wrap_arm*_elinux.so.*"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
