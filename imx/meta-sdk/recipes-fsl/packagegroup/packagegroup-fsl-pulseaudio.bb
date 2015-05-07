# Copyright (C) 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale package group - pulseaudio"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

RDEPENDS_${PN} = " \
    pulseaudio-server \
    pulseaudio-module-x11-xsmp \
    pulseaudio-module-x11-publish \
    pulseaudio-module-x11-cork-request \
    pulseaudio-module-x11-bell \
    pulseaudio-module-cli \
    pulseaudio-misc \
    pulseaudio-module-device-manager \
    consolekit \
"
