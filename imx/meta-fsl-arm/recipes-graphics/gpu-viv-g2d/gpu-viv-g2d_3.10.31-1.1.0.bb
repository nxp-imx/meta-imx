# Copyright (C) 2013, 2014 Freescale Semiconductor

require recipes-graphics/gpu-viv-g2d/gpu-viv-g2d.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}_alpha.bin;fsl-eula=true"
S="${WORKDIR}/${PN}-${PV}_alpha"

LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=53b61e015f8e1c386057c5ba8b081d53"

SRC_URI[md5sum] = "1a06b476e561c9d160ba1ac89973e594"
SRC_URI[sha256sum] = "29d17ae302a2da530857876dd06cb84396184f3f4d1237e78b9efdadac46440c"

FILES_${PN} += " ${bindir}/gmem_info "
FILES_libg2d =  "${libdir}/libg2d-viv.so ${libdir}/libg2d${SOLIBS}"
FILES_${PN}-dbg += "$ {bindir}/.debug/gmem_info"
