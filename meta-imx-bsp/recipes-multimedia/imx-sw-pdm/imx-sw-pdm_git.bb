# Copyright 2020,2026 NXP Semiconductors

DESCRIPTION = "NXP PDM to PCM Software Decimation SIMD Library"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5a5269faabff841b575efa468fe8a52e"

PV = "1.0.3+git"

SRCBRANCH = "master"
PDM_SRC ?= "git://github.com/nxp-imx/imx-sw-pdm.git;protocol=https"
SRC_URI = "${PDM_SRC};branch=${SRCBRANCH}"
SRCREV = "b91ba33dcd635893156e3027d6697cf81a447bbd"

inherit pkgconfig

TOOLCHAIN = "clang"

do_compile() {
    oe_runmake CLANGCC="${CC}" CLANGCXX="${CXX}"
}

do_install() {
    install -d ${D}${libdir} ${D}${bindir} ${D}${includedir}/imx-mm/audio-codec/swpdm
    install -m 0755 ${S}/release/imx-sw-pdm ${D}${bindir}

    install -m 0644 ${S}/release/libimxswpdm.so* ${D}${libdir}
    ln -sf -r ${D}${libdir}/libimxswpdm.so.* ${D}${libdir}/libimxswpdm.so

    install -m 0644 ${S}/include/imx-swpdm.h ${D}${includedir}/imx-mm/audio-codec/swpdm
}

INSANE_SKIP:${PN} = "already-stripped"

FILES:${PN} += "${datadir}/imx-mm ${libdir}/*"

COMPATIBLE_MACHINE = "(mx8-nxp-bsp)"
