SUMMARY = "open-source formatting library for C++"
DESCRIPTION = "{fmt} is an open-source formatting library for C++. It can be used as a safe and fast alternative to (s)printf and iostreams."
HOMEPAGE = "https://fmt.dev"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=af88d758f75f3c5c48a967501f24384b"

SRC_URI = "https://github.com/fmtlib/fmt/releases/download/${PV}/${BP}.zip"
SRC_URI[md5sum] = "e66b07ca9fc0f88283a9bb294d3b7d06"
SRC_URI[sha256sum] = "94fea742ddcccab6607b517f6e608b1e5d63d712ddbc5982e44bafec5279881a"

inherit cmake
inherit ptest

EXTRA_OECMAKE += "-DBUILD_SHARED_LIBS=ON"
