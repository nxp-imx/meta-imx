# Copyright 2025 NXP

DESCRIPTION = "NXP Voice Acoustic Echo Cancellation (AEC) library based on TensorFlow-lite, which is used by audio-front-end"
SECTION = "multimedia"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7bdef19938f3503cfc4c586461f99012"

DEPENDS = "alsa-lib tensorflow-lite"

PV = "1.0+git"

SRC_URI = "${NXPAFE_VOICETFLITE_SRC};branch=${SRCBRANCH}"
NXPAFE_VOICETFLITE_SRC ?= "git://github.com/nxp-imx/imx-voice-tflite.git;protocol=https"
SRCBRANCH = "MM_04.10.02_2510_L6.12.49"
SRCREV = "442d753008d051e4f8faf9fbb9c18bfcb59dade3"

S = "${WORKDIR}/git"

inherit pkgconfig

do_install() {
    install -d ${D}${libdir}/nxp-afe
    install -m 0644 ${S}/release/libvoiceaec.so.* ${D}${libdir}/nxp-afe
    ln -sf -r ${D}${libdir}/nxp-afe/libvoiceaec.so.* ${D}${libdir}/nxp-afe/libvoiceaec.so
}

# Library is dynamically loaded, so include .so in main package
FILES:${PN} += "${libdir}/nxp-afe/* "
INSANE_SKIP:${PN} += "dev-so"

COMPATIBLE_MACHINE = "(mx8mm-nxp-bsp|mx8mp-nxp-bsp|mx91-nxp-bsp|mx93-nxp-bsp|mx95-nxp-bsp)"
