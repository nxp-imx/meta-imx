require recipes-multimedia/gstreamer/gstreamer1.0-plugins-base.inc
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/gstreamer1.0-plugins-base:"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

LIC_FILES_CHKSUM = "file://COPYING;md5=c54ce9345727175ff66d17b67ff51f58 \
                    file://COPYING.LIB;md5=6762ed442b3822387a51c92d928ead0d \
                    file://common/coverage/coverage-report.pl;beginline=2;endline=17;md5=a4e1830fce078028c8f0974161272607"

# Enable pango lib
PACKAGECONFIG_append = " pango "

# ion allocator will be enabled only when detecting the ion.h exists, which is built out from kernel.
# Now, ion allocator can be supported on all i.MX platform
DEPENDS_append = " virtual/kernel"

# Remove gio-unix-2.0 as it does not seem to exist anywhere
PACKAGECONFIG_remove = "gio-unix-2.0"
# Overwrite the unrecognised option which is set in gstreamer1.0-plugins-base.inc under poky layer
PACKAGECONFIG[gio-unix-2.0] = ""

# Disable introspection to fix [GstGL-1.0.gir] Error
EXTRA_OECONF_append = " --disable-introspection --disable-opengl --enable-wayland"

GST1.0-PLUGINS-BASE_SRC ?= "gitsm://source.codeaurora.org/external/imx/gst-plugins-base.git;protocol=https"
SRCBRANCH = "imx-1.14.x"

SRC_URI = " \
    ${GST1.0-PLUGINS-BASE_SRC};branch=${SRCBRANCH} \
    file://0001-introspection.m4-prefix-pkgconfig-paths-with-PKG_CON.patch \
    file://make-gio_unix_2_0-dependency-configurable.patch \
"
SRCREV = "04bafd740a52757f12496206cfabe282835a1eb5"

EXTRA_AUTORECONF = ""

FILES_${PN} += "/usr/lib/gstreamer-1.0/include"

PV = "1.14.0.imx"

S = "${WORKDIR}/git"

