# Copyright (C) 2012-2016 O.S. Systems Software LTDA.
# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP

DEPENDS:append = " freetype"
DEPENDS:append:mx8ulp-nxp-bsp = " imx-lib"
DEPENDS:append:mx9-nxp-bsp = " imx-lib"

SRCBRANCH = "lf-5.15.52_2.1.0"
IMXTEST_SRC ?= "git://github.com/nxp-imx/imx-test.git;protocol=https"
SRC_URI = " \
    ${IMXTEST_SRC};branch=${SRCBRANCH} \
    file://memtool_profile \
"
SRCREV = "d28d575dfc586d120c5899481c537f58733b68c0"

PLATFORM:mx8ulp-nxp-bsp = "IMX8ULP"
PLATFORM:mx9-nxp-bsp = "IMX8ULP"
