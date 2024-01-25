# Copyright 2020-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Utilities for debugging and configuration of Sound Open Firmware"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "Console/tools"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=14abb55d71048ebecff1a104640546b6"

SRC_URI = "git://github.com/thesofproject/sof.git;branch=imx-stable-v2.8;protocol=https"
SRCREV = "a4f926196efc10a4bbc9e8ce5d5bed490dc64e46"

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
    mv ${D}/unit_tests/sof/tools/ctl//ipc3/* ${D}/unit_tests/sof/tools/ctl/
}

FILES:${PN} = "/unit_tests/sof/tools"
