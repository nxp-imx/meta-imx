FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append:imx-nxp-bsp = " file://audmix-8ch.conf"

do_install:append:imx-nxp-bsp () {
    # Install nxp configure file to /usr/share/wireplumber/wireplumber.conf.d
    install -m 0644 ${UNPACKDIR}/audmix-8ch.conf ${D}${datadir}/wireplumber/wireplumber.conf.d
}
