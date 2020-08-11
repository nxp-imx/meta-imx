SUMMARY = "Memory Efficient Serialization Library"
HOMEPAGE = "https://github.com/google/flatbuffers"
SECTION = "console/tools"
LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a873c5645c184d51e0f9b34e1d7cf559"

SRCREV = "9e7e8cbe9f675123dd41b7c62868acad39188cae"

SRC_URI = "git://github.com/google/flatbuffers.git"

# Make sure C++11 is used, required for example for GCC 4.9
CXXFLAGS += "-std=c++11"
BUILD_CXXFLAGS += "-std=c++11"

#in native package we need to build only flatc

EXTRA_OECMAKE += "\
    -DFLATBUFFERS_BUILD_FLATC=ON \
    -DFLATBUFFERS_BUILD_TESTS=OFF \
    -DFLATBUFFERS_BUILD_SHAREDLIB=OFF \
    -DFLATBUFFERS_BUILD_FLATLIB=OFF \
    -DFLATBUFFERS_INSTALL=OFF \
"

inherit cmake native

S = "${WORKDIR}/git"

do_install() {
    install -d ${STAGING_BINDIR_NATIVE}
    install -m 0755 ${B}/flatc ${STAGING_BINDIR_NATIVE}
}

FILES_${PN} += "${bindir}"

#BBCLASSEXTEND = "native nativesdk"
