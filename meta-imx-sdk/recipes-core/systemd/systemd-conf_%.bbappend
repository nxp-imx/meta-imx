FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI += " \
    file://imx-logind.conf \
    file://imx-touchscreen.rules \
    file://imx-unmanage.network \
    file://imx-wait-online.conf \
    file://imx943-dsa.network \
    file://imx943-eth0.network \
"

do_install:append () {
    install -D -m0644 ${S}/imx-logind.conf ${D}${systemd_unitdir}/logind.conf.d/00-${PN}-imx.conf
    install -D -m0644 ${S}/imx-touchscreen.rules ${D}${sysconfdir}/udev/rules.d/00-${PN}-imx.rules
    install -D -m0644 ${S}/imx-unmanage.network ${D}${systemd_unitdir}/network/69-${PN}-imx.network
    install -D -m0644 ${S}/imx-wait-online.conf ${D}${sysconfdir}/systemd/system/systemd-networkd-wait-online.service.d/50-${PN}-imx.conf
}

do_install:append:mx943-nxp-bsp() {
    install -D -m0644 ${S}/imx943-eth0.network ${D}${systemd_unitdir}/network/50-${PN}-imx943-eth0.network
    install -D -m0644 ${S}/imx943-dsa.network ${D}${systemd_unitdir}/network/51-${PN}-imx943-dsa.network
}

FILES:${PN} += " \
    ${sysconfdir}/systemd/system/ \
    ${sysconfdir}/udev/rules.d/ \
"
