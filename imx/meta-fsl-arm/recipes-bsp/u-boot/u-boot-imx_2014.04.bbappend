SRCBRANCH = "imx_v2014.04"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "d860559f7913f16f7cb248f7b44140e8c1aa3ee9"

COMPATIBLE_MACHINE = "(mx6|mx7)"
