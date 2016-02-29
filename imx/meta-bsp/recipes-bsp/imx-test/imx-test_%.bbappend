FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://memtool_profile "

do_install_append() {
    install -d -m 0755 ${D}/home/root/
    install -m 0644 ${WORKDIR}/memtool_profile ${D}/home/root/.profile
}
FILES_${PN} += " /home/root/.profile "
