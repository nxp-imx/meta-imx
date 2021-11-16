# Copyright (C) 2015 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Set of audio tools for inclusion on images"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

ALSA_INSTALL = " \
    alsa-utils \
    alsa-tools \
"
ALSA_INSTALL:append:mx8 = " tinycompress"

PULSEAUDIO_INSTALL = " \
    pulseaudio-server \
    pulseaudio-module-cli \
    pulseaudio-misc \
    pulseaudio-module-device-manager \
    ${@bb.utils.contains('DISTRO_FEATURES',"x11", "pulseaudio-module-x11-xsmp \
                                                   pulseaudio-module-x11-publish \
                                                   pulseaudio-module-x11-cork-request \
                                                   pulseaudio-module-x11-bell \
                                                   consolekit", \
                                           "", d)} \
"

ASRC_INSTALL ?= ""
ASRC_INSTALL:mx8 = "imx-dspc-asrc"

PDM_INSTALL ?= ""
PDM_INSTALL:mx8m = "imx-sw-pdm"

NXPAFE_INSTALL ?= ""
NXPAFE_INSTALL:mx8mm = "nxp-afe"
NXPAFE_INSTALL:mx8mn = "nxp-afe"
NXPAFE_INSTALL:mx8mp = "nxp-afe"
NXPAFE_INSTALL:mx8mnul = "nxp-afe"

SOFTOOLS_INSTALL       ?= ""
SOFTOOLS_INSTALL:mx8qm  = "sof-tools"
SOFTOOLS_INSTALL:mx8qxp = "sof-tools"
SOFTOOLS_INSTALL:mx8mp  = "sof-tools"
SOFTOOLS_INSTALL:mx8ulp = "sof-tools"

RDEPENDS:${PN} = " \
    ${@bb.utils.contains("DISTRO_FEATURES", "alsa",  "${ALSA_INSTALL}", "", d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "pulseaudio",  "${PULSEAUDIO_INSTALL}", "", d)} \
    ${ASRC_INSTALL} \
    ${PDM_INSTALL} \
    ${NXPAFE_INSTALL} \
    ${SOFTOOLS_INSTALL} \
"
