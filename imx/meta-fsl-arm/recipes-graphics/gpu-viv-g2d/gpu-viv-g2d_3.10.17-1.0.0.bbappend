SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "008d6e51b148aa55660f335d4a51c26e"
SRC_URI[sha256sum] = "ddb6a8c153588e58e432381dee713d19e5013d39eefb43312e284d796c145bbb"

FILES_${PN} += " ${bindir}/gmem_info "
FILES_libg2d =  "${libdir}/libg2d-viv.so ${libdir}/libg2d${SOLIBS}"
FILES_${PN}-dbg += "${bindir}/.debug/gmem_info"
