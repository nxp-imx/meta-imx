SUMMARY = "Tools for the capture and replay of Vulkan API calls"
SECTION = "graphics"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d2ddcd9b5c3b713fcf90c3223f6b10bd \
                    file://external/SPIRV-Reflect/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"
DEPENDS = "lz4 nlohmann-json spirv-headers vulkan-headers zstd"

SRC_URI = " \
    git://github.com/LunarG/gfxreconstruct.git;protocol=https;branch=vulkan-sdk-1.4.321 \
    git://github.com/KhronosGroup/SPIRV-Reflect;destsuffix=${S}/external/SPIRV-Reflect;name=SPIRV-Reflect;lfs=0;protocol=https;branch=vulkan-sdk-1.4.321 \
    file://0001-FindVulkanVersion.cmake-Look-for-vulkan-headers-in-s.patch \
    file://0002-Change-gfxreconstruct-layer-to-implicit-layer.patch \
"
SRCREV = "e8b2afd199e34274ac5108a08b9dcf22a8f52065"
SRCREV_SPIRV-Reflect = "e55086b044225f9b511ae44dbf9b079d3625943f"

SRCREV_FORMAT = "default_SPIRV-Reflect"

inherit cmake features_check

ANY_OF_DISTRO_FEATURES = "wayland x11"

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'wayland x11', d)}"

PACKAGECONFIG[wayland] = "-DBUILD_WSI_WAYLAND_SUPPORT=ON,-DBUILD_WSI_WAYLAND_SUPPORT=OFF,wayland-native wayland wayland-protocols"
PACKAGECONFIG[x11] = "-DBUILD_WSI_XCB_SUPPORT=ON,-DBUILD_WSI_XCB_SUPPORT=OFF,libxcb libx11 xcb-util-keysyms"

EXTRA_OECMAKE += "\
    -DCMAKE_BUILD_TYPE=Release \
    -DCMAKE_SYSROOT=${PKG_CONFIG_SYSROOT_DIR} \
    -DGFXRECON_ENABLE_OPENXR=OFF \
"

export SDKTARGETSYSROOT = "${STAGING_DIR_HOST}"

# The lib is unversioned
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

FILES:${PN} += "${datadir}/vulkan"

INSANE_SKIP:${PN} += "buildpaths"
