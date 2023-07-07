DESCRIPTION = "i.MX U-Boot suppporting i.MX reference boards."

LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH} \
           file://0001-LFU-542-6-imx91p_evk-Fix-syntax-error.patch"
UBOOT_SRC ?= "git://github.com/nxp-imx/uboot-imx.git;protocol=https"
SRCBRANCH = "lf_v2023.04"
LOCALVERSION ?= "-${SRCBRANCH}"
SRCREV = "382b0536a1fdbc3ef4a8c076aa5cdb9f886d2611"

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
