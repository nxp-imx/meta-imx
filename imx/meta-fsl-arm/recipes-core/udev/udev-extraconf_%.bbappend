# Freescale imx extra configuration udev rules
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_mx6 = " file://local.rules file://blacklist.conf"

do_install_prepend_mx6 () {
	if [ -e "${WORKDIR}/local.rules" ]; then
		install -d ${D}${sysconfdir}/udev/rules.d
		install -m 0644 ${WORKDIR}/local.rules ${D}${sysconfdir}/udev/rules.d
	fi
	if [ -e "${WORKDIR}/blacklist.conf" ]; then
		install -d ${D}${sysconfdir}/modprobe.d
		install -m 0644 ${WORKDIR}/blacklist.conf ${D}${sysconfdir}/modprobe.d
	fi
}

FILES_${PN}_append = " ${sysconfdir}/modprobe.d"

PACKAGE_ARCH_mx6 = "${MACHINE_ARCH}"
