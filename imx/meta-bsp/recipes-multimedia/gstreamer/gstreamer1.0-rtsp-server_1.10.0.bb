include recipes-multimedia/gstreamer/gstreamer1.0-rtsp-server.inc

FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/${PN}:"
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"

LIC_FILES_CHKSUM = "file://COPYING;md5=6762ed442b3822387a51c92d928ead0d"

SRC_URI[md5sum] = "c6f8df68b4dcd4ea7e44098ffe115571"
SRC_URI[sha256sum] = "aa72a94cccdd2387ad25dc65c5c0b1f76269c3997cbde348232eec2a1565b3cd"
