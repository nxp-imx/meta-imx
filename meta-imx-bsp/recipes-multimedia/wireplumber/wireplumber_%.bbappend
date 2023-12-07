FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " file://51-bluez-imx-config.lua \
                   file://0001-wpctl-fix-set-default-Segmentation-fault-on-32bit-pl.patch \
                 "

do_install:append() {

    install -d ${D}${sysconfdir}

    # Install 51-bluez-imx-config.lua to /etc/wireplumber/bluetooth.lua.d
    install -d ${D}${sysconfdir}/wireplumber/bluetooth.lua.d
    install -m 0755 ${WORKDIR}/51-bluez-imx-config.lua ${D}${sysconfdir}/wireplumber/bluetooth.lua.d
}

FILES:${PN}:append = " ${sysconfdir}/wireplumber/bluetooth.lua.d"
