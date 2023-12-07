# Freescale i.MX SOC extra configuration udev rules
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append:mx6-nxp-bsp = " file://blacklist.conf "
SRC_URI:append:mx7-nxp-bsp = " file://blacklist.conf"
SRC_URI:append:mx8-nxp-bsp = " file://blacklist.conf"
SRC_URI:append:mx9-nxp-bsp = " file://blacklist.conf"

do_install:prepend () {
    if [ -e "${WORKDIR}/blacklist.conf" ]; then
        install -d ${D}${sysconfdir}/modprobe.d
        install -m 0644 ${WORKDIR}/blacklist.conf ${D}${sysconfdir}/modprobe.d
    fi
}


FILES:${PN}:append = " ${sysconfdir}/modprobe.d"

PACKAGE_ARCH:mx6-nxp-bsp = "${MACHINE_SOCARCH}"
PACKAGE_ARCH:mx7-nxp-bsp = "${MACHINE_SOCARCH}"
