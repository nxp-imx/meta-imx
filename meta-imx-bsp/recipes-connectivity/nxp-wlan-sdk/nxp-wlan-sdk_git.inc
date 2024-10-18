SUMMARY = "NXP Wi-Fi SDK for module 88w8801/8987/8997/9098 and IW416/612"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=ab04ac0f249af12befccb94447c08b77"

# For Kernel 5.4 and later
SRCBRANCH = "master"
MRVL_SRC ?= "git://github.com/nxp-imx/mwifiex.git;protocol=https"
SRC_URI = "${MRVL_SRC};branch=${SRCBRANCH}"
SRCREV = "89c9f522e1a5bf80360274b8e92db4c08bb8c959"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = "KERNELDIR=${STAGING_KERNEL_BUILDDIR}"

RDEPENDS:${PN} = "wireless-tools"
