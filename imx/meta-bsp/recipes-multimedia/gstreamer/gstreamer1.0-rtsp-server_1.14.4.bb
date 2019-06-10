require recipes-multimedia/gstreamer/gstreamer1.0-rtsp-server.inc

# Re-use patch files from 1.12.2 recipe
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/gstreamer1.0-rtsp-server:"

SRC_URI[md5sum] = "ab0fb5c829266a500e14b46b7bdf06bf"
SRC_URI[sha256sum] = "3d0ece2afdcd601c175ece24e32a30bc19247b454f4eafd3deeec2533c6884f1"

# Disable introspection to fix [GstRtsp-1.0.gir] Error
EXTRA_OECONF_append = " --disable-introspection"

LIC_FILES_CHKSUM = "file://COPYING;md5=6762ed442b3822387a51c92d928ead0d"

