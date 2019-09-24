SUMMARY  = "The SPIR-V Tools project provides an API and commands for \
processing SPIR-V modules"
DESCRIPTION = "The project includes an assembler, binary module parser, \
disassembler, validator, and optimizer for SPIR-V."
LICENSE  = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"
SECTION = "graphics"

S = "${WORKDIR}/git"
DEST_DIR = "${S}/external" 
SRC_URI = "git://github.com/KhronosGroup/SPIRV-Tools.git;name=spirv-tools \
           git://github.com/KhronosGroup/SPIRV-Headers.git;name=spirv-headers;destsuffix=${DEST_DIR}/spirv-headers \
"
SRCREV_spirv-tools = "9b3cc3e05337358d0bd9fec1b7a51e3cbf55312b"
SRCREV_spirv-headers = "38cafab379e5d16137cb97a485b9385191039b92"

inherit cmake python3native

do_install_append() {
	install -d ${D}/${includedir}/SPIRV
	install -m 0644 ${DEST_DIR}/spirv-headers/include/spirv/unified1/* ${D}/${includedir}/SPIRV
}

FILES_SOLIBSDEV = ""
FILES_${PN} += "${libdir}/*.so"
