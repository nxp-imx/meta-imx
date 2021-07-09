# Copyright 2017,2021 NXP

PV = "5.9+${SRCPV}"

SRCBRANCH = "master"
IMXLIB_SRC ?= "git://source.codeaurora.org/external/imx/imx-lib.git;protocol=https"
SRC_URI = " \
    ${IMXLIB_SRC};branch=${SRCBRANCH} \
"
SRCREV = "7fc444875901ab4ee43407176b158b846842c3bf"

PLATFORM_mx8ulp = "IMX8ULP"

do_install_append () {
    # Remove .go file for Android
    find ${D}/ -name *.go -exec rm {} \;
}

COMPATIBLE_MACHINE = "(mx6|mx7|mx8ulp)"
