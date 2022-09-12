# Copyright 2017,2021 NXP

PV = "5.9+${SRCPV}"

SRCBRANCH = "lf-5.10.52_2.1.0"
IMXLIB_SRC ?= "git://github.com/nxp-imx/imx-lib.git;protocol=https"
SRC_URI = " \
    ${IMXLIB_SRC};branch=${SRCBRANCH} \
"
SRCREV = "87ddd80953835eb29027d1d5a12044a08e809e40" 

PLATFORM_mx8ulp = "IMX8ULP"

do_install_append () {
    # Remove .go file for Android
    find ${D}/ -name *.go -exec rm {} \;
}

COMPATIBLE_MACHINE = "(mx6|mx7|mx8ulp)"
