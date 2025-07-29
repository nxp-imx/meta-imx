# Copyright 2025 NXP

DESCRIPTION = "NXP Voice Acoustic Echo Cancellation (AEC) library based on TensorFlow-lite, which is used by audio-front-end"
SECTION = "multimedia"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=bc649096ad3928ec06a8713b8d787eac"

DEPENDS = "alsa-lib tensorflow-lite"

PV = "1.0+git"

SRC_URI = "${NXPAFE_VOICETFLITE_SRC};branch=${SRCBRANCH}"
NXPAFE_VOICETFLITE_SRC ?= "git://github.com/nxp-imx/imx-voice-tflite.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "bb38ee03c569d7c2d3fb72cb6f2dd3d539d2a765"

S = "${WORKDIR}/git"

inherit pkgconfig

do_install() {
    install -d ${D}${libdir}/nxp-afe
    install -m 0644 ${S}/release/libvoiceaec.so.* ${D}${libdir}/nxp-afe
    ln -sf -r ${D}${libdir}/nxp-afe/libvoiceaec.so.* ${D}${libdir}/nxp-afe/libvoiceaec.so
}

FILES:${PN} += "${libdir}/nxp-afe/lib*${SOLIBS}"
FILES:${PN}-dev += "${libdir}/nxp-afe/lib*${SOLIBSDEV} "

COMPATIBLE_MACHINE = "(mx8mm-nxp-bsp|mx8mp-nxp-bsp|mx93-nxp-bsp|mx95-nxp-bsp)"
