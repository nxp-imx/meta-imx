# Copyright 2020-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Utilities for debugging and configuration of Sound Open Firmware"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "Console/tools"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=14abb55d71048ebecff1a104640546b6"

SRCREV = "a0d9a4e4acf776cebba1b857fecda253e970d20f"
SRC_URI = "git://github.com/thesofproject/sof.git;branch=main;protocol=https"

S = "${WORKDIR}/git"

DEPENDS += "alsa-lib"
RDEPENDS:${PN} += "bash"

inherit cmake autotools

do_compile() {
    install -d ${S}/tools/sof-tools
    cd ${S}/tools/sof-tools
    cmake ..
    make sof-logger
    make sof-ctl
}

do_install() {
    install -d ${D}/unit_tests/sof/tools
    cp -r ${S}/tools/sof-tools/logger ${D}/unit_tests/sof/tools/
    cp -r ${S}/tools/sof-tools/ctl ${D}/unit_tests/sof/tools/
    cp -r ${S}/tools/tune  ${D}/unit_tests/sof/tools/
    cp -r ${S}/tools/ctl ${D}/unit_tests/sof/tools/
}

FILES:${PN} = "/unit_tests/sof/tools"
