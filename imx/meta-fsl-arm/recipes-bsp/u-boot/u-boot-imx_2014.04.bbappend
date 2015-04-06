SRCBRANCH = "imx_v2014.04_3.14.28_7d_alpha"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "8e9df11d2aba0e158a18af523df1792fee6dc19c"

COMPATIBLE_MACHINE = "(mx6|mx7)"
