SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "a0219510efb484ac4b9c10beb458e2a2"
SRC_URI[sha256sum] = "efc5795b38bf1cb4228e217dab8726b0d3e91b303cbe14931c4ec68ff3519cb8"

FILES_${PN} += " ${bindir}/gmem_info "
FILES_libg2d =  "${libdir}/libg2d-viv.so ${libdir}/libg2d${SOLIBS}"
FILES_${PN}-dbg += "${bindir}/.debug/gmem_info"
