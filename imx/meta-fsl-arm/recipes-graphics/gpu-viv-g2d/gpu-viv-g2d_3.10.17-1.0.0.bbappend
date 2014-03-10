SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "710a23fd6f3b966a7887169af39a509b"
SRC_URI[sha256sum] = "5eab1e0b280ac2840e7519eed69a1bc373b06a67fc990a6495722129dd32ce4d"

FILES_${PN} += " ${bindir}/gmem_info "
FILES_libg2d =  "${libdir}/libg2d-viv.so ${libdir}/libg2d${SOLIBS}"
FILES_${PN}-dbg += "${bindir}/.debug/gmem_info"
