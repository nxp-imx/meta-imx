include recipes-multimedia/gstreamer/gstreamer1.0-plugins-ugly.inc

FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"

LIC_FILES_CHKSUM = "file://COPYING;md5=a6f89e2100d9b6cdffcea4f398e37343 \
                    file://tests/check/elements/xingmux.c;beginline=1;endline=21;md5=4c771b8af188724855cb99cadd390068"

SRC_URI = " \
    http://gstreamer.freedesktop.org/src/gst-plugins-ugly/gst-plugins-ugly-${PV}.tar.xz \
"

SRC_URI[md5sum] = "eb639021905a32cf3013ca5bac1b694d"
SRC_URI[sha256sum] = "1cc3942bbf3ea87da3e35437d4e014e991b103db22a6174f62a98c89c3f5f466"

# Remove unrecognised options: --disable-mad
EXTRA_OECONF_remove = " --disable-mad"

S = "${WORKDIR}/gst-plugins-ugly-${PV}"
