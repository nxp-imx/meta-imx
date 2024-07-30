SUMMARY = "Memory Efficient Serialization Library - Python3 Modules"
HOMEPAGE = "https://github.com/google/flatbuffers"
SECTION = "console/tools"
LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://../LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRCREV = "7d6d99c6befa635780a4e944d37ebfd58e68a108"
SRC_URI = "git://github.com/google/flatbuffers.git;branch=master;protocol=https"
S = "${WORKDIR}/git/python"

RDEPENDS:${PN} = "flatbuffers"

inherit setuptools3