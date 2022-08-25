SUMMARY = "NXP Wi-Fi SDK for 88w8997 and 88w8987"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://gpl-2.0.txt;md5=ab04ac0f249af12befccb94447c08b77"

# For Kernel 5.4 and later
SRCBRANCH = "lf-5.15.52_2.1.0"
MRVL_SRC ?= "git://github.com/nxp-imx/mwifiex.git;protocol=https"
SRC_URI = "${MRVL_SRC};branch=${SRCBRANCH}"
SRCREV = "30f40263ebb924e80ebb9e8a117f1102e877ff97"

S = "${WORKDIR}/git/mxm_wifiex/wlan_src"

EXTRA_OEMAKE = "KERNELDIR=${STAGING_KERNEL_BUILDDIR}"

RRECOMMENDS:${PN} = "wireless-tools"
