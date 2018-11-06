FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI_append= " \
    file://0001-CMakeLists.txt-Fix-compilation-issues-with-layersVT.patch \
"
DEPENDS_remove = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'vulkan-loader-layers xcb-util-keysyms', \
        bb.utils.contains('DISTRO_FEATURES',     'x11', 'vulkan-loader-layers', \
                                                        '', d), d)}"
DEPENDS_append = " vulkan"

REQUIRED_DISTRO_FEATURES_remove = "x11"

# supported for both x11 and wayland
ANY_OF_DISTRO_FEATURES = "x11 wayland"

EXTRA_OECMAKE_remove = " \
    -DBUILD_VKTRACE=1 \
    -DBUILD_WSI_WAYLAND_SUPPORT=0 \
"
EXTRA_OECMAKE_append = " \
    -DBUILD_VKTRACE=0 \
"
EXTRA_OECMAKE_append = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', ' -DBUILD_WSI_WAYLAND_SUPPORT=1 -DBUILD_WSI_XCB_SUPPORT=0 -DBUILD_WSI_XLIB_SUPPORT=0', \
        bb.utils.contains('DISTRO_FEATURES',     'x11', ' -DBUILD_WSI_WAYLAND_SUPPORT=0', \
                                                        '', d), d)}"
