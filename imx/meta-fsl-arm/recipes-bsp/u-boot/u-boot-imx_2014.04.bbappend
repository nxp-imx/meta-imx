SRCBRANCH = "imx_v2014.04_3.14.38_6qp_beta"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "7c4bee613dc47c9e2fb147a159236bca04b8618b"

COMPATIBLE_MACHINE = "(mx6|mx7)"
