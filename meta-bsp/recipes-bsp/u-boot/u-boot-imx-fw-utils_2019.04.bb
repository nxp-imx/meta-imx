require recipes-bsp/u-boot/u-boot-fw-utils_2019.07.bb

SRC_URI = "git://${FSL_ARM_GIT_SERVER}/imx/uboot-imx.git;branch=imx_v2019.04;protocol=ssh"
SRCREV = "1018252a576697e8f80ab78a1dcb15f1866e1fb8"

inherit fsl-u-boot-localversion

LOCALVERSION ?= "-${SRCBRANCH}"
