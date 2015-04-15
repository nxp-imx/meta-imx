SRCBRANCH = "imx_v2014.04"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "1874cec3a70adde2ea911a9c155fb41c43ccab61"

COMPATIBLE_MACHINE = "(mx6|mx7)"

