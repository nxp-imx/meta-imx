FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI += " \
    file://0001-MGS-8163-fix-fix-the-surface-resize-logic-when-use-w.patch \
    file://0002-fix-wayland-restore-focus-during-window-resize.patch \
    file://0003-fix-wayland-get-surface-extent-from-window-instead-o.patch"
inherit pkgconfig

# Can only pick one of [wayland,xcb]
PACKAGECONFIG = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', 'xcb', d)}"
PACKAGECONFIG[wayland] = " \
    -DVKB_WSI_SELECTION=WAYLAND -DVKB_ray_tracing_position_fetch=OFF -DGLFW_BUILD_WAYLAND=true -DGLFW_BUILD_X11=false -DGLFW_INCLUDE_VULKAN=true, \
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
