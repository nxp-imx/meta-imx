# Copyright (C) 2013, 2014 Freescale Semiconductor

require recipes-graphics/gpu-viv-g2d/gpu-viv-g2d.inc

LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=53b61e015f8e1c386057c5ba8b081d53"

SRC_URI[md5sum] = "c1c8611021f1fc7e7bdaa94b3ab694fa"
SRC_URI[sha256sum] = "f459e685548972a807960c8fa18325b659b4bbc3216c0a51cd9da132fec3be18"

FILES_${PN} += " ${bindir}/gmem_info "
FILES_libg2d =  "${libdir}/libg2d-viv.so ${libdir}/libg2d${SOLIBS}"
FILES_${PN}-dbg += "$ {bindir}/.debug/gmem_info"
