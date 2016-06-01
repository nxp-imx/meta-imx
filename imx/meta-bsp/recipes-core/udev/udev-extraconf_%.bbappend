# Freescale imx extra configuration udev rules
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_mx6 = " file://blacklist.conf "
SRC_URI_append_mx6ul = " file://blacklist.conf"
SRC_URI_append_mx7 = " file://blacklist.conf"

IS_MX6SX ?= "0"
IS_MX6SX_mx6sx = "1"

do_install_prepend () {
        if [ -e "${WORKDIR}/blacklist.conf" ]; then
                install -d ${D}${sysconfdir}/modprobe.d
                install -m 0644 ${WORKDIR}/blacklist.conf ${D}${sysconfdir}/modprobe.d
                if [ "${IS_MX6SX}" = "1" ]; then
                    # Additional blacklist for mxc_vadc
                    echo "Additional blacklist for mxc_vadc"
                    echo "blacklist mxc_vadc" >> ${D}${sysconfdir}/modprobe.d/blacklist.conf
                fi
        fi
}


FILES_${PN}_append = " ${sysconfdir}/modprobe.d"

PACKAGE_ARCH_mx6 = "${MACHINE_ARCH}"
PACKAGE_ARCH_mx6ul = "${MACHINE_SOCARCH}"
PACKAGE_ARCH_mx7 = "${MACHINE_SOCARCH}"
