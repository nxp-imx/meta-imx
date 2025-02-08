FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI += " \
    file://imx-logind.conf \
    file://imx-touchscreen.rules \
    file://imx-unmanage.network \
    file://imx943-dsa.network \
    file://imx943-eth0.network \
"

PACKAGECONFIG:append = " ${PACKAGECONFIG_SOC}"
PACKAGECONFIG_SOC                   ??= ""
PACKAGECONFIG_SOC:mx943-generic-bsp ??= "imx943"

PACKAGECONFIG[imx943] = ""
PACKAGECONFIG[unmanaged-network] = ""

do_install:append () {
    # Disable the assignment of the fixed network interface name
    install -d ${D}${sysconfdir}/systemd/network
    ln -s /dev/null ${D}${sysconfdir}/systemd/network/99-default.link

    install -D -m0644 ${S}/imx-logind.conf ${D}${systemd_unitdir}/logind.conf.d/00-${PN}-imx.conf
    install -D -m0644 ${S}/imx-touchscreen.rules ${D}${sysconfdir}/udev/rules.d/00-${PN}-imx.rules
    if [ "${@bb.utils.filter('PACKAGECONFIG', 'unmanaged-network', d)}" ]; then
        install -D -m0644 ${S}/imx-unmanage.network ${D}${systemd_unitdir}/network/69-${PN}-imx.network
    fi
    if [ "${@bb.utils.filter('PACKAGECONFIG', 'imx943', d)}" ]; then
        install -D -m0644 ${S}/imx943-eth0.network ${D}${systemd_unitdir}/network/50-${PN}-imx943-eth0.network
        install -D -m0644 ${S}/imx943-dsa.network ${D}${systemd_unitdir}/network/51-${PN}-imx943-dsa.network
    fi
}

FILES:${PN} += " \
    ${sysconfdir}/systemd/network/ \
    ${sysconfdir}/udev/rules.d/ \
"
