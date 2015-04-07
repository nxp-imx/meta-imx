SRCBRANCH = "imx_v2014.04_3.14.28_7d_alpha"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "581aa86581bb1178c5df4ad5298e5b85c53f1186"

COMPATIBLE_MACHINE = "(mx6|mx7)"
