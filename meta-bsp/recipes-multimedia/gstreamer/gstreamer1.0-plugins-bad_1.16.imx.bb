require recipes-multimedia/gstreamer/gstreamer1.0-plugins-bad_1.16.1.bb

DEPENDS += "jpeg libdrm"
DEPENDS_append_imxgpu2d = " virtual/libg2d"

PV = "1.16.1.imx"

FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/${PN}:"
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"

GST1.0-PLUGINS-BAD_SRC ?= "gitsm://source.codeaurora.org/external/imx/gst-plugins-bad.git;protocol=https"
SRCBRANCH = "imx-1.16.x"
SRCREV = "25fe13385c73a9e99e1ee4971239c7aac13b33ca"
SRC_URI = " \
    ${GST1.0-PLUGINS-BAD_SRC};branch=${SRCBRANCH} \
    file://configure-allow-to-disable-libssh2.patch \
    file://fix-maybe-uninitialized-warnings-when-compiling-with-Os.patch \
    file://avoid-including-sys-poll.h-directly.patch \
    file://ensure-valid-sentinels-for-gst_structure_get-etc.patch \
    file://0001-introspection.m4-prefix-pkgconfig-paths-with-PKG_CON.patch \
"

S = "${WORKDIR}/git"

# This remove "--exclude=autopoint" option from autoreconf argument to avoid
# configure.ac:30: error: required file './ABOUT-NLS' not found
EXTRA_AUTORECONF = ""

PACKAGE_ARCH_imxpxp = "${MACHINE_SOCARCH}"
PACKAGE_ARCH_mx8 = "${MACHINE_SOCARCH}"

PACKAGECONFIG_append_mx6q = " opencv"
PACKAGECONFIG_append_mx6qp = " opencv"
PACKAGECONFIG_append_mx8 = " opencv kms"

#Remove vulkan as it's incompatible for i.MX 8M Mini
PACKAGECONFIG_remove_mx8mm = " vulkan"

# Disable introspection to fix [GstPlayer-1.0.gir] Error
EXTRA_OECONF += " \
    --disable-introspection \
"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
