SRCBRANCH = "imx_v2014.04"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "5ae1cb9d8e7cd7babd1d7ef7f2303664a4e15c26"

COMPATIBLE_MACHINE = "(mx6|mx7)"
