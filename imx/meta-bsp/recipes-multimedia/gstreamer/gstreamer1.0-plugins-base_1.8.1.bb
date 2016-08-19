include recipes-multimedia/gstreamer/gstreamer1.0-plugins-base.inc

# Add extra patch directory
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/${PN}:"

LIC_FILES_CHKSUM = "file://COPYING;md5=c54ce9345727175ff66d17b67ff51f58 \
                    file://COPYING.LIB;md5=6762ed442b3822387a51c92d928ead0d \
                    file://common/coverage/coverage-report.pl;beginline=2;endline=17;md5=a4e1830fce078028c8f0974161272607"


SRC_URI = " \
    http://gstreamer.freedesktop.org/src/gst-plugins-base/gst-plugins-base-${PV}.tar.xz \
"


SRC_URI[md5sum] = "5421edfeb7479d5f5776e917ba30e24e"
SRC_URI[sha256sum] = "15a9de985cd265c344e359f5b19347df4021b7611ed2c2d91917cb900f2fad6f"

S = "${WORKDIR}/gst-plugins-base-${PV}"
