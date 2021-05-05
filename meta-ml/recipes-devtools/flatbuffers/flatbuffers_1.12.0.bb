# Copyright 2020-2021 NXP
SUMMARY = "Memory Efficient Serialization Library"
HOMEPAGE = "https://github.com/google/flatbuffers"
SECTION = "console/tools"
LICENSE = "Apache-2.0"

DEPENDS += " ${BPN}-native"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRCREV = "6df40a2471737b27271bdd9b900ab5f3aec746c7"

SRC_URI = "git://github.com/google/flatbuffers.git"

# Make sure C++11 is used, required for example for GCC 4.9
CXXFLAGS += "-std=c++11"
BUILD_CXXFLAGS += "-std=c++11"

EXTRA_OECMAKE += "\
    -DFLATBUFFERS_BUILD_TESTS=OFF \
    -DFLATBUFFERS_BUILD_SHAREDLIB=ON \
    -DFLATBUFFERS_FLATC_EXECUTABLE="${STAGING_BINDIR_NATIVE}/flatc" \
    -DCMAKE_POSITION_INDEPENDENT_CODE=ON \
"

inherit cmake

S = "${WORKDIR}/git"

do_install_append() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/flatc ${D}${bindir}
}

FILES_${PN} += "${libdir}"
