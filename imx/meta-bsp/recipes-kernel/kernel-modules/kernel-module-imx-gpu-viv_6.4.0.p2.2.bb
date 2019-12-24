require recipes-kernel/kernel-modules/kernel-module-imx-gpu-viv_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRCBRANCH = "imx_5.4.y"
LOCALVERSION = "1.1.0"
KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https"

SRCREV = "7ec1ff2b8a858c178b615f4d558a55713781168a"
