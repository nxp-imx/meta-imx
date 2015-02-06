# Copyright (C) 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale's package group used to add bluez5 tools."
SUMMARY = "Freescale package group - bluze5/tools"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

RDEPENDS_${PN}_mx6 = " \
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
