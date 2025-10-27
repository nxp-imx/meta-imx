SUMMARY = "Memory Efficient Serialization Library - Python3 Modules"
HOMEPAGE = "https://github.com/google/flatbuffers"
SECTION = "console/tools"
LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://../LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRCREV = "e6463926479bd6b330cbcf673f7e917803fd5831"
SRC_URI = "git://github.com/google/flatbuffers.git;branch=master;protocol=https \
           file://0001-Fixes-LICENSE-file-in-python.patch;patchdir=${UNPACKDIR}/${BP}"
S = "${UNPACKDIR}/${BP}/python"

RDEPENDS:${PN} = "flatbuffers"

inherit setuptools3
