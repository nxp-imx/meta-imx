SRCBRANCH = "imx_v2014.04_3.14.28_7d_alpha"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "97261ac3ee8e46929a123c9a4e5cbe935f90cdcb"

COMPATIBLE_MACHINE = "(mx6|mx7)"
