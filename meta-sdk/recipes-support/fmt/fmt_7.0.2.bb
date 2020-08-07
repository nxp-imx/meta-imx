SUMMARY = "open-source formatting library for C++"
DESCRIPTION = "{fmt} is an open-source formatting library for C++. It can be used as a safe and fast alternative to (s)printf and iostreams."
HOMEPAGE = "https://fmt.dev"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=af88d758f75f3c5c48a967501f24384b"

SRC_URI = "https://github.com/fmtlib/fmt/releases/download/${PV}/${BP}.zip"
SRC_URI[md5sum] = "63264893108c311c948a75ccb9a5f9f6"
SRC_URI[sha256sum] = "b59501071960062217679989b794f0c865e15a6e5d515ef5a700ce739e3daec9"

inherit cmake ptest

EXTRA_OECMAKE += "-DBUILD_SHARED_LIBS=ON"
