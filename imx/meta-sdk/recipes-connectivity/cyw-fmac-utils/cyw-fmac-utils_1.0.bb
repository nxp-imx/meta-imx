SUMMARY = "Tools for the Linux Standard Wireless Extension Subsystem"
HOMEPAGE = "https://hewlettpackard.github.io/wireless-tools/Tools.html"
LICENSE = "GPLv2 & (LGPLv2.1 | MPL-1.1 | BSD)"
LIC_FILES_CHKSUM = "file://LICENCE.cypress;md5=cbc5f665d04f741f1e006d2096236ba7"
SECTION = "base"

DEPENDS = "libnl"

SRC_URI = "git://github.com/murata-wireless/cyw-fmac-utils-imx32;protocol=git;branch=manda;"
SRCREV = "b1cbd9170dd96ac73102aeee5d73b11575e1028a"

SRC_URI_mx8 = "git://github.com/murata-wireless/cyw-fmac-utils-imx64;protocol=git;branch=manda;"
SRCREV_mx8 = "6848dc6c805a29ff2a297d99557b8c875342cd57"

S = "${WORKDIR}/git"

do_install() {
	install -d ${D}${sbindir}
	install -m 0755 ${S}/wl ${D}${sbindir}/
}
