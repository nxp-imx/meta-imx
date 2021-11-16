SUMMARY = "NXP Wi-Fi SDK for 88w8997 and 88w8987"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://gpl-2.0.txt;md5=ab04ac0f249af12befccb94447c08b77"

# Kernel 5.4
SRCBRANCH = "master"
MRVL_SRC ?= "git://source.codeaurora.org/external/imx/mwifiex.git;protocol=https"
SRC_URI = "${MRVL_SRC};branch=${SRCBRANCH}"
SRCREV = "3c2a3c2cd25e9dce95f34c21bb4e728647eb64ee"

S = "${WORKDIR}/git/mxm_wifiex/wlan_src"

EXTRA_OEMAKE = "KERNELDIR=${STAGING_KERNEL_BUILDDIR}"

RRECOMMENDS:${PN} = "wireless-tools"
