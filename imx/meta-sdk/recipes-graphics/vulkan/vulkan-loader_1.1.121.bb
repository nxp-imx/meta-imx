SUMMARY = "Vulkan loader"
DESCRIPTION = "Vulkan loader is responsible for working with the various \
layers as well as supporting multiple GPUs and their drivers.The loader is \
critical to managing the proper dispatching of Vulkan functions to the appropriate \
set of layers and ICDs."
HOMEPAGE = "https://www.khronos.org/vulkan/"
BUGTRACKER = "https://github.com/KhronosGroup/Vulkan-Loader"
SECTION = "libs"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7dbefed23242760aa3475ee42801c5ac\
                    file://loader/loader.c;endline=25;md5=c8504be00044f3e1e66eee32d3bd6548"
SRC_URI = "git://github.com/KhronosGroup/Vulkan-Loader.git;branch=sdk-1.1.121 \
           "
SRCREV = "a34eada3197b96e46bea3ad4b83bfa4b4396e2ea"
UPSTREAM_CHECK_GITTAGREGEX = "sdk-(?P<pver>\d+(\.\d+)+)"

S = "${WORKDIR}/git"

REQUIRED_DISTRO_FEATURES = "vulkan"

inherit cmake python3native lib_package distro_features_check
ANY_OF_DISTRO_FEATURES = "x11 wayland"

DEPENDS = "vulkan-headers"

EXTRA_OECMAKE = "-DBUILD_TESTS=OFF"

# must choose x11 or wayland or both
PACKAGECONFIG ??= "${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'x11', '' ,d)} \
                   ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', '' ,d)}"

PACKAGECONFIG[x11] = "-DBUILD_WSI_XLIB_SUPPORT=ON -DBUILD_WSI_XCB_SUPPORT=ON -DDEMOS_WSI_SELECTION=XCB, -DBUILD_WSI_XLIB_SUPPORT=OFF -DBUILD_WSI_XCB_SUPPORT=OFF -DDEMOS_WSI_SELECTION=WAYLAND, libxcb libx11 libxrandr"
PACKAGECONFIG[wayland] = "-DBUILD_WSI_WAYLAND_SUPPORT=ON, -DBUILD_WSI_WAYLAND_SUPPORT=OFF, wayland"
