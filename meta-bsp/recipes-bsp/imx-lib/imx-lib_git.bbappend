LIC_FILES_CHKSUM = "file://LICENSE;md5=fbc093901857fcd118f065f900982c24"

SRC_URI = "${IMXLIB_SRC};branch=${SRCBRANCH}"
IMXLIB_SRC ?= "git://github.com/nxp-imx/imx-lib.git;protocol=https"
SRCBRANCH = "lf-6.1.1_1.0.0"
SRCREV = "43e5ee7dc4f88d883f8ce2bea309f8708be88a3e"

PLATFORM:mx9-nxp-bsp = "IMX8ULP"

COMPATIBLE_MACHINE = "(mx6-nxp-bsp|mx7-nxp-bsp|mx8ulp-nxp-bsp|mx9-nxp-bsp)"
