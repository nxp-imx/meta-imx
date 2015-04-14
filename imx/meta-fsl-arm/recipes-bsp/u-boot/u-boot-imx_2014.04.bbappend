SRCBRANCH = "imx_v2014.04_3.14.28_7d_alpha"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "ff62c5b275a9b5e47d570d3eb10622799bf12070"

COMPATIBLE_MACHINE = "(mx6|mx7)"
