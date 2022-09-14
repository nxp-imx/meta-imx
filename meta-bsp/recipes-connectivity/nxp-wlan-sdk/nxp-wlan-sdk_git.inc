SUMMARY = "NXP Wi-Fi SDK for 88w8997 and 88w8987"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://gpl-2.0.txt;md5=ab04ac0f249af12befccb94447c08b77"

# For Kernel 5.4 and later
SRCBRANCH = "master"
MRVL_SRC ?= "git://github.com/nxp-imx/mwifiex.git;protocol=https"
SRC_URI = "${MRVL_SRC};branch=${SRCBRANCH}"
SRCREV = "fb098b07fc2613ce2cfc2b113b5d2af2a900ef2d"

S = "${WORKDIR}/git/mxm_wifiex/wlan_src"

EXTRA_OEMAKE = "KERNELDIR=${STAGING_KERNEL_BUILDDIR}"

RDEPENDS:${PN} = "wireless-tools"
