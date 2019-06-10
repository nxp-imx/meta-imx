SUMMARY = "C++ library for half precision floating point arithmetics"
DESCRIPTION = "half is a C++ header-only library to provide an IEEE-754 conformant \ 
half-precision floating point type along with corresponding arithmetic operators, \
type conversions and common mathematical functions."

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=fe7e5a4795c76b317919afd2d3da5983"

SRC_URI = "https://sourceforge.net/projects/half/files/half/${PV}/${PN}-${PV}.zip \
"
SRC_URI[md5sum] = "86d023c0729abf3465bcd55665a39013"
SRC_URI[sha256sum] = "cdd70d3bf3fe091b688e7ab3f48471c881a197d2c186c95cca8bf156961fb41c"

S = "${WORKDIR}"

do_install () {
    install -d ${D}${includedir}
    cp -r ${S}/include/* ${D}${includedir}
}

ALLOW_EMPTY_${PN} = "1"
