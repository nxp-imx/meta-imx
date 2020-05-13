FILESEXTRAPATHS_prepend_imx := "${THISDIR}/${PN}:"

DEPENDS_append = " readline"

PACKAGECONFIG ??= "openssl"
