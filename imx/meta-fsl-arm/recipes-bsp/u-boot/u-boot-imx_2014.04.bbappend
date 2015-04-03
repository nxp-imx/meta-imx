SRCBRANCH = "imx_v2014.04"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "843c3c54af12cbf20e7bc912178e5a3628b78198"

COMPATIBLE_MACHINE = "(mx6|mx7)"
