SUMMARY = "Vulkan benchmarking suite."
DESCRIPTION = "vkmark is an extensible Vulkan benchmarking suite with \
               targeted, configurable scenes."
SECTION = "graphics"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING-LGPL2.1;md5=4fbd65380cdd255951079008b364516c"

DEPENDS = "vulkan-loader assimp glm"

# See meson.build for base version
PV = "2025.01+git"

SRC_URI = " \
    git://github.com/vkmark/vkmark;protocol=https;branch=master \
    file://0001-scenes-Use-depth-format-supported-by-i.MX.patch"
SRCREV = "83a128d65b1adddfacb4fa2e555a7e90817a7266"

inherit meson pkgconfig

PACKAGECONFIG ?= " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', \
       bb.utils.contains('DISTRO_FEATURES',     'x11',     'x11', \
                                                            'fb', d), d)} \
"

PACKAGECONFIG[fb] = ",,libdrm libgbm"
PACKAGECONFIG[wayland] = ",,wayland-native wayland-protocols"
PACKAGECONFIG[x11] = ",,libxcb"
