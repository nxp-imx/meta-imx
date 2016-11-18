include recipes-multimedia/gstreamer/gstreamer1.0-plugins-ugly.inc

FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"

LIC_FILES_CHKSUM = "file://COPYING;md5=a6f89e2100d9b6cdffcea4f398e37343 \
                    file://tests/check/elements/xingmux.c;beginline=1;endline=21;md5=4c771b8af188724855cb99cadd390068"

SRC_URI = " \
    http://gstreamer.freedesktop.org/src/gst-plugins-ugly/gst-plugins-ugly-${PV}.tar.xz \
"

SRC_URI[md5sum] = "a640a30f3b1bac2257f0dcaad283660b"
SRC_URI[sha256sum] = "97de8d1903abb54305732e6b8781c8c42f5cc5a2a548a8f31b38c189e81a55e0"

S = "${WORKDIR}/gst-plugins-ugly-${PV}"
