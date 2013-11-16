# Copyright (C) 2013 Freescale Semiconductor

require recipes-graphics/gpu-viv-g2d/gpu-viv-g2d.inc

LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=861ebad4adc7236f8d1905338abd7eb2"

SRC_URI[md5sum] = "f3f20c0b8ea25216af30e75df122a435"
SRC_URI[sha256sum] = "928d552fd0b5fcf63ef17893e28bb4120d397b7064d5e3d70788458d05e56e81"

FILES_${PN} += " ${bindir}/gmem_info "
FILES_${PN}-dbg += "$ {bindir}/.debug/gmem_info"
