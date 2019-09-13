require recipes-kernel/linux/linux-imx-headers_4.9.123.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

SRCBRANCH = "imx_4.19.y"
LOCALVERSION = "-1.1.0"
KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"
SRCREV = "36abba8f55078424e037e7f7877e9f22062cccbc"
