# Copyright (C) 2012-2016 O.S. Systems Software LTDA.
# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP

SRCBRANCH = "master"
IMXTEST_SRC ?= "git://source.codeaurora.org/external/imx/imx-test.git;protocol=https"
SRC_URI = " \
    ${IMXTEST_SRC};branch=${SRCBRANCH} \
    file://memtool_profile \
"
SRCREV = "068ae5f205797d98fb3010a12541eacdec17de80"

PACKAGECONFIG:append:mx8m = " swpdm"
