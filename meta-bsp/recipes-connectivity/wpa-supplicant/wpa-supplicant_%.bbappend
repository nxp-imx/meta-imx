FILESEXTRAPATHS:prepend:imx-nxp-bsp := "${THISDIR}/${PN}:"

DEPENDS += "readline"

# Add defconfig for NXP Wi-Fi version
SRC_URI += "file://defconfig"

do_configure:prepend () {
        # Overwrite defconfig with NXP Wi-Fi version
        install -m 0755 ${WORKDIR}/defconfig wpa_supplicant/defconfig

}
