SUMMARY  = "The SPIR-V Tools project provides an API and commands for \
processing SPIR-V modules"
DESCRIPTION = "The project includes an assembler, binary module parser, \
disassembler, validator, and optimizer for SPIR-V."
LICENSE  = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://external/spirv-headers/LICENSE;md5=c938b85bceb8fb26c1a807f28a52ae2d \
"
SECTION = "graphics"

SRC_URI = " \
    git://github.com/KhronosGroup/SPIRV-Tools.git;name=spirv-tools \
    git://github.com/KhronosGroup/SPIRV-Headers.git;name=spirv-headers;destsuffix=git/external/spirv-headers \
"
SRCREV_spirv-tools = "d2b486219495594f2e5d0e8d457fc234a3460b3b"
SRCREV_spirv-headers = "f8bf11a0253a32375c32cad92c841237b96696c0"
SRCREV_FORMAT = "spirv-tools_spirv-headers"

S = "${WORKDIR}/git"

inherit cmake

do_install_append() {
	install -d ${D}/${includedir}/SPIRV
	install -m 0644 ${S}/external/spirv-headers/include/spirv/unified1/* ${D}/${includedir}/SPIRV
}

# The output library is unversioned
SOLIBS = ".so"
FILES_SOLIBSDEV = ""
