# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslcodec/libfslcodec.inc

# FIXME: mx6sx do not support vpu
VPU_SUPPORT_mx6sx = "--disable-vpu"
EXTRA_OECONF += "${VPU_SUPPORT}"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "4ecd728e406f00acb5044389adbfd43b"
SRC_URI[sha256sum] = "8a01fede0cadb5757c3e00fb18475d81468db3d1e623a354fcea80b71c31ece3"

# FIXME: The wrap and lib names does not match
FILES_${PN}-nb += "${libdir}/imx-mm/audio-codec/wrap/lib_nbamrd_wrap_arm*_elinux.so.*"
FILES_${PN}-wb += "${libdir}/imx-mm/audio-codec/wrap/lib_wbamrd_wrap_arm*_elinux.so.*"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
