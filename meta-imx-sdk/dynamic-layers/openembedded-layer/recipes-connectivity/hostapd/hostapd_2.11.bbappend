FILESEXTRAPATHS:prepend:imx-nxp-bsp := "${THISDIR}/${PN}:"

# Use NXP customized version
SRC_URI:remove:imx-nxp-bsp = "http://w1.fi/releases/hostapd-${PV}.tar.gz"
SRC_URI:append:imx-nxp-bsp = " ${FSL_MIRROR}/${BP}-${IMX_SRCREV_ABBREV}.tar.gz"
IMX_SRCREV_ABBREV = "aaa7ec2f"
SRC_URI[sha256sum] = "ab676882b4b6915b006c18c105d90b053c18bb74e606ba6aab167d6c3667239c"

S = "${WORKDIR}/${BP}-${IMX_SRCREV_ABBREV}"

do_configure:append() {
    # Use NXP defconfig
    install -m 0644 ${B}/hostapd/defconfig ${B}/hostapd/.config
}
