FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://0020-logind.conf-Set-HandlePowerKey-to-ignore.patch \
            file://0021-systemd-udevd.service.in-Set-MountFlags-as-shared-to.patch \
"

do_install_append () {
    # Disable the assignment of the fixed network interface name
    install -d ${D}${sysconfdir}/systemd/network
    ln -s /dev/null ${D}${sysconfdir}/systemd/network/99-default.link
}
