SRCBRANCH = "lf-5.15.32_2.0.0"
IMXLIB_SRC ?= "git://github.com/nxp-imx/imx-lib.git;protocol=https"
SRC_URI = "${IMXLIB_SRC};branch=${SRCBRANCH}"
SRCREV = "87ddd80953835eb29027d1d5a12044a08e809e40" 

PLATFORM:mx9-nxp-bsp = "IMX8ULP"

COMPATIBLE_MACHINE = "(mx6-nxp-bsp|mx7-nxp-bsp|mx8ulp-nxp-bsp|mx9-nxp-bsp)"
