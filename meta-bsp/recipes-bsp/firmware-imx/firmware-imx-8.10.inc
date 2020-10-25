# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "9aeff21e6264d8b69fc2d3943c3dda92"
SRC_URI[sha256sum] = "7e27999ce152b28a28ba9d6215caa7de93c4b2199c0bd059c66cb8f502e89a8a"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
