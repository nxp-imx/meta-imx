# Copyright (C) 2013 Freescale Semiconductor

require recipes-graphics/gpu-viv-g2d/gpu-viv-g2d.inc

LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=861ebad4adc7236f8d1905338abd7eb2"

SRC_URI[md5sum] = "f48f859a77aa93de5100a8c1d08d8e42"
SRC_URI[sha256sum] = "76f33d4e9754bdb736996330ec5717752cf2b78a4cf9ca2e0d0e42b4d0894dfa"

FILES_${PN} += " ${bindir}/gmem_info "
FILES_${PN}-dbg += "$ {bindir}/.debug/gmem_info"
FILES_${PN} += " ${libdir}/libg2d-viv${SOLIBS} "
