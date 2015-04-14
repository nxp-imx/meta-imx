SRCBRANCH = "imx_3.14.y"
LOCALVERSION = "-6QP_beta"
SRCREV = "5813d8521ca0946d5b3d9bee68b69d1c177c9a58"
KERNEL_SRC ?= "git://git.freescale.com/imx/linux-2.6-imx.git;protocol=git"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"

do_configure_prepend() {
   cp ${S}/arch/arm/configs/imx_v7_defconfig ${B}/.config
   cp ${S}/arch/arm/configs/imx_v7_defconfig ${B}/../defconfig
}

COMPATIBLE_MACHINE = "(mx6|mx7)"
