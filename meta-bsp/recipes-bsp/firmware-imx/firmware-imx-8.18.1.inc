# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=673fa34349fa40f59e0713cb0ac22b1f"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "5e59c924abd5725f4e4be53eb1464297"
SRC_URI[sha256sum] = "551d6aa2c8b17388073cd00523c083ae8a412a958c91c10a6aff579b44fd9212"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
