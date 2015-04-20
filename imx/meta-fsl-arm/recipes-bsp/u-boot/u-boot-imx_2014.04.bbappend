SRCBRANCH = "imx_v2014.04"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "61cec88a59ebf450dd1352d81e03b5aa842e1d71"

COMPATIBLE_MACHINE = "(mx6|mx7)"
