# Copyright 2020-2026 NXP

SUMMARY = "Memory Efficient Serialization Library"
HOMEPAGE = "https://github.com/google/flatbuffers"
SECTION = "console/tools"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "git://github.com/google/flatbuffers.git;branch=master;protocol=https"
SRCREV = "v25.9.23"

EXTRA_OECMAKE += "\
    -DFLATBUFFERS_BUILD_TESTS=OFF \    
    -DFLATBUFFERS_BUILD_SHAREDLIB=ON \
"

inherit cmake native

FILES:${PN}-compiler = "${bindir}"

BBCLASSEXTEND = "native nativesdk"
