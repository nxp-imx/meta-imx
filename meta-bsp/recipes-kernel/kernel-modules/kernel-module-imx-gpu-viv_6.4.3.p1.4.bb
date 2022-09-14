require recipes-kernel/kernel-modules/kernel-module-imx-gpu-viv_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRCBRANCH = "imx_5.4.70_2.3.0"
LOCALVERSION = "-2.3.2"
KERNEL_SRC ?= "git://github.com/nxp-imx/linux-imx.git;protocol=https"

SRCREV = "13b3c469663da0c79d385ce15887f6b5805f060d"
