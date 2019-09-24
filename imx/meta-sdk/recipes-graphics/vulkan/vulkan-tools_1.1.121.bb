SUMMARY = "Vulkan Tools"
DESCRIPTION = "This project provides Vulkan tools and utilities that \
               can assist development by enabling developers to verify their \
               applications correct use of the Vulkan API."
SECTION = "graphics"
HOMEPAGE = "https://github.com/LunarG/VulkanTools"

DEPENDS = "vulkan-headers vulkan-loader"

inherit cmake python3native

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

S = "${WORKDIR}/git"

SRCREV = "ea8f6f0a3cdfc79bddf3566bf3f4b8350436695b"
SRC_URI = "git://github.com/KhronosGroup/Vulkan-Tools.git;branch=sdk-${PV} \
"
# must choose x11 or wayland or both
PACKAGECONFIG ??= "${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'x11', '' ,d)} \
                   ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', '' ,d)}"

PACKAGECONFIG[x11] = "-DBUILD_WSI_XLIB_SUPPORT=ON -DBUILD_WSI_XCB_SUPPORT=ON -DCUBE_WSI_SELECTION=XCB, -DBUILD_WSI_XLIB_SUPPORT=OFF -DBUILD_WSI_XCB_SUPPORT=OFF -DCUBE_WSI_SELECTION=WAYLAND, libxcb libx11"
PACKAGECONFIG[wayland] = "-DBUILD_WSI_WAYLAND_SUPPORT=ON, -DBUILD_WSI_WAYLAND_SUPPORT=OFF, wayland"
