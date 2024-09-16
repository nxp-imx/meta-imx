SUMMARY = "Tools for the capture and replay of Vulkan API calls"
SECTION = "graphics"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d2ddcd9b5c3b713fcf90c3223f6b10bd \
                    file://external/SPIRV-Reflect/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"
DEPENDS = "vulkan-headers spirv-headers zstd lz4"

SRC_URI = " \
    git://github.com/LunarG/gfxreconstruct.git;protocol=https;branch=vulkan-sdk-1.3.290 \
    git://github.com/KhronosGroup/SPIRV-Reflect;destsuffix=git/external/SPIRV-Reflect;name=SPIRV-Reflect;lfs=0;protocol=https;branch=vulkan-sdk-1.3.290 \
    file://0001-FindVulkanVersion.cmake-Look-for-vulkan-headers-in-s.patch \
    file://0004-Change-gfxreconstruct-layer-to-implicit-layer.patch \
"
SRCREV = "64f7c1ce9dd4a38629e8d3f936fea72669fddd59"
SRCREV_SPIRV-Reflect = "b4dc70d8e6ac30c719a2d05b8ad05e1d277c92b4"

SRCREV_FORMAT = "default_SPIRV-Reflect"

S = "${WORKDIR}/git"

inherit cmake features_check

ANY_OF_DISTRO_FEATURES = "wayland x11"

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'wayland x11', d)}"

PACKAGECONFIG[wayland] = "-DBUILD_WSI_WAYLAND_SUPPORT=ON,-DBUILD_WSI_WAYLAND_SUPPORT=OFF,wayland-native wayland wayland-protocols"
PACKAGECONFIG[x11] = "-DBUILD_WSI_XCB_SUPPORT=ON,-DBUILD_WSI_XCB_SUPPORT=OFF,libxcb libx11 xcb-util-keysyms"

EXTRA_OECMAKE += "\
    -DCMAKE_BUILD_TYPE=Release \
    -DCMAKE_SYSROOT=${PKG_CONFIG_SYSROOT_DIR} \
"

export SDKTARGETSYSROOT = "${STAGING_DIR_HOST}"

# The lib is unversioned
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

#workaround for do_package_qa buildpaths error
INSANE_SKIP:${PN} += "buildpaths"

FILES:${PN} += "${datadir}/vulkan"
