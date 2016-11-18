include recipes-multimedia/gstreamer/gstreamer1.0.inc
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"

LIC_FILES_CHKSUM = "file://COPYING;md5=6762ed442b3822387a51c92d928ead0d \
                    file://gst/gst.h;beginline=1;endline=21;md5=e059138481205ee2c6fc1c079c016d0d"

SRC_URI = " \
    http://gstreamer.freedesktop.org/src/gstreamer/gstreamer-${PV}.tar.xz \
"

SRC_URI[md5sum] = "561f93d5fc8664c329c8717b52578b8c"
SRC_URI[sha256sum] = "1e7778fabe480185bfc4ce552f0860de1443f6618a68a86ccdd65854fed37207"

S = "${WORKDIR}/gstreamer-${PV}"
