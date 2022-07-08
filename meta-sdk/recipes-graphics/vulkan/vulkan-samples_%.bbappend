FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0005-glfw-fix-glfw3.h-gl-error.patch"

DEPENDS = "extra-cmake-modules"

# Can only pick one of [wayland,xcb]
PACKAGECONFIG = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', 'xcb', d)}"
PACKAGECONFIG[wayland] = "-DVKB_BUILD_WAYLAND=1 -DGLFW_USE_WAYLAND=1, ,wayland wayland-native wayland-protocols libxkbcommon"
PACKAGECONFIG[xcb] = ",,libxcb"

do_install() {
    install -d ${D}${bindir}
    cp ${B}/app/bin/aarch64/vulkan_samples ${D}${bindir}/
    chmod a+x ${D}${bindir}/vulkan_samples
    cp -r ${S}/assets ${D}${bindir}/
    cp -r ${S}/shaders ${D}${bindir}/
}
