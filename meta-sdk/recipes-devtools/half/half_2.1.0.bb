SUMMARY = "C++ library for half precision floating point arithmetics"
DESCRIPTION = "half is a C++ header-only library to provide an IEEE-754 conformant \ 
half-precision floating point type along with corresponding arithmetic operators, \
type conversions and common mathematical functions."

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=813a6278831975d26c115ed6f9c21831"

SRC_URI = "https://sourceforge.net/projects/half/files/half/${PV}/${BP}.zip"
SRC_URI[md5sum] = "cd28e42c77b99e4cca4f5e9fc76e0433"
SRC_URI[sha256sum] = "ad1788afe0300fa2b02b0d1df128d857f021f92ccf7c8bddd07812685fa07a25"

S = "${WORKDIR}"

do_install () {
    install -d ${D}${includedir}
    cp -r ${S}/include/* ${D}${includedir}
}

ALLOW_EMPTY_${PN} = "1"
