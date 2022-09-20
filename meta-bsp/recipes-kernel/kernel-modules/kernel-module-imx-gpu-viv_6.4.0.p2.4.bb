require recipes-kernel/kernel-modules/kernel-module-imx-gpu-viv_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRCBRANCH = "imx_5.4.24_2.1.0"
LOCALVERSION = "-2.1.0"
KERNEL_SRC ?= "git://github.com/nxp-imx/linux-imx.git;protocol=https"

SRCREV = "2f6f3e92a82e51fe39b53ee758273bef26964836"
