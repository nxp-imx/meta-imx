FILESEXTRAPATHS:prepend:imx := "${THISDIR}/${PN}:"

DEPENDS:append = " readline"

PACKAGECONFIG ??= "openssl"
