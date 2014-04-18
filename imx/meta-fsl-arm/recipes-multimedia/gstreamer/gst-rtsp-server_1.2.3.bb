SUMMARY = "GStreamer RTSP server"
LICENSE = "LGPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=6762ed442b3822387a51c92d928ead0d"

SRC_URI = "http://gstreamer.freedesktop.org/src/${BPN}/${BPN}-${PV}.tar.xz \
           "
SRC_URI[md5sum] = "239f805e755deb388162e957fcffff1d"
SRC_URI[sha256sum] = "c12befa5ec63818842c150725d3e9e38bf9948366317b67dc2536dfd00765da1"

DEPENDS = "gstreamer1.0-plugins-base gstreamer1.0"

# Configure always checks for Python so inherit pythonnative. Better solution
# would be to disable the checks entirely.
inherit autotools pythonnative gettext

FILES_${PN}-dev += "${datadir}/vala/vapi/"
