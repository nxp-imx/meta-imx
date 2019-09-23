SUMMARY = "A modern formatting library"
DESCRIPTION = "fmt is an open-source formatting library for C++. It can  \
be used as a safe and fast alternative to (s)printf and IOStreams."
HOMEPAGE = "http://fmtlib.net"

SECTION = "libs"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=af88d758f75f3c5c48a967501f24384b"

SRC_URI = " \
    git://github.com/fmtlib/fmt;protocol=https \
"
SRCREV = "7512a55aa3ae309587ca89668ef9ec4074a51a1f"
S = "${WORKDIR}/git"

inherit cmake

FILES_${PN}-dev += "${libdir}/cmake"
RDEPENDS_${PN}-dev += "${PN}-staticdev"

ALLOW_EMPTY_${PN} = "1"
