# Copyright (C) 2012-2016 O.S. Systems Software LTDA.
# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP

SRCBRANCH = "lf-5.10.52_2.1.0"
IMXTEST_SRC ?= "git://github.com/nxp-imx/imx-test.git;protocol=https"
SRC_URI = " \
    ${IMXTEST_SRC};branch=${SRCBRANCH} \
    file://memtool_profile \
"
SRCREV = "2dcb987a91183770f328258b424d9ad2fdfdc17a" 

PACKAGECONFIG_append_mx8m = " swpdm"
