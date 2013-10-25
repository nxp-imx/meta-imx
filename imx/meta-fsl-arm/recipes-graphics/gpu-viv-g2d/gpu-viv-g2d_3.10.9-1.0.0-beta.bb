# Copyright (C) 2013 Freescale Semiconductor

require recipes-graphics/gpu-viv-g2d/gpu-viv-g2d.inc

LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=861ebad4adc7236f8d1905338abd7eb2"

SRC_URI[md5sum] = "8c51c8d825075b7d2fe9708ca3c17a84"
SRC_URI[sha256sum] = "9fe3c8166c68e482bb0ca9e2636a396d691436c53350619e0bf99576780929df"

FILES_${PN} += " ${bindir}/gmem_info "
FILES_${PN}-dbg += "$ {bindir}/.debug/gmem_info"
