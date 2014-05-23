# Copyright (C) 2013, 2014 Freescale Semiconductor

require recipes-graphics/gpu-viv-g2d/gpu-viv-g2d.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}-beta.bin;fsl-eula=true"
S="${WORKDIR}/${PN}-${PV}-beta"

LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=53b61e015f8e1c386057c5ba8b081d53"

SRC_URI[md5sum] = "0ceb1e1765f074990ea94fc5cae182fd"
SRC_URI[sha256sum] = "c7c769323cf9485ea253c3234ea6d4731c485c1f3a4c5390ed820a8f6b400bb3"

FILES_${PN} += " ${bindir}/gmem_info "
FILES_libg2d =  "${libdir}/libg2d-viv${SOLIBS} ${libdir}/libg2d${SOLIBS}"
FILES_${PN}-dbg += "$ {bindir}/.debug/gmem_info"
