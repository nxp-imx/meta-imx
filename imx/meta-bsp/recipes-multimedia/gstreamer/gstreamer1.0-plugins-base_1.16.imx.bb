require recipes-multimedia/gstreamer/gstreamer1.0-plugins-base_1.16.0.bb

PV = "1.16.0.imx"

FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/${PN}:"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

GST1.0-PLUGINS-BASE_SRC ?= "gitsm://source.codeaurora.org/external/imx/gst-plugins-base.git;protocol=https"
SRCBRANCH = "imx-1.16.x"
SRCREV = "df30480711d68a1c1d2152bf4d6a7b245a85f967"
SRC_URI = " \
    ${GST1.0-PLUGINS-BASE_SRC};branch=${SRCBRANCH} \
    file://0001-introspection.m4-prefix-pkgconfig-paths-with-PKG_CON.patch \
    file://make-gio_unix_2_0-dependency-configurable.patch \
    file://0002-Makefile.am-prefix-calls-to-pkg-config-with-PKG_CONF.patch \
    file://0003-riff-add-missing-include-directories-when-calling-in.patch \
    file://0004-rtsp-drop-incorrect-reference-to-gstreamer-sdp-in-Ma.patch \
"

S = "${WORKDIR}/git"

DEPENDS_append_imxgpu2d = " virtual/libg2d"

# This remove "--exclude=autopoint" option from autoreconf argument to avoid
# configure.ac:30: error: required file './ABOUT-NLS' not found
EXTRA_AUTORECONF = ""

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
