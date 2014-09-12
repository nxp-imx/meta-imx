# Copyright (C) 2013, 2014 Freescale Semiconductor

require recipes-graphics/gpu-viv-g2d/gpu-viv-g2d.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S="${WORKDIR}/${PN}-${PV}"

LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=53b61e015f8e1c386057c5ba8b081d53"

SRC_URI[md5sum] = "f727c43f1a7a7aba6572a55aa8afecb1"
SRC_URI[sha256sum] = "73aee62f49bfd284bb4fddb5143a7af24221229c2a175e74f2e8ea7babd74c3a"

FILES_libg2d =  "${libdir}/libg2d-viv${SOLIBS} ${libdir}/libg2d${SOLIBS}"
