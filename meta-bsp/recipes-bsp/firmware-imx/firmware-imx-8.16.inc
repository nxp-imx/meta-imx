# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "8cc1b66dd505a489e40a695489717dce"
SRC_URI[sha256sum] = "e1163b0d0ca243b7177a19439827fa1e7bf155c4268170e587fbc9ad15679d96"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
