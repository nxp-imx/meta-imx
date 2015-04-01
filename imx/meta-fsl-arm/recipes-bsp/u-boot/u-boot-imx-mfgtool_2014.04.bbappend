SRCBRANCH = "imx_v2014.04"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "7784504f41d5bd39f965022a5d27dbfb2e45ed03"

COMPATIBLE_MACHINE = "(mx6|mx7)"

