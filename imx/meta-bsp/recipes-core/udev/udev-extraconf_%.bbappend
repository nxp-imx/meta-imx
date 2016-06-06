# Freescale i.MX SOC extra configuration udev rules
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_mx6 = " file://blacklist.conf "
SRC_URI_append_mx6ul = " file://blacklist.conf"
SRC_URI_append_mx7 = " file://blacklist.conf"

do_install_prepend () {
    if [ -e "${WORKDIR}/blacklist.conf" ]; then
        install -d ${D}${sysconfdir}/modprobe.d
        install -m 0644 ${WORKDIR}/blacklist.conf ${D}${sysconfdir}/modprobe.d
    fi
}


FILES_${PN}_append = " ${sysconfdir}/modprobe.d"

PACKAGE_ARCH_mx6 = "${MACHINE_ARCH}"
PACKAGE_ARCH_mx6ul = "${MACHINE_SOCARCH}"
PACKAGE_ARCH_mx7 = "${MACHINE_SOCARCH}"
