SRCBRANCH = "imx_v2014.04"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "7baadda7f39f8479f3c9d1075c2dee3de94fef3b"

COMPATIBLE_MACHINE = "(mx6|mx7)"
