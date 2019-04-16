LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

SRCBRANCH = "imx_4.19.y"
LOCALVERSION = "-${SRCBRANCH}"
KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"
SRCREV = "476ae5a612afd1b2959885b7fd3ca5f65eb83f92"

S = "${WORKDIR}/git"

SRC_URI += "file://0001-mtd.h-Fix-build-break-bring-4.14-version-for-4.19-te.patch"
