SRC_URI:remove = "gitsm://github.com/KhronosGroup/Vulkan-Samples.git;branch=master;protocol=https;lfs=0"
SRC_URI:prepend = "gitsm://github.com/prabhusundar/Vulkan-Samples.git;branch=master;protocol=https;lfs=0 "
SRCREV = "f969381ecff383efa4020abeb966c16b7ad1f055"

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

do_install() {
    install -d ${D}${bindir}
    cp ${B}/app/bin/aarch64/vulkan_samples ${D}${bindir}/
    chmod a+x ${D}${bindir}/vulkan_samples
    cp -r ${S}/assets ${D}${bindir}/
    cp -r ${S}/shaders ${D}${bindir}/
}
