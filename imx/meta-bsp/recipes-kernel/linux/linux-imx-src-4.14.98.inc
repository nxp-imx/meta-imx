LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

SRCBRANCH = "imx_4.14.y"
LOCALVERSION = "-${SRCBRANCH}"
KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"
SRCREV = "2c00c24be5f8b63636e3f9005e15a3de42058438"

S = "${WORKDIR}/git"
