# Copyright (C) 2014-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Freescale package group - pulseaudio"
DESCRIPTION = "Contains the modules needed by pulseaudio."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

PULSEAUDIO_EXTRA_INSTALL = "${@base_contains('DISTRO_FEATURES','x11', \
                            'pulseaudio-module-x11-xsmp \
                             pulseaudio-module-x11-publish \
                             pulseaudio-module-x11-cork-request \
                             pulseaudio-module-x11-bell', \
                            '', d)}"

RDEPENDS_${PN} = "${@base_contains('DISTRO_FEATURES', 'pulseaudio',  \
    ' pulseaudio-server \
    pulseaudio-module-cli \
    pulseaudio-misc \
    pulseaudio-module-device-manager \
    consolekit \
    ${PULSEAUDIO_EXTRA_INSTALL}', \
    '', d)}"
