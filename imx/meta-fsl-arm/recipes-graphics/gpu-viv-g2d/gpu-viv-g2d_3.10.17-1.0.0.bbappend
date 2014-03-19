SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "234bf5e6919fc671daa65dc27b7e8bfc"
SRC_URI[sha256sum] = "d3b95870f68545eddb8b3aab58848cd861de42adfd53830574e5643eb64b003a"

FILES_${PN} += " ${bindir}/gmem_info "
FILES_libg2d =  "${libdir}/libg2d-viv.so ${libdir}/libg2d${SOLIBS}"
FILES_${PN}-dbg += "${bindir}/.debug/gmem_info"
