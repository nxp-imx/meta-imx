FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append:imx-generic-bsp = " file://imx.conf"

PACKAGECONFIG:remove:imx-generic-bsp = "${PACKAGECONFIG_REMOVE}"
PACKAGECONFIG_REMOVE ?= " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'progress-bar', '', d)}"

do_install:append:imx-generic-bsp() {
    if [ "${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)}" ]; then
        install -Dm 0644 ${UNPACKDIR}/imx.conf ${D}${systemd_system_unitdir}/psplash-start@.service.d/imx.conf
    fi
}

PACKAGE_ARCH:imx-generic-bsp = "${MACHINE_SOCARCH}"

FILES:${PN}:append:imx-generic-bsp = " ${systemd_system_unitdir}/psplash-start@.service.d"
