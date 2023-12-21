# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2023 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "fd4f622c3b0783d9b3e9536f2710e27b"
SRC_URI[sha256sum] = "88ff2167bd274e744140f11a1b8464057e638cc6c11e6d9804874b61c998b3f9"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
