SUMMARY = "Tools for the capture and replay of Vulkan API calls"
SECTION = "graphics"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d2ddcd9b5c3b713fcf90c3223f6b10bd"
DEPENDS = "vulkan-headers zstd"

SRC_URI = " \
    git://github.com/LunarG/gfxreconstruct.git;protocol=https;branch=vulkan-sdk-1.3.275 \
    file://0001-FindVulkanVersion.cmake-Look-for-vulkan-headers-in-s.patch \
    file://0002-MGS-7104-ccc-gfxreconstruct-Add-support-for-xdg-shel.patch \
    file://0003-MGS-7104-ccc-gfxreconstruct-Generate-xdg-shell-proto.patch \
    file://0004-Change-gfxreconstruct-layer-to-implicit-layer.patch \
"
SRCREV = "ad85498e33a53f4c89979e0af8e3fe3b512aa47c"
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

FILES:${PN} += "${datadir}/vulkan"
