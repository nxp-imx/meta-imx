# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "483fecf2c5bcf005a4ee9ed854c3becc"
SRC_URI[sha256sum] = "b48da02745d4b220c1a93aa9d2c2db310436bacbf4eacb9b14d0ed7b5804232c"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
