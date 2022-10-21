SUMMARY = "NXP Wi-Fi SDK for IW612"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://gpl-2.0.txt;md5=ab04ac0f249af12befccb94447c08b77"

SRCBRANCH = "lf-5.15.71_2.2.0"
IW612_SRC ?= "git://github.com/nxp-imx/mwifiex-iw612.git;protocol=https"
SRC_URI = "${IW612_SRC};branch=${SRCBRANCH}"
SRCREV = "4cc2c8831f27c8eceece6b66fc2de8b73360f520" 

S = "${WORKDIR}/git"

EXTRA_OEMAKE = "KERNELDIR=${STAGING_KERNEL_BUILDDIR}"

RRECOMMENDS:${PN} = "wireless-tools"
