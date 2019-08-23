# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "455c2512f24b268eb216bc23bc00380a"
SRC_URI[sha256sum] = "51172b96b9a8422848681ec88d0ab6a63321be8dfc8f785362346cf67ebc46fd"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
