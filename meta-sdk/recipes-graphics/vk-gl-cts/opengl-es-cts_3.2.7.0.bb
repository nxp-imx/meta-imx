require ${BPN}.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI:remove = "${VKGLCTS_SRC};name=vk-gl-cts;branch=imx-${BP}"
SRC_URI:prepend = " \
    git://github.com/KhronosGroup/VK-GL-CTS.git;protocol=https;name=vk-gl-cts \
    file://0001-MGS-4031-Report-NotSupported-for-OpenVG-tests-on-non.patch \
"
SRC_URI += " \
    git://github.com/google/amber;protocol=https;destsuffix=git/external/amber/src;name=amber;branch=main \
    git://github.com/KhronosGroup/glslang.git;protocol=https;destsuffix=git/external/glslang/src;name=glslang \
    git://github.com/KhronosGroup/SPIRV-Headers.git;protocol=https;destsuffix=git/external/spirv-headers/src;name=spirv-headers \
    git://github.com/KhronosGroup/SPIRV-Tools.git;protocol=https;destsuffix=git/external/spirv-tools/src;name=spirv-tools \
"

SRCREV_vk-gl-cts = "7cba7113c40f2ff03573c8c2c90661b2249e04fa"
SRCREV_amber = "4d0115cccfcb3b73d20b6513b1c40748e6403c50"
SRCREV_glslang = "ffccefddfd9a02ec0c0b6dd04ef5e1042279c97f"
SRCREV_spirv-headers = "104ecc356c1bea4476320faca64440cd1df655a3"
SRCREV_spirv-tools = "cd590fa3341284cd6d1ee82366155786cfd44c96"

SRCREV_FORMAT = "vk-gl-cts_amber_glslang_spirv-headers_spirv-tools"
