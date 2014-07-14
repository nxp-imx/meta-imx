# Copyright (C) 2013, 2014 Freescale Semiconductor

require recipes-graphics/gpu-viv-g2d/gpu-viv-g2d.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}-beta.bin;fsl-eula=true"
S="${WORKDIR}/${PN}-${PV}-beta"

LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=53b61e015f8e1c386057c5ba8b081d53"

SRC_URI[md5sum] = "f4a1768e0c32b6a4db5ce560d03c50a6"
SRC_URI[sha256sum] = "d445440269718e46bde6fd0c4831cc66185a3fa2ed389b9db30e78ea572f7f94"

FILES_${PN} += "  ${bindir}/gmem_info "
FILES_libg2d =  "${libdir}/libg2d-viv${SOLIBS} ${libdir}/libg2d${SOLIBS}"
FILES_${PN}-dbg += "$ {bindir}/.debug/gmem_info"
