SRCBRANCH = "imx_v2014.04_3.14.38_6qp_beta"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "5d3d305c2ec0128719a2e7f5e7b2cc37cf4e7da6"

COMPATIBLE_MACHINE = "(mx6|mx7)"

