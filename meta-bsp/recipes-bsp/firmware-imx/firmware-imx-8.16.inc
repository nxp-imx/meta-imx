# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=dedee5689786754f61ea3a76035c8a81"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "74790ea906f546db850f0962f3f95fa9"
SRC_URI[sha256sum] = "bddbdd4b46cd5a6c87a56e9bed64edf6a536ec91168889a7bad11f72c5bb8286"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
