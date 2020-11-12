SUMMARY = "dEQP Vulkan Conformance Tests"
DESCRIPTION = "Vulkan conformance tests from the Khronos GPU testing suite called \
dEQP (drawElements Quality Program)."
HOMEPAGE = "https://github.com/KhronosGroup/VK-GL-CTS"
SECTION = "graphics"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS = "libpng vulkan-headers vulkan-loader zlib"

VKGLCTS_SRC ?= "git://github.com/KhronosGroup/VK-GL-CTS.git;protocol=https"
SRCBRANCH = "imx-${BP}"
SRC_URI = " \
    ${VKGLCTS_SRC};name=vk-gl-cts;branch=${SRCBRANCH} \
    git://github.com/google/amber;protocol=https;destsuffix=git/external/amber/src;name=amber;branch=main \
    git://github.com/KhronosGroup/glslang.git;protocol=https;destsuffix=git/external/glslang/src;name=glslang \
    git://github.com/KhronosGroup/SPIRV-Headers.git;protocol=https;destsuffix=git/external/spirv-headers/src;name=spirv-headers \
    git://github.com/KhronosGroup/SPIRV-Tools.git;protocol=https;destsuffix=git/external/spirv-tools/src;name=spirv-tools \
    https://raw.githubusercontent.com/baldurk/renderdoc/v1.1/renderdoc/api/app/renderdoc_app.h;subdir=git/external/renderdoc/src;name=renderdoc \
"
SRCREV_vk-gl-cts = "cbc71558335460beeac9ae935d460533b2bd7325"
SRCREV_amber = "a40bef4dba98d2d80b48e5a940d8574fbfceb197"
SRCREV_glslang = "b5f003d7a3ece37db45578a8a3140b370036fc64"
SRCREV_spirv-headers = "f8bf11a0253a32375c32cad92c841237b96696c0"
SRCREV_spirv-tools = "d2b486219495594f2e5d0e8d457fc234a3460b3b"
SRC_URI[renderdoc.sha256sum] = "e7b5f0aa5b1b0eadc63a1c624c0ca7f5af133aa857d6a4271b0ef3d0bdb6868e"

SRCREV_FORMAT = "vk-gl-cts_amber_glslang_spirv-headers_spirv-tools"

S = "${WORKDIR}/git"

inherit pkgconfig cmake distro_features_check

ANY_OF_DISTRO_FEATURES = "x11 wayland"

PACKAGECONFIG ??= " \
    egl \
    gles2 \
    ${@bb.utils.filter('DISTRO_FEATURES', 'opengl wayland x11', d)} \
"

PACKAGECONFIG[egl]     = ",,virtual/egl"
PACKAGECONFIG[gles1]   = ",,virtual/libgles1"
PACKAGECONFIG[gles2]   = ",,virtual/libgles2"
PACKAGECONFIG[opengl]  = ",,virtual/libgl"
PACKAGECONFIG[x11]     = ",,libxcb libx11 libxrandr"
PACKAGECONFIG[wayland] = "-DDEQP_TARGET=wayland,,wayland"

do_install() {
    dest_dir=${D}/opt/vulkancts
    install -d $dest_dir
    src_dir=external/vulkancts/modules/vulkan
    for src in deqp-vk vk-build-programs; do
        install -m 0755 $src_dir/$src $dest_dir
    done
    install -d $dest_dir/vulkan
    for src in data draw dynamic_state glsl; do
        cp -R --no-dereference --preserve=mode,links -v $src_dir/vulkan/$src $dest_dir/vulkan/$src
    done
    # Copy mustpass data from source
    cp -R --no-dereference --preserve=mode,links -v ${S}/external/vulkancts/mustpass $dest_dir/mustpass
}

FILES_${PN} = "/opt"
