FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

DEPENDS:append:imx-nxp-bsp = " readline"

SRC_URI:remove:imx-nxp-bsp = "http://w1.fi/releases/wpa_supplicant-${PV}.tar.gz \
                              file://0001-macsec_linux-Hardware-offload-requires-Linux-headers.patch \
"

SRC_URI:append:imx-nxp-bsp = " ${FSL_MIRROR}/wpa_supplicant-${PV}-${IMX_SRCREV_ABBREV}.tar.gz"

IMX_SRCREV_ABBREV = "aaa7ec2f"

SRC_URI[sha256sum] = "ef4e49140f158b7f7be21e12b2609ba5901eff56a5b7a1ca936348560a9dbaea"

S = "${WORKDIR}/wpa_supplicant-${PV}-${IMX_SRCREV_ABBREV}"

do_configure:append:imx-nxp-bsp () {
    # Use NXP version of defconfig
    cp wpa_supplicant/defconfig wpa_supplicant/.config
}
