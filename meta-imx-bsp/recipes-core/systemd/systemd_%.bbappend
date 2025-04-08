FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://0001-units-systemd-udevd-Set-PrivateMounts-to-no.patch"

PACKAGECONFIG:append = " sysvinit serial-getty-generator"

# Although serial-getty-generator was enable, we want to use systemd-serialgetty when set default serial console
RDEPENDS:${PN} += "${@bb.utils.contains('PACKAGECONFIG', 'serial-getty-generator', 'systemd-serialgetty', '', d)}"
