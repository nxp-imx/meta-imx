FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://debian-10.list"

do_install_append() {
    install -m 0644 ${WORKDIR}/debian-10.list ${D}${sysconfdir}/apt/sources.list.d/
}
