DESCRIPTION = "Vulkan C++ examples and demos"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=dcf473723faabf17baa9b5f2207599d0 \
                    file://examples/triangle/triangle.cpp;endline=12;md5=bccd1bf9cadd9e10086cf7872157e4fa"
DEPENDS = "assimp vulkan-loader zlib"

SRC_URI = "git://github.com/SaschaWillems/Vulkan.git;protocol=https;branch=master \
           git://github.com/g-truc/glm;destsuffix=git/external/glm;name=glm;protocol=https;branch=master  \
           git://github.com/KhronosGroup/KTX-Software;destsuffix=git/external/ktx;name=ktx;lfs=0;protocol=https;branch=master \
           file://0001-Don-t-build-demos-with-questionably-licensed-data.patch \
           file://0001-Modify-parameter-in-vulkan-demo-computenbody.patch \
           "
SRCREV = "a2a604be473c829763854ffb34f7978bc0358afb"
SRCREV_glm = "1ad55c5016339b83b7eec98c31007e0aee57d2bf"
SRCREV_ktx = "726d14d02c95bb21ec9e43807751b491d295dd3c"
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
