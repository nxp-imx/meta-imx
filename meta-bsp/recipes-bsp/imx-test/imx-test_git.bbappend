# Copyright (C) 2012-2016 O.S. Systems Software LTDA.
# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP

DEPENDS:append = " freetype"
DEPENDS:append:mx8ulp-nxp-bsp = " imx-lib"
DEPENDS:append:mx9-nxp-bsp = " imx-lib"

SRCBRANCH = "master"
IMXTEST_SRC ?= "git://source.codeaurora.org/external/imx/imx-test.git;protocol=https"
SRC_URI = " \
    ${IMXTEST_SRC};branch=${SRCBRANCH} \
    file://memtool_profile \
"
SRCREV = "4ce851ee907d8a5a706f95b34a28e75eec3f1445"

PLATFORM:mx8ulp-nxp-bsp = "IMX8ULP"
PLATFORM:mx9-nxp-bsp = "IMX8ULP"
