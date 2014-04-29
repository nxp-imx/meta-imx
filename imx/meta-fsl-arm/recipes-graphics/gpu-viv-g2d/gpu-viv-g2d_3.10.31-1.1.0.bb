# Copyright (C) 2013, 2014 Freescale Semiconductor

require recipes-graphics/gpu-viv-g2d/gpu-viv-g2d.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}-alpha.bin;fsl-eula=true"
S="${WORKDIR}/${PN}-${PV}-alpha"

LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=53b61e015f8e1c386057c5ba8b081d53"

SRC_URI[md5sum] = "a4528a044b5f52fb49b80fc7309629e9"
SRC_URI[sha256sum] = "6406bcd52dd3fc7a5da227ad566ff84933c1230b891df27a1afc9583350c9239"

FILES_${PN} += " ${bindir}/gmem_info "
FILES_libg2d =  "${libdir}/libg2d-viv${SOLIBS} ${libdir}/libg2d${SOLIBS}"
FILES_${PN}-dbg += "$ {bindir}/.debug/gmem_info"
