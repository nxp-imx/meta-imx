SRCBRANCH = "imx_v2014.04_3.14.28_7d_alpha"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "eb8e8bfb2f6fec4b741aa7973348f401ab182065"

COMPATIBLE_MACHINE = "(mx6|mx7)"

