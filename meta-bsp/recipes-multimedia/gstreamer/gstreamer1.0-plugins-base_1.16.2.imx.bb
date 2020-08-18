require recipes-multimedia/gstreamer/gstreamer1.0-plugins-base_1.16.2.bb

FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/${PN}:"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

GST1.0-PLUGINS-BASE_SRC ?= "gitsm://source.codeaurora.org/external/imx/gst-plugins-base.git;protocol=https"
SRCBRANCH = "MM_04.05.06_2008_L5.4.47"
SRCREV = "3c4aa2a58576d68f6e684efa58609665679c9969"
SRC_URI = " \
    ${GST1.0-PLUGINS-BASE_SRC};branch=${SRCBRANCH} \
    file://0001-introspection.m4-prefix-pkgconfig-paths-with-PKG_CON.patch \
    file://make-gio_unix_2_0-dependency-configurable.patch \
    file://0002-Makefile.am-prefix-calls-to-pkg-config-with-PKG_CONF.patch \
    file://0003-riff-add-missing-include-directories-when-calling-in.patch \
    file://0004-rtsp-drop-incorrect-reference-to-gstreamer-sdp-in-Ma.patch \
"

S = "${WORKDIR}/git"

inherit gettext gobject-introspection use-imx-headers

DEPENDS_append_imxgpu2d = " virtual/libg2d"

# This remove "--exclude=autopoint" option from autoreconf argument to avoid
# configure.ac:30: error: required file './ABOUT-NLS' not found
EXTRA_AUTORECONF = ""

# Disable introspection to fix [GstPlayer-1.0.gir] Error
EXTRA_OECONF += " \
    --disable-introspection \
    CPPFLAGS="-I${STAGING_INCDIR_IMX}" \
    --disable-opengl \
"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
