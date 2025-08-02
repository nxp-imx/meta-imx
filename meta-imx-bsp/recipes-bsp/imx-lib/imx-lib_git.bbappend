LIC_FILES_CHKSUM = "file://LICENSE;md5=fbc093901857fcd118f065f900982c24"

SRC_URI = "${IMXLIB_SRC};branch=${SRCBRANCH}"
IMXLIB_SRC ?= "git://github.com/nxp-imx/imx-lib.git;protocol=https"
SRCBRANCH = "lf-6.12.34_2.1.0"
SRCREV = "36ac3833badc62bd59eec4c33535c95805da7cd2"

PLATFORM:mx93-nxp-bsp = "IMX8ULP"
PLATFORM:mx943-nxp-bsp = "IMX8ULP"

COMPATIBLE_MACHINE = "(mx6-nxp-bsp|mx7-nxp-bsp|mx8ulp-nxp-bsp|mx93-nxp-bsp|mx943-nxp-bsp)"
