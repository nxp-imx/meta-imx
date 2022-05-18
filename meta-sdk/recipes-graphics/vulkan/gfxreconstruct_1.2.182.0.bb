SUMMARY = "Vulkan benchmarking suite."
DESCRIPTION = "It provides tools for the capture and replay of Vulkan API calls"
SECTION = "graphics"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d2ddcd9b5c3b713fcf90c3223f6b10bd"

SRC_URI = " \
    git://github.com/LunarG/gfxreconstruct.git;protocol=https;branch=dev \
    file://0001-FindVulkanVersion.cmake-Look-for-vulkan-headers-in-s.patch \
    file://0002-make-s_alt_stack-dynamic-save-and-use-probed-size.patch \
"
SRCREV = "75bc5b32da36cb172d57ef28f55d14458279c6f1"
S = "${WORKDIR}/git"

inherit cmake features_check
ANY_OF_DISTRO_FEATURES = "x11 wayland"

DEPENDS = "zstd vulkan-headers"

EXTRA_OECMAKE += "\
    -DCMAKE_BUILD_TYPE=Release \
    -DCMAKE_SYSROOT=${PKG_CONFIG_SYSROOT_DIR} \
"
# must choose x11 or wayland or both
PACKAGECONFIG ??= "${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'x11', '' ,d)} \
                   ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', '' ,d)}"
PACKAGECONFIG[x11] = "-DBUILD_WSI_XCB_SUPPORT=ON, -DBUILD_WSI_XCB_SUPPORT=OFF, libxcb libx11 xcb-util-keysyms"
PACKAGECONFIG[wayland] = "-DBUILD_WSI_WAYLAND_SUPPORT=ON, -DBUILD_WSI_WAYLAND_SUPPORT=OFF, wayland"

FILES:${PN} += "${datadir}/vulkan"
INSANE_SKIP:${PN}-dev += "dev-elf"
