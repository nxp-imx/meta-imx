# Copyright 2020-2024 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Utilities for debugging and configuration of Sound Open Firmware"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "Console/tools"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=14abb55d71048ebecff1a104640546b6"
DEPENDS = "alsa-lib"

SRC_URI = "git://github.com/thesofproject/sof.git;branch=main;protocol=https"
SRCREV = "2977518f4c3140f7aea28112321315e454b1f617"

S = "${WORKDIR}/git"

inherit cmake autotools

do_configure() {
}

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
    mv ${D}/unit_tests/sof/tools/ctl//ipc3/* ${D}/unit_tests/sof/tools/ctl/
}

FILES:${PN} = "/unit_tests/sof/tools"
INSANE_SKIP:${PN} = "buildpaths rpaths"
