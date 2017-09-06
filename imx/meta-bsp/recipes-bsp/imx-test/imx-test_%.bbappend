FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://memtool_profile "
SRC_URI_append_mx8 = " \
    file://Fix-mxc-cec-test-build-break.patch \
    file://Make-vpu-test-optional.patch \
"

do_install_append() {
    install -d -m 0755 ${D}/home/root/
    install -m 0644 ${WORKDIR}/memtool_profile ${D}/home/root/.profile
}
FILES_${PN} += " /home/root/.profile "
