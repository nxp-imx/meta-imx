SRCBRANCH = "imx_v2014.04"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "f5d5f07fba936c4bb05c887de9d72fb75b3dc0f2"

COMPATIBLE_MACHINE = "(mx6|mx7)"

