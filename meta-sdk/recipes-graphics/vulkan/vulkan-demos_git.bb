DESCRIPTION = "Collection of Vulkan examples"
LICENSE = "MIT"
DEPENDS = "zlib"

LIC_FILES_CHKSUM = "file://LICENSE.md;md5=dcf473723faabf17baa9b5f2207599d0 \
                    file://examples/triangle/triangle.cpp;endline=12;md5=bccd1bf9cadd9e10086cf7872157e4fa"

SRCREV_glm = "1ad55c5016339b83b7eec98c31007e0aee57d2bf"
SRCREV_ktx = "726d14d02c95bb21ec9e43807751b491d295dd3c"

SRC_URI = "git://github.com/SaschaWillems/Vulkan.git;protocol=https;branch=master \
           git://github.com/g-truc/glm;destsuffix=git/external/glm;name=glm;protocol=https;branch=master  \
           git://github.com/KhronosGroup/KTX-Software;destsuffix=git/external/ktx;name=ktx;lfs=0;protocol=https;branch=master \
           file://0001-Don-t-build-demos-with-questionably-licensed-data.patch \
           file://0001-Modify-parameter-in-vulkan-demo-computenbody.patch \
           "
UPSTREAM_CHECK_COMMITS = "1"
SRCREV = "a2a604be473c829763854ffb34f7978bc0358afb"
UPSTREAM_CHECK_GITTAGREGEX = "These are not the releases you're looking for"
S = "${WORKDIR}/git"

REQUIRED_DISTRO_FEATURES = 'vulkan'

inherit cmake features_check pkgconfig
DEPENDS = "vulkan-loader assimp wayland-protocols wayland-native"

do_install:append () {

    mv ${D}${bindir}/screenshot ${D}${bindir}/vulkan-screenshot
}

EXTRA_OECMAKE = "-DRESOURCE_INSTALL_DIR=${datadir}/vulkan-demos"

ANY_OF_DISTRO_FEATURES = "x11 wayland"

# Can only pick one of [wayland,xcb]
PACKAGECONFIG = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', 'xcb', d)}"
PACKAGECONFIG[wayland] = "-DUSE_WAYLAND_WSI=ON, -DUSE_WAYLAND_WSI=OFF, wayland"
PACKAGECONFIG[xcb] = ",,libxcb"
