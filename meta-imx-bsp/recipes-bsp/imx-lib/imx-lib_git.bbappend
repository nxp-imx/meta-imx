LIC_FILES_CHKSUM = "file://LICENSE;md5=fbc093901857fcd118f065f900982c24"

SRC_URI = "${IMXLIB_SRC};branch=${SRCBRANCH}"
IMXLIB_SRC ?= "git://github.com/nxp-imx/imx-lib.git;protocol=https"
SRCBRANCH = "lf-6.6.3_1.0.0"
SRCREV = "8f124c3914d82019849fb697baeb730e4cb1b547" 

PLATFORM:mx93-nxp-bsp = "IMX8ULP"

COMPATIBLE_MACHINE = "(mx6-nxp-bsp|mx7-nxp-bsp|mx8ulp-nxp-bsp|mx93-nxp-bsp)"
