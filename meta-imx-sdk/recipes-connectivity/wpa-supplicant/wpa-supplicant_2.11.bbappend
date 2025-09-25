FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

DEPENDS:append:imx-nxp-bsp = " readline"

SRC_URI:remove:imx-nxp-bsp = "http://w1.fi/releases/wpa_supplicant-${PV}.tar.gz \
                              file://0001-macsec_linux-Hardware-offload-requires-Linux-headers.patch \
"

SRC_URI:append:imx-nxp-bsp = " ${FSL_MIRROR}/wpa_supplicant-${PV}-${IMX_SRCREV_ABBREV}.tar.gz"
IMX_SRCREV_ABBREV = "aaa7ec2f"
SRC_URI[sha256sum] = "10d31e37d6d08a7d383e907aac252895d42518e9cd53d122d6591e08f0f1cd87"

S = "${WORKDIR}/wpa_supplicant-${PV}-${IMX_SRCREV_ABBREV}"

do_configure:append:imx-nxp-bsp () {
    # Use NXP version of defconfig
    cp wpa_supplicant/defconfig wpa_supplicant/.config
}
