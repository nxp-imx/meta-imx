# Copyright 2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mp-nxp-bsp = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac" 
LIC_FILES_CHKSUM:mx8mpul-nxp-bsp = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"

SRC_URI[imx8mp.md5sum] = "c58dbf8b0b8166f26fb22284f5b6ebe3"
SRC_URI[imx8mp.sha256sum] = "9ad4a847ab50bb8333124322aef1739b182586131f7f2221378d3963146650d9"

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp|mx8mpul-nxp-bsp)"
