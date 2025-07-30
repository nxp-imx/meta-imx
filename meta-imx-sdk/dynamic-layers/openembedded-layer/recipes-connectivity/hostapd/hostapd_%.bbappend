FILESEXTRAPATHS:prepend:imx-nxp-bsp := "${THISDIR}/${PN}:"

# Use NXP customized version
SRC_URI:remove:imx-nxp-bsp = "http://w1.fi/releases/hostapd-${PV}.tar.gz"
SRC_URI:append:imx-nxp-bsp = " ${FSL_MIRROR}/${BP}-${IMX_SRCREV_ABBREV}.tar.gz"

IMX_SRCREV_ABBREV = "aaa7ec2f"

SRC_URI[sha256sum] = "2eab5e92d21fd11623113f3134b75a391172c3675ff78ba7984bbe1373f12c87"

S = "${WORKDIR}/${BP}-${IMX_SRCREV_ABBREV}"

do_configure:append() {
    # Use NXP defconfig
    install -m 0644 ${B}/hostapd/defconfig ${B}/hostapd/.config
}
