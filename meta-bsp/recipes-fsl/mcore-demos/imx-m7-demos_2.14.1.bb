# Copyright 2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mp-nxp-bsp = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac" 
LIC_FILES_CHKSUM:mx8mpul-nxp-bsp = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"

SRC_URI[imx8mp.md5sum] = "f12cd36cd48cfc65ada700445f8cecaf"
SRC_URI[imx8mp.sha256sum] = "f2da9e7d7ea6d7b5f33eb12d20e6c5c07fe3110d362f5263d672729f2cd73b37"

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp|mx8mpul-nxp-bsp)"
