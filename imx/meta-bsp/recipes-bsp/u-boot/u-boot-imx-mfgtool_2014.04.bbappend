SRCBRANCH = "imx_v2014.04_3.14.38_6qp_beta"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "046e55efa686f40b4cad312e1e64348f19107bd9"

COMPATIBLE_MACHINE = "(mx6|mx7)"

