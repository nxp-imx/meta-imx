# Copyright (C) 2013 Freescale Semiconductor

require recipes-graphics/gpu-viv-g2d/gpu-viv-g2d.inc

LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=861ebad4adc7236f8d1905338abd7eb2"

SRC_URI[md5sum] = "b4952435c5979e3d5d6c2db2f96c3f51"
SRC_URI[sha256sum] = "0fd08532bb9af90e9d56fc4a6404a35914526ea93803724a6fefbaa6642f35a5"

FILES_${PN} += " ${bindir}/gmem_info "
FILES_${PN}-dbg += "$ {bindir}/.debug/gmem_info"
