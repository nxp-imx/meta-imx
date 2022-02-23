FILESEXTRAPATHS:prepend:imx-nxp-bsp := "${THISDIR}/${PN}:"

DEPENDS:append = " readline"

PACKAGECONFIG ??= "openssl"
