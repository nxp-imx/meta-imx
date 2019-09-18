require recipes-kernel/linux/linux-imx-headers_4.9.123.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

SRCBRANCH = "imx_4.19.35_1.1.0"
LOCALVERSION = "-1.1.0"
KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"
SRCREV = "a51dda8feec03e8c675230786d64ee050944dbfd"

IMX_UAPI_HEADERS_remove = "version.h"
