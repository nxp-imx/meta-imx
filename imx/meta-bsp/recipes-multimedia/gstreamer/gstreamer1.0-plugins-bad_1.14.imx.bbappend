
SRCBRANCH = "imx-1.14.x"
SRCREV = "584eab616fa3fb15ac8500f5a026ed68563c9f6f"
PV = "1.14.4.imx"

DEPENDS += "libdrm "

FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/${PN}:"

SRC_URI_append = " \
    file://fix-maybe-uninitialized-warnings-when-compiling-with-Os.patch \
    file://avoid-including-sys-poll.h-directly.patch \
    file://ensure-valid-sentinels-for-gst_structure_get-etc.patch \
    file://0001-introspection.m4-prefix-pkgconfig-paths-with-PKG_CON.patch \
"
SRC_URI_remove = "file://0001-opencv-fix-build-for-opencv-3-4-2.patch"

#Remove vulkan as it's incompatible for i.MX 8M Mini
PACKAGECONFIG_remove_mx8mm = " vulkan"

PACKAGECONFIG[vulkan]          = "--enable-vulkan,--disable-vulkan,vulkan-headers"
PACKAGECONFIG[lcms2]           = "--enable-lcms2,--disable-lcms2,lcms"
PACKAGECONFIG[openmpt]         = "--enable-openmpt,--disable-openmpt,libopenmpt"
