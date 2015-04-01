SRCBRANCH = "imx_v2014.04"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "f0beee980914360c8783406ef8694974467eb07b"

COMPATIBLE_MACHINE = "(mx6|mx7)"
