FILESEXTRAPATHS:prepend:imx-nxp-bsp := "${THISDIR}/${PN}:"

# The meta-oe layer manages a copy of defconfig. For our customization here,
# we patch and use the source version instead.
SRC_URI:append:imx-nxp-bsp = " file://hostapd-Update-defconfig-based-on-v2.11-version.patch"

do_configure:append() {
    install -m 0644 ${B}/hostapd/defconfig ${B}/hostapd/.config
}
