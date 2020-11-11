require ${BPN}.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI += " \
    git://github.com/google/amber;protocol=https;destsuffix=git/external/amber/src;name=amber;branch=main \
    git://github.com/KhronosGroup/glslang.git;protocol=https;destsuffix=git/external/glslang/src;name=glslang \
    git://github.com/KhronosGroup/SPIRV-Headers.git;protocol=https;destsuffix=git/external/spirv-headers/src;name=spirv-headers \
    git://github.com/KhronosGroup/SPIRV-Tools.git;protocol=https;destsuffix=git/external/spirv-tools/src;name=spirv-tools \
"

SRCREV_vk-gl-cts = "3d3444f16d43ff930d3c3a1c9be015794e478289"
SRCREV_amber = "d26ee22dd7faab1845a531d410f7ec1db407402a"
SRCREV_glslang = "c538b5d796fb24dd418fdd650c7f76e56bcc3dd8"
SRCREV_spirv-headers = "e4322e3be589e1ddd44afb20ea842a977c1319b8"
SRCREV_spirv-tools = "1eb89172a82b436d8037e8a8c29c80f7e1f7df74"

SRCREV_FORMAT = "vk-gl-cts_amber_glslang_spirv-headers_spirv-tools"
