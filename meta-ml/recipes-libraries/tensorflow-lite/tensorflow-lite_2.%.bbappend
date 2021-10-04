FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = " file://tensorflow-lite.pc.in \
                   file://0001-Use-fork-for-missing-eigen-repo.patch"

do_install_append() {
    install -d ${D}${libdir}/pkgconfig
    install -m 0644 ${WORKDIR}/tensorflow-lite.pc.in ${D}${libdir}/pkgconfig/tensorflow2-lite.pc
    sed -i 's:@version@:${PV}:g
        s:@libdir@:${libdir}:g
        s:@includedir@:${includedir}:g' ${D}${libdir}/pkgconfig/tensorflow2-lite.pc
}
