SRCBRANCH = "imx_v2014.04_3.14.28_7d_alpha"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "91be24e8e7209e1ed5115da4cc71109fef16a73d"

COMPATIBLE_MACHINE = "(mx6|mx7)"
