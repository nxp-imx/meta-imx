SRCBRANCH = "imx_v2014.04_3.14.38_6qp_beta"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "6e9282c2567b2820699fa55d2c6bf0ab78e992d6"

COMPATIBLE_MACHINE = "(mx6|mx7)"
