# Copyright (C) 2013, 2014 Freescale Semiconductor

require recipes-graphics/gpu-viv-g2d/gpu-viv-g2d.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S="${WORKDIR}/${PN}-${PV}"

LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=53b61e015f8e1c386057c5ba8b081d53"

SRC_URI[md5sum] = "5bf36981a865f8aaa9de90bc3db6645a"
SRC_URI[sha256sum] = "cd545032d191ebd2d7df5589911d49886406eddf4409130e4175f62b798a2433"

FILES_${PN} += "  ${bindir}/gmem_info "
FILES_libg2d =  "${libdir}/libg2d-viv${SOLIBS} ${libdir}/libg2d${SOLIBS}"

