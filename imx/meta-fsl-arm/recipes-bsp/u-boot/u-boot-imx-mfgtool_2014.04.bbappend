SRCBRANCH = "imx_v2014.04_3.14.38_6qp_beta"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "814efa43d22de4b05195889260914136763013e9"

COMPATIBLE_MACHINE = "(mx6|mx7)"

