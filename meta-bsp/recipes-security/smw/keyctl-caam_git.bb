# Copyright 2020 NXP

SUMMARY = "NXP i.MX CAAM Keyctl"
DESCRIPTION = "NXP i.MX keyctl tool to manage CAAM Keys"
SECTION = "base"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=8636bd68fc00cc6a3809b7b58b45f982"

SRCBRANCH = "imx_5.4.47_2.2.0"
KEYCTL_CAAM_SRC ?= "git://source.codeaurora.org/external/imx/keyctl_caam.git;protocol=https"
SRC_URI = "${KEYCTL_CAAM_SRC};branch=${SRCBRANCH}"

SRCREV = "be3326eacd11500c54a3c69bf0b7652a46267ea0"

S = "${WORKDIR}/git"

TARGET_CC_ARCH += "${LDFLAGS}"

do_install () {
	oe_runmake DESTDIR=${D} install
}

COMPATIBLE_MACHINE = "(imx)"

