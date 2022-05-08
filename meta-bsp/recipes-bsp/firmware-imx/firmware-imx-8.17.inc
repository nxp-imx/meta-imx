# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "9cffa0e5fb0beaa1360c1eb653ad5207"
SRC_URI[sha256sum] = "5155b1372cbe2e035abe3fc9e9c2ac74d70941f13a1aa24aaf4f45813887425e"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
