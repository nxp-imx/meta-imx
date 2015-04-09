SRCBRANCH = "imx_v2014.04_3.14.28_7d_alpha"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "ca20aa7ca0c21b9766e0c34cfec275aaab0f11e7"

COMPATIBLE_MACHINE = "(mx6|mx7)"

