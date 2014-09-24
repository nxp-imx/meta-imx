# Copyright (C) 2013, 2014 Freescale Semiconductor

require recipes-graphics/gpu-viv-g2d/gpu-viv-g2d.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S="${WORKDIR}/${PN}-${PV}"

LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=53b61e015f8e1c386057c5ba8b081d53"

SRC_URI[md5sum] = "bc55f8fb4752e8fd0cd60ceba4e65f3f"
SRC_URI[sha256sum] = "1beb977d77d2993c315ef69bbe062440c0ed2483790f79cb92bfd958544b04e1"

FILES_libg2d =  "${libdir}/libg2d-viv${SOLIBS} ${libdir}/libg2d${SOLIBS}"
