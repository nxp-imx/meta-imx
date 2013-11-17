# Copyright (C) 2013 Freescale Semiconductor

require recipes-graphics/gpu-viv-g2d/gpu-viv-g2d.inc

LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=861ebad4adc7236f8d1905338abd7eb2"

SRC_URI[md5sum] = "5eef05e02ffe26fa960ed6cdac435f3a"
SRC_URI[sha256sum] = "0aaeb31c7b505349175691f66b68ae1d03f503f090c513a376afebd685e3eb0f"

FILES_${PN} += " ${bindir}/gmem_info "
FILES_${PN}-dbg += "$ {bindir}/.debug/gmem_info"
