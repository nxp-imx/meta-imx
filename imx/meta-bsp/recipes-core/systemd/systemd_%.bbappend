FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += " \
            file://0001-systemd-udevd.service.in-Set-PrivateMounts-to-no-to-.patch \
            file://0020-logind.conf-Set-HandlePowerKey-to-ignore.patch \
            file://sdma \
            file://userspace-firmware.service \
"
do_install_append () {
    # Disable the assignment of the fixed network interface name
    install -d ${D}${sysconfdir}/systemd/network
    ln -s /dev/null ${D}${sysconfdir}/systemd/network/99-default.link

    install -d ${D}${sysconfdir}/systemd/system/multi-user.target.wants/
    install -m 0755 ${WORKDIR}/sdma ${D}${sysconfdir}
    install -m 0644 ${WORKDIR}/userspace-firmware.service ${D}${systemd_unitdir}/system
    # Enable the userspace-firmware.service
    ln -sf ${systemd_unitdir}/system/userspace-firmware.service \
            ${D}${sysconfdir}/systemd/system/multi-user.target.wants/userspace-firmware.service

    # Add special touchscreen rules
    if [ -e  ${D}${sysconfdir}/udev/rules.d/touchscreen.rules ]; then
        cat <<EOF >>${D}${sysconfdir}/udev/rules.d/touchscreen.rules
# i.MX specific touchscreen rules
SUBSYSTEM=="input", KERNEL=="event[0-9]*", ENV{ID_INPUT_TOUCHSCREEN}=="1", SYMLINK+="input/touchscreen0"
EOF
    fi
}

RDEPENDS_${PN} += " bash "

FILES_${PN} += "${systemd_unitdir}/system/*.service ${sysconfdir}"
