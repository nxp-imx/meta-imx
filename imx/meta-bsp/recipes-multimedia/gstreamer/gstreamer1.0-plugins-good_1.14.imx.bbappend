SRCBRANCH = "imx-1.14.x"
SRCREV = "a31aabb7581d3f491cd31889d44479bb0f34990b"
PV = "1.14.4.imx"

DEPENDS_append = " libdrm"

RPROVIDES_${PN}-pulseaudio += "${PN}-pulse"

FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/${PN}:"
SRC_URI_append = " \
    file://avoid-including-sys-poll.h-directly.patch \
    file://ensure-valid-sentinel-for-gst_structure_get.patch \
    file://0001-introspection.m4-prefix-pkgconfig-paths-with-PKG_CON.patch \
"

PACKAGECONFIG_append = " bz2 lame mpg123 zlib"

PACKAGECONFIG[bz2]        = "--enable-bz2,--disable-bz2,bzip2"
PACKAGECONFIG[gtk]        = "--enable-gtk3,--disable-gtk3,gtk+3"
PACKAGECONFIG[lame]       = "--enable-lame,--disable-lame,lame"
PACKAGECONFIG[mpg123]     = "--enable-mpg123,--disable-mpg123,mpg123"
PACKAGECONFIG[zlib]       = "--enable-zlib,--disable-zlib,zlib"

# qt5 support is disabled, because it is not present in OE core, and requires more work than
# just adding a packageconfig (it requires access to moc, uic, rcc, and qmake paths).
# This is better done in a separate qt5 layer (which then should add a "qt5" packageconfig
# in a gstreamer1.0-plugins-good bbappend).
EXTRA_OECONF_append = " --disable-qt \
                        --disable-twolame \
"
