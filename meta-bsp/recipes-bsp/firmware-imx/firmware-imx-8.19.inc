# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=add2d392714d3096ed7e0f7e2190724b"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "814a9e60893143ffc4b4673a9d1cf0f6"
SRC_URI[sha256sum] = "52fb7beaf0045231e5f7d4a049fedde1eaa469a89afad99720f01a0b67bbd358"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
