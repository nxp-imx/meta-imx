require recipes-bsp/u-boot/u-boot-fw-utils_2019.07.bb

SRC_URI = "git://${FSL_ARM_GIT_SERVER}/imx/uboot-imx.git;branch=imx_v2020.04;protocol=ssh"
SRCREV = "5be6af1ccd237f785325f8ffdfa65cd6e2ad7904"

inherit fsl-u-boot-localversion

LOCALVERSION ?= "-${SRCBRANCH}"
