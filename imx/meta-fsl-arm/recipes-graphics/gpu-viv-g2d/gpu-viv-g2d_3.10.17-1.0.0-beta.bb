# Copyright (C) 2013 Freescale Semiconductor

require recipes-graphics/gpu-viv-g2d/gpu-viv-g2d.inc

LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=861ebad4adc7236f8d1905338abd7eb2"

SRC_URI[md5sum] = "d4af654ee2fc619cd8a96af514ffefdb"
SRC_URI[sha256sum] = "6f3ca8dfecb849bca5ad44ffa41dad99776d8d34709ad17ca93ce3924d137b28"

FILES_${PN} += " ${bindir}/gmem_info "
FILES_${PN}-dbg += "$ {bindir}/.debug/gmem_info"
