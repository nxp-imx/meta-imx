# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=dedee5689786754f61ea3a76035c8a81" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "b7568eb830f3fafde785e476a67654c2"
SRC_URI[sha256sum] = "6cff89485fff698e4f3402fb73fe72f3f7beb93792a87861cfe6a0e5aa68df20"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
