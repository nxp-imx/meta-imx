SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "3667053e3ba9c2c31677590dcbcb1e2b"
SRC_URI[sha256sum] = "19b37b145bb534f5ae0e1028dd196e2a1f2f5e76d4f2cce1d565e8e99450718d"

FILES_${PN} += " ${bindir}/gmem_info "
FILES_libg2d =  "${libdir}/libg2d-viv.so ${libdir}/libg2d${SOLIBS}"
FILES_${PN}-dbg += "${bindir}/.debug/gmem_info"
