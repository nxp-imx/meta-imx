SUMMARY = "Memory Efficient Serialization Library"
HOMEPAGE = "https://github.com/google/flatbuffers"
SECTION = "console/tools"
LICENSE = "Apache-2.0"

PACKAGE_BEFORE_PN = "${PN}-compiler"
DEPENDS = "flatbuffers-native"

RDEPENDS:${PN}-compiler = "${PN}"
RDEPENDS:${PN}-${PYTHON_PN} = "${PN}"
RDEPENDS:${PN}-dev += "${PN}-compiler"

LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRCREV = "0100f6a5779831fa7a651e4b67ef389a8752bd9b"

SRC_URI = "git://github.com/google/flatbuffers.git;branch=master;protocol=https"

CVE_CHECK_IGNORE += "CVE-2020-35864"

EXTRA_OECMAKE += "\
    -DFLATBUFFERS_BUILD_TESTS=OFF \    
    -DFLATBUFFERS_BUILD_SHAREDLIB=ON \
"

EXTRA_OECMAKE:append:class-target = " -DFLATBUFFERS_FLATC_EXECUTABLE=${STAGING_BINDIR_NATIVE}/flatc"

inherit cmake python3native

S = "${WORKDIR}/git"

FILES:${PN}-compiler = "${bindir}"

BBCLASSEXTEND = "native nativesdk"
