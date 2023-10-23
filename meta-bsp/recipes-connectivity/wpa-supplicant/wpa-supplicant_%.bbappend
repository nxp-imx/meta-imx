FILESEXTRAPATHS:prepend:imx-nxp-bsp := "${THISDIR}/${PN}:"

DEPENDS += "readline"

# Add defconfig for NXP Wi-Fi version
SRC_URI:prepend:imx-nxp-bsp  = "file://defconfig "

do_configure:prepend:imx-nxp-bsp () {
        # Overwrite defconfig with NXP Wi-Fi version
        install -m 0755 ${WORKDIR}/defconfig wpa_supplicant/defconfig

}
