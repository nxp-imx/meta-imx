SRCBRANCH = "imx_v2014.04_3.14.38_6qp_beta"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "307dd82d6236dc5ebdc228528e6eaed31e8a2d3d"

COMPATIBLE_MACHINE = "(mx6|mx7)"
