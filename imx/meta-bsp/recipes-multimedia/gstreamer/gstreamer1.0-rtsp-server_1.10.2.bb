include recipes-multimedia/gstreamer/gstreamer1.0-rtsp-server.inc

FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/${PN}:"
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"

LIC_FILES_CHKSUM = "file://COPYING;md5=6762ed442b3822387a51c92d928ead0d"

SRC_URI[md5sum] = "3ed8878f076e84c59b3ed5bd38ab31ed"
SRC_URI[sha256sum] = "822dd6f754fea2bbf3369a7c388372f49b74668fb57943c1888675e544b07235"
