require ${BPN}.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=67d07a07ec29a50a3ded12b2ba952257"

SRC_URI += " \
    file://0001-Support-Python3-as-well-in-gen_release_info.py.patch \
    \
    git://github.com/KhronosGroup/glslang.git;protocol=https;destsuffix=git/external/glslang/src;name=glslang;branch=master \
    \
    git://github.com/KhronosGroup/SPIRV-Headers.git;protocol=https;destsuffix=git/external/spirv-headers/src;name=spirv-headers;branch=master \
    \
    git://github.com/KhronosGroup/SPIRV-Tools.git;protocol=https;destsuffix=git/external/spirv-tools/src;name=spirv-tools;branch=master \
    file://0001-Include-limits-header.patch;patchdir=external/spirv-tools/src \
    file://0002-Python-3-remove-deprecated-U-qualifier-on-open-3019.patch;patchdir=external/spirv-tools/src \
"

SRCREV_vk-gl-cts = "2615cc4eb5d017a8376b689a54f0627b99ecd98f"
SRCREV_glslang = "a5c5fb61180e8703ca85f36d618f98e16dc317e2"
SRCREV_spirv-headers = "2bf02308656f97898c5f7e433712f21737c61e4e"
SRCREV_spirv-tools = "0b0454c42c6b6f6746434bd5c78c5c70f65d9c51"

SRCREV_FORMAT = "vk-gl-cts_glslang_spirv-headers_spirv-tools"

inherit python3native

do_compile:append() {
    cp -r modules/gles3/gles3/graphicsfuzz external/openglcts/modules/gles3
}
