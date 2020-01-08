require recipes-kernel/kernel-modules/kernel-module-imx-gpu-viv_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

KERNEL_BRANCH ?= "lf-5.4.y"
SRCBRANCH = "${KERNEL_BRANCH}"
LOCALVERSION = "-lts-${KERNEL_BRANCH}"
KERNEL_SRC ?= "git://bitbucket.sw.nxp.com/lfac/linux-lts-nxp.git;protocol=ssh"

SRCREV = "453a0591dcc52a793ae939a971a9c57e5d388c78"
