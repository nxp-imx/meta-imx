# Copyright (C) 2013 Freescale Semiconductor

require recipes-graphics/gpu-viv-g2d/gpu-viv-g2d.inc

LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=861ebad4adc7236f8d1905338abd7eb2"

SRC_URI[md5sum] = "90c799ba5f358c1170a26cdc2828929e"
SRC_URI[sha256sum] = "637df5bcc138669ff42a3ab0ffd626acb4b2ffc6afccb5253a4f5770c1672fd5"

FILES_${PN} += " ${bindir}/gmem_info "
FILES_${PN}-dbg += "$ {bindir}/.debug/gmem_info"
