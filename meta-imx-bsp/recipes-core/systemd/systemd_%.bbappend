FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://0001-units-systemd-udevd-Set-PrivateMounts-to-no.patch \
            file://0020-logind.conf-Set-HandlePowerKey-to-ignore.patch \
            file://89-unmanage.network"

PACKAGECONFIG[unmanaged-network] = ""

do_install:append () {

    # Disable the assignment of the fixed network interface name
    install -d ${D}${sysconfdir}/systemd/network
    ln -s /dev/null ${D}${sysconfdir}/systemd/network/99-default.link

    # Configure the network as unmanaged
    if [ "${@bb.utils.filter('PACKAGECONFIG', 'unmanaged-network', d)}" ]; then
        install -Dm 0644 ${WORKDIR}/89-unmanage.network ${D}${sysconfdir}/systemd/network/
    fi

    # Add special touchscreen rules
    if [ -e  ${D}${sysconfdir}/udev/rules.d/touchscreen.rules ]; then
        cat <<EOF >>${D}${sysconfdir}/udev/rules.d/touchscreen.rules
# i.MX specific touchscreen rules
SUBSYSTEM=="input", KERNEL=="event[0-9]*", ENV{ID_INPUT_TOUCHSCREEN}=="1", SYMLINK+="input/touchscreen0"
EOF
    fi
}
