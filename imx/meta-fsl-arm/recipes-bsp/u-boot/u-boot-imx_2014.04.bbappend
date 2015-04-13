SRCBRANCH = "imx_v2014.04"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "ed53487d36a886fb4557088804a4b5232b168889"

COMPATIBLE_MACHINE = "(mx6|mx7)"
