# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=65c483bb431ccd9a1820e6872c604771"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "5040ebb18c19ef4f7c60c5313ec4670d"
SRC_URI[sha256sum] = "cf2845fa6f615b090ceeebce8ebaa141e1782d2b8d2f3fafbf1919d1053d6c33"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
