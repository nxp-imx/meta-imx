include recipes-multimedia/gstreamer/gstreamer1.0-plugins-bad.inc

FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/${PN}:"
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"

LIC_FILES_CHKSUM = "file://COPYING;md5=73a5855a8119deb017f5f13cf327095d \
                    file://COPYING.LIB;md5=21682e4e8fea52413fd26c60acb907e5 \
                    file://gst/tta/crc32.h;beginline=12;endline=29;md5=27db269c575d1e5317fffca2d33b3b50 \
                    file://gst/tta/filters.h;beginline=12;endline=29;md5=8a08270656f2f8ad7bb3655b83138e5a"

SRC_URI = " \
    http://gstreamer.freedesktop.org/src/gst-plugins-bad/gst-plugins-bad-${PV}.tar.xz \
    file://configure-allow-to-disable-libssh2.patch \
    file://fix-maybe-uninitialized-warnings-when-compiling-with-Os.patch \
    file://avoid-including-sys-poll.h-directly.patch \
"

SRC_URI_remove = " \
    file://0003-Add-directviv-to-glimagesink-to-improve-playback-per.patch \
    file://0004-MMFMWK-6930-glplugin-Accelerate-gldownload-with-dire.patch \
    file://0005-Fix-dependence-issue-between-gst-plugin-.patch \
    file://0008-glplugin-glcolorconvert-fix-MRT-cannot-work-in-GLES3.patch \
    file://0009-MMFMWK-7308-Fix-build-issue-on-non-GPU-soc.patch \
"

SRC_URI[md5sum] = "86916b5c8e5923cc070c1548f270e9b9"
SRC_URI[sha256sum] = "3d5f9d16e1a3ee7c5c024494cc3a3420007bfdce6f94511317ae004972811c4f"

S = "${WORKDIR}/gst-plugins-bad-${PV}"
