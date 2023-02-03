LIC_FILES_CHKSUM = "file://LICENSE;md5=fbc093901857fcd118f065f900982c24"

SRC_URI = "${IMXLIB_SRC};branch=${SRCBRANCH}"
IMXLIB_SRC ?= "git://github.com/nxp-imx/imx-lib.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "61227f32bb16fec429c281a20d3e803091b3f8ca"

PLATFORM:mx9-nxp-bsp = "IMX8ULP"

COMPATIBLE_MACHINE = "(mx6-nxp-bsp|mx7-nxp-bsp|mx8ulp-nxp-bsp|mx9-nxp-bsp)"
