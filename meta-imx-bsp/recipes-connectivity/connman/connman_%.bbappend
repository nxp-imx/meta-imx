FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

# Replace RRECOMMENDS as weak depends would not install package
RDEPENDS:${PN}:append:mx943-nxp-bsp = " connman-conf"
