SUMMARY = "Tools for the Linux Standard Wireless Extension Subsystem"
HOMEPAGE = "https://hewlettpackard.github.io/wireless-tools/Tools.html"
LICENSE = "GPLv2 & (LGPLv2.1 | MPL-1.1 | BSD)"
LIC_FILES_CHKSUM = "file://LICENCE.cypress;md5=cbc5f665d04f741f1e006d2096236ba7"
SECTION = "base"

DEPENDS = "libnl"

SRC_URI = "git://github.com/murata-wireless/cyw-fmac-utils-imx32;protocol=git;branch=battra;"
SRCREV = "060688dfe76df98751207c8146268ce7fd80b6ab"

SRC_URI_mx8 = "git://github.com/murata-wireless/cyw-fmac-utils-imx64;protocol=git;branch=battra;"
SRCREV_mx8 = "70dc6eed906fe812a0258f151d1dea338bc63fa7"

S = "${WORKDIR}/git"

do_install() {
	install -d ${D}${sbindir}
	install -m 0755 ${S}/wl ${D}${sbindir}/
}
