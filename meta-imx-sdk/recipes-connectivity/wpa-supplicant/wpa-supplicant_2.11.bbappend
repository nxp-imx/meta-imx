FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

DEPENDS:append:imx-nxp-bsp = " readline"

SRC_URI:remove:imx-nxp-bsp = "http://w1.fi/releases/wpa_supplicant-${PV}.tar.gz \
                              file://0001-macsec_linux-Hardware-offload-requires-Linux-headers.patch \
"
SRC_URI:remove = "file://0002-defconfig-Update-Opportunistic-Wireless-Encryption-O.patch \
                  file://0004-defconfig-Uncomment-CONFIG_IEEE80211BE-y.patch"

SRC_URI:append:imx-nxp-bsp = " ${FSL_MIRROR}/wpa_supplicant-${PV}-${IMX_SRCREV_ABBREV}.tar.gz"
IMX_SRCREV_ABBREV = "5a91f311"
SRC_URI[sha256sum] = "124adb28bc96d94850a9eeb1c325a44acfccd33364f680aeaecc497503e8fa78"

S = "${UNPACKDIR}/wpa_supplicant-${PV}-${IMX_SRCREV_ABBREV}"

do_configure:append:imx-nxp-bsp () {
    # Use NXP version of defconfig
    cp wpa_supplicant/defconfig wpa_supplicant/.config
}
