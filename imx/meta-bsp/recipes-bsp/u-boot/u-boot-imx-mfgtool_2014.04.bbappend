SRCBRANCH = "imx_v2014.04_3.14.38_6qp_beta"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "053dda1f184cf31472444fcdcf6b0543a40aa193"

COMPATIBLE_MACHINE = "(mx6|mx7)"

