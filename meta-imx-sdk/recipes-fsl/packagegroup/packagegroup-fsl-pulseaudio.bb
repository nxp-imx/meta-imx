# Copyright (C) 2014-2015 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Freescale package group - pulseaudio"
DESCRIPTION = "Contains the modules needed by pulseaudio."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

PULSEAUDIO_EXTRA_INSTALL = "${@bb.utils.contains('DISTRO_FEATURES','x11', \
                            'pulseaudio-module-x11-xsmp \
                             pulseaudio-module-x11-publish \
                             pulseaudio-module-x11-cork-request \
                             pulseaudio-module-x11-bell', \
                            '', d)}"

RDEPENDS:${PN} = "${@bb.utils.contains('DISTRO_FEATURES', 'pulseaudio',  \
    ' pulseaudio-server \
    pulseaudio-module-cli \
    pulseaudio-misc \
    pulseaudio-module-device-manager \
    consolekit \
    ${PULSEAUDIO_EXTRA_INSTALL}', \
    '', d)}"
