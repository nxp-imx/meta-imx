SRCBRANCH = "imx_v2014.04"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "02e7090604e55d9690532294b02b499609d46e63"

COMPATIBLE_MACHINE = "(mx6|mx7)"

