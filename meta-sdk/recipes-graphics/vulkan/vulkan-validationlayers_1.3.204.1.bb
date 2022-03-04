SUMMARY = "Vulkan ValidationLayers"
DESCRIPTION = "This project provides Vulkan validation layers that \
can be enabled to assist development by enabling developers to verify \
their applications correct use of the Vulkan API."
HOMEPAGE = "https://www.khronos.org/vulkan/"
BUGTRACKER = "https://github.com/KhronosGroup/Vulkan-ValidationLayers"
SECTION = "libs"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8df9e8826734226d08cb412babfa599c"
SRC_URI = "git://github.com/KhronosGroup/Vulkan-ValidationLayers.git;protocol=https;branch=sdk-1.3.204"

SRCREV = "26dc8574c8ceafc901e1bbd7a0929da7e0a5df20"

S = "${WORKDIR}/git"

REQUIRED_DISTRO_FEATURES = "vulkan"

inherit cmake features_check
ANY_OF_DISTRO_FEATURES = "x11 wayland"

DEPENDS = "vulkan-headers glslang spirv-tools spirv-headers"

EXTRA_OECMAKE = " \
    -DGLSLANG_INSTALL_DIR=${STAGING_DIR_HOST}/usr \
    -DSPIRV_HEADERS_INSTALL_DIR=${STAGING_DIR_HOST}/usr \
    -DSPIRV_TOOLS_INSTALL_DIR=${STAGING_DIR_HOST}/usr \
    -DUSE_ROBIN_HOOD_HASHING=OFF \
"

# must choose x11 or wayland or both
PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'wayland x11', d)}"

PACKAGECONFIG[x11] = "-DBUILD_WSI_XLIB_SUPPORT=ON -DBUILD_WSI_XCB_SUPPORT=ON -DDEMOS_WSI_SELECTION=XCB, -DBUILD_WSI_XLIB_SUPPORT=OFF -DBUILD_WSI_XCB_SUPPORT=OFF -DDEMOS_WSI_SELECTION=WAYLAND, libxcb libx11 libxrandr"
PACKAGECONFIG[wayland] = "-DBUILD_WSI_WAYLAND_SUPPORT=ON, -DBUILD_WSI_WAYLAND_SUPPORT=OFF, wayland"

# The output library is unversioned
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

RRECOMMENDS:${PN} = "mesa-vulkan-drivers"

UPSTREAM_CHECK_GITTAGREGEX = "sdk-(?P<pver>\d+(\.\d+)+)"
