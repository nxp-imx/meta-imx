# Copyright 2024-2026 NXP

DESCRIPTION = "NXP synchronous sample rate converter"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5a5269faabff841b575efa468fe8a52e"

PV = "2.2.3+git"

SRCBRANCH = "master"
NXP_SSRC_SRC ?= "git://github.com/nxp-imx/nxp_ssrc.git;protocol=https"
SRC_URI = "${NXP_SSRC_SRC};branch=${SRCBRANCH}"
SRCREV = "${AUTOREV}"

inherit pkgconfig

TOOLCHAIN = "clang"

EXTRA_OEMAKE += "\
    CLANGCC="${CC}" CLANGCXX="${CXX}" \
"

do_compile() {
    oe_runmake linuxcross
}

do_install() {
    install -d ${D}${libdir} ${D}/unit_tests/NXP_SSRC

    install -m 0755 ${S}/exec_libcross/libssrcArmNeon.so* ${D}${libdir}
    ln -srf ${D}${libdir}/libssrcArmNeon.so.* ${D}${libdir}/libssrcArmNeon.so

    install -m 0644 ${S}/exec_linuxcross/ssrcArmNeon ${D}/unit_tests/NXP_SSRC
}

INSANE_SKIP:${PN} += "buildpaths"
INSANE_SKIP:${PN}-dbg += "buildpaths"

FILES:${PN} += "/unit_tests/NXP_SSRC/* "

COMPATIBLE_MACHINE = "(mx8-nxp-bsp|mx9-nxp-bsp)"
