# Copyright (C) 2013, 2014 Freescale Semiconductor

require recipes-graphics/gpu-viv-g2d/gpu-viv-g2d.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}_alpha.bin;fsl-eula=true"
S="${WORKDIR}/${PN}-${PV}_alpha"

LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=53b61e015f8e1c386057c5ba8b081d53"

SRC_URI[md5sum] = "953fce18f7fb67833b9f3cc3ccd57cb5"
SRC_URI[sha256sum] = "6f191d2dccd523bc5b3f2c7123473c0da177081bee1788a3aff89195f4339f42"

FILES_${PN} += " ${bindir}/gmem_info "
FILES_libg2d =  "${libdir}/libg2d-viv.so ${libdir}/libg2d${SOLIBS}"
FILES_${PN}-dbg += "$ {bindir}/.debug/gmem_info"
