# Copyright (C) 2014-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale's package group used to add bluez tools."
SUMMARY = "Freescale package group - bluez/tools"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

BLUEZ4_INSTALL = " \
    obexftp \
"

BLUEZ5_INSTALL = " \
     bluez5-noinst-tools \
     bluez5-obex \
     bluez5-testtools  \
     libasound-module-bluez \
     pulseaudio-module-bluetooth-discover \
     pulseaudio-module-bluetooth-policy \
     pulseaudio-module-bluez5-discover \
     pulseaudio-module-bluez5-device \
     pulseaudio-module-switch-on-connect \
     pulseaudio-module-loopback \
"

# Install either bluez4 or bluez5 if they are in distro.  
# Otherwise install nothing.
BLUEZ_INSTALL = "" 
BLUEZ_INSTALL = "${@base_contains('DISTRO_FEATURES', 'bluez5', '${BLUEZ5_INSTALL}', \
    base_contains('DISTRO_FEATURES', 'bluez4', '${BLUEZ4_INSTALL}', \
    '', d), d)}"

RDEPENDS_${PN} = ""
RDEPENDS_${PN}_mx6 = "${BLUEZ_INSTALL}"
RDEPENDS_${PN}_mx7 = "${BLUEZ_INSTALL}"
