FILESEXTRAPATHS:prepend:imx-nxp-bsp := "${THISDIR}/${PN}:"

DEPENDS:append:imx-nxp-bsp = " readline"

# Add defconfig for NXP Wi-Fi version
SRC_URI:append:imx-nxp-bsp = " file://defconfig"

do_configure:prepend:imx-nxp-bsp() {
        # Overwrite defconfig with NXP Wi-Fi version
        install -m 0755 ${WORKDIR}/defconfig wpa_supplicant/defconfig

}
