# Copyright 2017,2021 NXP

PV = "5.9+${SRCPV}"

SRCBRANCH = "lf-5.15.5_1.0.0"
IMXLIB_SRC ?= "git://source.codeaurora.org/external/imx/imx-lib.git;protocol=https"
SRC_URI = " \
    ${IMXLIB_SRC};branch=${SRCBRANCH} \
"
SRCREV = "87ddd80953835eb29027d1d5a12044a08e809e40" 

PLATFORM:mx8ulp = "IMX8ULP"

do_install:append () {
    # Remove .go file for Android
    find ${D}/ -name *.go -exec rm {} \;
}

COMPATIBLE_MACHINE = "(mx6|mx7|mx8ulp)"
