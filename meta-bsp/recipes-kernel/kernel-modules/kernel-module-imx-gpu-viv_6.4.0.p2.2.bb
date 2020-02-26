require recipes-kernel/kernel-modules/kernel-module-imx-gpu-viv_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRCBRANCH = "imx_5.4.y"
LOCALVERSION = "-2.0.0"
KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https"

SRCREV = "fbd278ab7f1d866f0c27603f68cc547d6ae1d8f9"
