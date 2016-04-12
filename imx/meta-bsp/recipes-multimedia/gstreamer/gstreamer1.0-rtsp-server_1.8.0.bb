include recipes-multimedia/gstreamer/gstreamer1.0-rtsp-server.inc
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/${PN}:"
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"

LIC_FILES_CHKSUM = "file://COPYING;md5=6762ed442b3822387a51c92d928ead0d"

SRC_URI[md5sum] = "8947eba08408a7f71beeb006e1c65dd9"
SRC_URI[sha256sum] = "b075d9780985e133149f59a74a1ea7385ab147f65ffa6640e122447a0185362c"

FILES_${PN} += "${libdir}/gstreamer-1.0/libgstrtspclientsink.so ${libdir}/gstreamer-1.0/libgstrtspclientsink.la"
