LIC_FILES_CHKSUM = "file://LICENSE;md5=fbc093901857fcd118f065f900982c24"

SRC_URI = "${IMXLIB_SRC};branch=${SRCBRANCH}"
IMXLIB_SRC ?= "git://github.com/nxp-imx/imx-lib.git;protocol=https"
SRCBRANCH = "lf-6.12.49_2.2.0"
SRCREV = "72cb12630d42b0efdc30b8e896d0546e69089916"

PLATFORM:mx93-nxp-bsp = "IMX8ULP"
PLATFORM:mx943-nxp-bsp = "IMX8ULP"

COMPATIBLE_MACHINE = "(mx6-nxp-bsp|mx7-nxp-bsp|mx8ulp-nxp-bsp|mx93-nxp-bsp|mx943-nxp-bsp)"
