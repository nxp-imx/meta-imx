# Copyright (C) 2013, 2014 Freescale Semiconductor

require recipes-graphics/gpu-viv-g2d/gpu-viv-g2d.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}-alpha.bin;fsl-eula=true"
S="${WORKDIR}/${PN}-${PV}-alpha"

LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=53b61e015f8e1c386057c5ba8b081d53"

SRC_URI[md5sum] = "1661bd597230d1fbec025f36458b4a7e"
SRC_URI[sha256sum] = "c1543fa20fb8c94bfd444f20a56c4ddc55518ea0025252b4bc497ab344ff81fb"

FILES_${PN} += " ${bindir}/gmem_info "
FILES_libg2d =  "${libdir}/libg2d-viv${SOLIBS} ${libdir}/libg2d${SOLIBS}"
FILES_${PN}-dbg += "$ {bindir}/.debug/gmem_info"
