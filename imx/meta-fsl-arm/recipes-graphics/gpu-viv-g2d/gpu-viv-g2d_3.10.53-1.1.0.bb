# Copyright (C) 2013, 2014 Freescale Semiconductor

require recipes-graphics/gpu-viv-g2d/gpu-viv-g2d.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S="${WORKDIR}/${PN}-${PV}"

LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=53b61e015f8e1c386057c5ba8b081d53"

SRC_URI[md5sum] = "f5362f32e4a46d68a5c1711603759585"
SRC_URI[sha256sum] = "fc020f6dfafc3372356bcdac3d48ea63ad2d75d3bf9faaf4c91515fd5af293e7"

FILES_libg2d =  "${libdir}/libg2d-viv${SOLIBS} ${libdir}/libg2d${SOLIBS}"
