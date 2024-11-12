FILESEXTRAPATHS:prepend:imx-nxp-bsp := "${THISDIR}/${PN}:"

SRC_URI:append:imx-nxp-bsp = " file://hostapd-Update-defconfig-based-on-v2.11-version.patch"

do_configure:append() {
    install -m 0644 ${B}/hostapd/defconfig ${B}/hostapd/.config
}
