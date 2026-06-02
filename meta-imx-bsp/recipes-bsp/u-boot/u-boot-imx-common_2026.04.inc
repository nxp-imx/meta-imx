DESCRIPTION = "i.MX U-Boot suppporting i.MX reference boards."

LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"

UBOOT_SRC ?= "git://github.com/nxp-imx/uboot-imx.git;protocol=https"
SRCBRANCH = "lf_v2026.04"
LOCALVERSION ?= "-${SRCBRANCH}"
SRCREV = "6eeef838dac4ddbc06ff14450531a95e8c5cb346"

DEPENDS += " \
    bc-native \
    bison-native \
    dtc-native \
    flex-native \
    gnutls-native \
    python3-setuptools-native \
    xxd-native \
"

B = "${WORKDIR}/build"

inherit fsl-u-boot-localversion pkgconfig

BOOT_TOOLS = "imx-boot-tools"
