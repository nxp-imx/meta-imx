FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append:imx-generic-bsp = " file://imx.conf"

do_install:append:imx-generic-bsp() {
    if [ "${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)}" ]; then
        install -Dm 0644 ${UNPACKDIR}/imx.conf ${D}${systemd_system_unitdir}/psplash-start@.service.d/imx.conf
    fi
}

FILES:${PN}:append:imx-generic-bsp = " ${systemd_system_unitdir}/psplash-start@.service.d"
