DESCRIPTION = "Vulkan C++ examples and demos"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=dcf473723faabf17baa9b5f2207599d0 \
                    file://examples/triangle/triangle.cpp;endline=12;md5=a9bff831b31cd93da5daafd70c36133d"
DEPENDS = "assimp vulkan-loader zlib"

SRC_URI = "gitsm://github.com/SaschaWillems/Vulkan.git;protocol=https;branch=master \
           git://github.com/KhronosGroup/KTX-Software;destsuffix=git/external/ktx;name=ktx;lfs=0;protocol=https;branch=master \
           file://0001-Don-t-build-demos-with-questionably-licensed-data.patch \
           file://0002-Modify-parameter-in-vulkan-demo-computenbody.patch \
           "
SRCREV = "8b4ee5903364c86bc4d572b53ee8f1ac80501851"
SRCREV_ktx = "726d14d02c95bb21ec9e43807751b491d295dd3c"

SRCREV_FORMAT = "default_ktx"

S = "${WORKDIR}/git"

UPSTREAM_CHECK_COMMITS = "1"
UPSTREAM_CHECK_GITTAGREGEX = "These are not the releases you're looking for"

inherit cmake features_check pkgconfig

ANY_OF_DISTRO_FEATURES = "wayland x11"
REQUIRED_DISTRO_FEATURES = 'vulkan'

PACKAGECONFIG ??= "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', 'xcb', d)}"

PACKAGECONFIG[wayland] = "-DUSE_WAYLAND_WSI=ON,-DUSE_WAYLAND_WSI=OFF,wayland-native wayland wayland-protocols"
PACKAGECONFIG[xcb] = ",,libxcb"

EXTRA_OECMAKE = "-DRESOURCE_INSTALL_DIR=${datadir}/vulkan-demos"

do_install:append () {
    mv ${D}${bindir}/screenshot ${D}${bindir}/vulkan-screenshot
}
