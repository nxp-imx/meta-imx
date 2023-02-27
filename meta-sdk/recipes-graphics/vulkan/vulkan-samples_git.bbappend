SRC_URI:remove = "gitsm://github.com/KhronosGroup/Vulkan-Samples.git;branch=main;protocol=https;lfs=0"
SRC_URI += " \
    gitsm://github.com/KhronosGroup/Vulkan-Samples.git;branch=main;protocol=https;lfs=0;name=main \
    git://github.com/glfw/glfw.git;branch=master;protocol=https;name=glfw;destsuffix=git/third_party/glfw"
SRCREV_FORMAT = "main_glfw"
SRCREV_main = "8b945bebf8b2fd987dcf0eeca048068adf4ea44d"
SRCREV_glfw = "8f470597d625ae28758c16b4293dd42d63e8a83a"

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
