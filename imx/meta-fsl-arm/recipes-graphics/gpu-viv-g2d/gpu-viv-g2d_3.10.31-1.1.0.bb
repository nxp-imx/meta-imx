# Copyright (C) 2013, 2014 Freescale Semiconductor

require recipes-graphics/gpu-viv-g2d/gpu-viv-g2d.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}-beta.bin;fsl-eula=true"
S="${WORKDIR}/${PN}-${PV}-beta"

LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=53b61e015f8e1c386057c5ba8b081d53"

SRC_URI[md5sum] = "cb42f1328e5d92f8ecc2c1c623b8fccb"
SRC_URI[sha256sum] = "1cee0192738c3877ca414a084da9e289c012c423018226410cca7d8fc379f03d"

FILES_${PN} += "  ${bindir}/gmem_info "
FILES_libg2d =  "${libdir}/libg2d-viv${SOLIBS} ${libdir}/libg2d${SOLIBS}"
FILES_${PN}-dbg += "$ {bindir}/.debug/gmem_info"
