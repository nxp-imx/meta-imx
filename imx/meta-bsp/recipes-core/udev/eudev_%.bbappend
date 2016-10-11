FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = "file://Revert-udev-remove-userspace-firmware-loading-suppor.patch \
                  file://0014-Revert-rules-remove-firmware-loading-rules.patch"

do_install_append() {
    install -d ${D}${sysconfdir}/udev/rules.d
    install -m 0644 ${WORKDIR}/${PN}-${PV}/rules/50-firmware.rules ${D}${sysconfdir}/udev/rules.d
}
