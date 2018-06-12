FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
# Enable pango lib
PACKAGECONFIG_append = " pango "

# ion allocator will be enabled only when detecting the ion.h exists, which is built out from kernel.
# Now, ion allocator can be supported on all i.MX platform
DEPENDS_append = " virtual/kernel"

# Remove gio-unix-2.0 as it does not seem to exist anywhere
PACKAGECONFIG_remove = "gio-unix-2.0"
# Overwrite the unrecognised option which is set in gstreamer1.0-plugins-base.inc under poky layer
PACKAGECONFIG[gio-unix-2.0] = ""

# Use i.MX fork of GST for customizations
SRC_URI_remove_imx = " \
    http://gstreamer.freedesktop.org/src/gst-plugins-base/gst-plugins-base-${PV}.tar.xz \
    file://0003-ssaparse-enhance-SSA-text-lines-parsing.patch \
    file://0004-subparse-set-need_segment-after-sink-pad-received-GS.patch \
    file://get-caps-from-src-pad-when-query-caps.patch \
"

GST1.0-PLUGINS-BASE_SRC ?= "gitsm://source.codeaurora.org/external/imx/gst-plugins-base.git;protocol=https"
SRCBRANCH = "MM_04.03.05_1804_L4.9.88_MX7ULP_GA"

SRC_URI_append_imx = " \
    ${GST1.0-PLUGINS-BASE_SRC};branch=${SRCBRANCH} \
"
SRCREV_imx = "7b637f65e7ce2b03c5adb7624501e74c575ac0f2"

EXTRA_AUTORECONF = ""

S_imx = "${WORKDIR}/git"
