DESCRIPTION = "i.MX U-Boot suppporting i.MX reference boards."

LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

UBOOT_SRC ?= "git://github.com/nxp-imx/uboot-imx.git;protocol=https"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCBRANCH = "lf_v2023.04"
LOCALVERSION ?= "-${SRCBRANCH}"
SRCREV = "8489b0f14d4d80c08bb8b8b9fd94fe91ff1fd47d"

DEPENDS += " \
    bc-native \
    bison-native \
    dtc-native \
    flex-native \
    gnutls-native \
    xxd-native \
"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

inherit fsl-u-boot-localversion

BOOT_TOOLS = "imx-boot-tools"
