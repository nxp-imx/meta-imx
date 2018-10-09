require recipes-multimedia/gstreamer/gstreamer1.0-rtsp-server.inc

# Re-use patch files from 1.12.2 recipe
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/gstreamer1.0-rtsp-server:"

SRC_URI[md5sum] = "8a505c88f7469c3a0d1e9f4e9a315e53"
SRC_URI[sha256sum] = "6b65a077bed815f6d3157ebea503cc9f3c32d289af2756b7ff7e3958744d9756"

# Disable introspection to fix [GstRtsp-1.0.gir] Error
EXTRA_OECONF_append = " --disable-introspection"

LIC_FILES_CHKSUM = "file://COPYING;md5=6762ed442b3822387a51c92d928ead0d"

