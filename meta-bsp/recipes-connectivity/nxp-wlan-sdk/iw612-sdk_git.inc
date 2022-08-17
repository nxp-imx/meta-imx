SUMMARY = "NXP Wi-Fi SDK for IW612"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://gpl-2.0.txt;md5=ab04ac0f249af12befccb94447c08b77"

SRCBRANCH = "lf-5.15.52_2.1.0"
IW612_SRC ?= "git://github.com/nxp-imx/mwifiex-iw612.git;protocol=https"
SRC_URI = "${IW612_SRC};branch=${SRCBRANCH}"
SRCREV = "b9251c7750afc1dbcdfa67f1f66f622123b5439b"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = "KERNELDIR=${STAGING_KERNEL_BUILDDIR}"

RRECOMMENDS:${PN} = "wireless-tools"
