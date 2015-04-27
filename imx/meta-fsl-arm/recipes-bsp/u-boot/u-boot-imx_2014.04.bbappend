SRCBRANCH = "imx_v2014.04_3.14.28_7d_alpha"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "714e56947f1df05f93bafda03ce916c6bd0c49bf"

COMPATIBLE_MACHINE = "(mx6|mx7)"
