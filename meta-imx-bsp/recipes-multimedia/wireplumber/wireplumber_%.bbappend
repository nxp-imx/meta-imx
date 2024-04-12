FILESEXTRAPATHS:prepend := "${THISDIR}/imx-nxp-bsp:"

SRC_URI:append:imx-nxp-bsp = " file://51-bluez-imx.conf \
                               file://0001-wpctl-fix-set-default-Segmentation-fault-on-32bit-pl.patch \
                             "

do_install:append() {

    install -d ${D}${datadir}

    # Install 51-bluez-imx.conf to /usr/share/wireplumber/wireplumber.conf.d
    install -d ${D}${datadir}/wireplumber/wireplumber.conf.d
    install -m 0755 ${WORKDIR}/51-bluez-imx.conf ${D}${datadir}/wireplumber/wireplumber.conf.d
}

FILES:${PN}:append = " ${datadir}/wireplumber/wireplumber.conf.d"
