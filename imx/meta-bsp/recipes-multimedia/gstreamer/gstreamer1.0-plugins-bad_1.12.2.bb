include recipes-multimedia/gstreamer/gstreamer1.0-plugins-bad.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/${PN}:"
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"
#FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/meta-fsl-bsp-release/imx/meta-bsp/recipes-multimedia/gstreamer/${PN}:"

LIC_FILES_CHKSUM = "file://COPYING;md5=73a5855a8119deb017f5f13cf327095d \
                    file://COPYING.LIB;md5=21682e4e8fea52413fd26c60acb907e5 \
"

SRC_URI = " \
    http://gstreamer.freedesktop.org/src/gst-plugins-bad/gst-plugins-bad-${PV}.tar.xz \
    file://configure-allow-to-disable-libssh2.patch \
    file://fix-maybe-uninitialized-warnings-when-compiling-with-Os.patch \
    file://avoid-including-sys-poll.h-directly.patch \
"


SRC_URI[md5sum] = "5683f0ea91f9e1e0613b0f6f729980a7"
SRC_URI[sha256sum] = "9c2c7edde4f59d74eb414e0701c55131f562e5c605a3ce9b091754f106c09e37"

S = "${WORKDIR}/gst-plugins-bad-${PV}"
