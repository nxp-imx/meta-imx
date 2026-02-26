FILESEXTRAPATHS:prepend:imx-nxp-bsp := "${THISDIR}/${PN}:"

# Use NXP customized version
SRC_URI:remove:imx-nxp-bsp = "http://w1.fi/releases/hostapd-${PV}.tar.gz"
SRC_URI:append:imx-nxp-bsp = " ${FSL_MIRROR}/${BP}-${IMX_SRCREV_ABBREV}.tar.gz"
IMX_SRCREV_ABBREV = "5a91f311"
SRC_URI[sha256sum] = "0912de3a04129b907b54495da5c7827a0b4acd068316385adec7e3aa391436cd"

S = "${UNPACKDIR}/${BP}-${IMX_SRCREV_ABBREV}"

do_configure:append() {
    # Use NXP defconfig
    install -m 0644 ${B}/hostapd/defconfig ${B}/hostapd/.config
}
