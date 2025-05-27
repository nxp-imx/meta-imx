FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://0001-The-workload-of-case-16bit_arithmetic-is-heavy-for-8.patch \
            file://0002-MGS-8163-fix-fix-the-surface-resize-logic-when-use-w.patch"

inherit pkgconfig

# Can only pick one of [wayland,xcb]
PACKAGECONFIG = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', 'xcb', d)}"
PACKAGECONFIG[wayland] = " \
    -DVKB_WSI_SELECTION=WAYLAND -DGLFW_BUILD_WAYLAND=true -DGLFW_BUILD_X11=false -DGLFW_INCLUDE_VULKAN=true, \
    , \
    wayland wayland-native wayland-protocols libxkbcommon, \
    , \
    , \
    xcb"
PACKAGECONFIG[xcb] = " \
    , \
    , \
    libxcb, \
    , \
    , \
    wayland"

do_install:append() {
    install -m 0755 ${B}/app/bin/aarch64/vulkan_samples ${D}${bindir}
    cp -r ${S}/assets ${D}${bindir}/
    cp -r ${S}/shaders ${D}${bindir}/
}
