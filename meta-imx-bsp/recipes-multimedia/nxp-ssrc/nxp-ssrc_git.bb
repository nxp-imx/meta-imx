# Copyright 2024-2026 NXP

DESCRIPTION = "NXP synchronous sample rate converter"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=0858ec9c7a80c4a2cf16e4f825a2cc91"

PV = "2.2.3+git"

SRCBRANCH = "main"
NXP_SSRC_SRC ?= "git://github.com/nxp-imx/nxp-ssrc.git;protocol=https"
SRC_URI = "${NXP_SSRC_SRC};branch=${SRCBRANCH}"
SRCREV = "2113f30ab787beaa64fa3b881438f176e7565483"

inherit pkgconfig

TOOLCHAIN = "clang"

EXTRA_OEMAKE += "\
    CLANGCC="${CC}" CLANGCXX="${CXX}" \
"

do_compile() {
    oe_runmake linuxcross
}

do_install() {
    install -d ${D}${libdir}
    install -m 0755 ${S}/exec_libcross/libssrcArmNeon.so* ${D}${libdir}
    ln -srf ${D}${libdir}/libssrcArmNeon.so.* ${D}${libdir}/libssrcArmNeon.so

    install -d ${D}${libdir}/pkgconfig
    install -m 0644 ${S}/libssrc.pc ${D}${libdir}/pkgconfig

    install -d ${D}/unit_tests/NXP_SSRC
    install -m 0644 ${S}/exec_linuxcross/ssrcArmNeon ${D}/unit_tests/NXP_SSRC

    install -d ${D}${includedir}/imx-mm/audio-codec/nxp-ssrc
    install -m 0644 ${S}/ssrcArmNeon/baselibrary/include/* ${D}${includedir}/imx-mm/audio-codec/nxp-ssrc
}

INSANE_SKIP:${PN} += "buildpaths"
INSANE_SKIP:${PN}-dbg += "buildpaths"

FILES:${PN} += "/unit_tests/NXP_SSRC/* "

COMPATIBLE_MACHINE = "(mx8-nxp-bsp|mx9-nxp-bsp)"
