FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append = " file://flatbuffers.pc.in"

do_install:append() {
    install -D -m 0644 ${WORKDIR}/flatbuffers.pc.in ${D}${libdir}/pkgconfig/flatbuffers.pc
    sed -i 's:@version@:${PV}:g
        s:@libdir@:${libdir}:g
        s:@includedir@:${includedir}:g' ${D}${libdir}/pkgconfig/flatbuffers.pc
}

