# Copyright 2024 NXP

DESCRIPTION = "NXP Voice detection"
SECTION = "multimedia"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=10c0fda810c63b052409b15a5445671a"

inherit autotools pkgconfig

DEPENDS += "alsa-lib nxp-afe"

SRCBRANCH = "master"
PV = "2.0+${SRCPV}"

NXPAFE_VOICESPOT_SRC ?= "git://github.com/nxp-imx/imx-voicespot.git;protocol=https"
SRC_URI = "${NXPAFE_VOICESPOT_SRC};branch=${SRCBRANCH}"

SRCREV = "f7463cb6a5b883c37c974a5f6be58ad81202e43b"
S = "${WORKDIR}/git"

EXTRA_CONF = "--enable-armv8 --bindir=/unit_tests/ --libdir=${libdir}"

EXTRA_OEMAKE:mx8-nxp-bsp = "BUILD_ARCH=CortexA53"
EXTRA_OEMAKE:mx8ulp-nxp-bsp = "BUILD_ARCH=CortexA35"
EXTRA_OEMAKE:mx9-nxp-bsp = "BUILD_ARCH=CortexA55"

do_compile () {
    echo "====Enter into ${WORKDIR}/git===="
    cd ${WORKDIR}/git
    echo "====make all==="
    oe_runmake all
}

do_install() {
    install -d ${D}${libdir}/nxp-afe
    install -d ${D}/unit_tests/nxp-afe
    install -m 0644 ${WORKDIR}/git/release/*.so.2.0    ${D}${libdir}/nxp-afe/
    ln -sf -r ${D}${libdir}/nxp-afe/libvoicespot.so.2.0 ${D}${libdir}/nxp-afe/libvoicespot.so
    install -m 0644 ${WORKDIR}/git/release/*.bin    ${D}/unit_tests/nxp-afe
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

FILES:${PN} += "${libdir}/nxp-afe/* \
                /unit_tests/* \
"
INSANE_SKIP:${PN} += "dev-so"

COMPATIBLE_MACHINE = "(mx8-nxp-bsp|mx9-nxp-bsp)"
