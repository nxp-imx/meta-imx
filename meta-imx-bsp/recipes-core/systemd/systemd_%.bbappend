FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://0001-units-systemd-udevd-Set-PrivateMounts-to-no.patch \
            file://0020-logind.conf-Set-HandlePowerKey-to-ignore.patch \
            file://69-unmanage.network \
            file://50-eth0.network \
            file://51-dsa.network"

PACKAGECONFIG:append = " sysvinit"

PACKAGECONFIG[unmanaged-network] = ""

PACKAGECONFIG[eth0] = ""
PACKAGECONFIG[dsa] = ""

do_install:append () {

    # Disable the assignment of the fixed network interface name
    install -d ${D}${sysconfdir}/systemd/network
    ln -s /dev/null ${D}${sysconfdir}/systemd/network/99-default.link

    # Configure the network as unmanaged
    if [ "${@bb.utils.filter('PACKAGECONFIG', 'unmanaged-network', d)}" ]; then
        install -Dm 0644 ${UNPACKDIR}/69-unmanage.network ${D}${sysconfdir}/systemd/network/
    fi

    # Disable eth0 use dhcp
    if [ "${@bb.utils.filter('PACKAGECONFIG', 'eth0', d)}" ]; then
        install -Dm 0644 ${UNPACKDIR}/50-eth0.network ${D}${sysconfdir}/systemd/network/
    fi

    # Enable swp* use dhcp
    if [ "${@bb.utils.filter('PACKAGECONFIG', 'dsa', d)}" ]; then
        install -Dm 0644 ${UNPACKDIR}/51-dsa.network ${D}${sysconfdir}/systemd/network/
    fi

    # Add special touchscreen rules
    if [ -e  ${D}${sysconfdir}/udev/rules.d/touchscreen.rules ]; then
        cat <<EOF >>${D}${sysconfdir}/udev/rules.d/touchscreen.rules
# i.MX specific touchscreen rules
SUBSYSTEM=="input", KERNEL=="event[0-9]*", ENV{ID_INPUT_TOUCHSCREEN}=="1", SYMLINK+="input/touchscreen0"
EOF
    fi
}
