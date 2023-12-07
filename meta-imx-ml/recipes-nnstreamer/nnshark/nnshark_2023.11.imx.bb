SUMMARY = "A GStreamer NNstreamer pipelines real-time profiling plugin"
HOMEPAGE = "https://github.com/nnstreamer/nnshark"

LICENSE = "GPL-2.0-only & LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=e1caa368743492879002ad032445fa97 \
                    file://COPYING.LESSER;md5=66c40c88533cd228b5b85936709801c8"
DEPENDS = "\
        gstreamer1.0 \
        gstreamer1.0-plugins-base \
        gstreamer1.0-plugins-bad \
        libgpuperfcnt \
        perf \
"

NNSHARK_SRC ?= "gitsm://github.com/nxp-imx/nnshark.git;protocol=https"
SRCBRANCH ?= "2023.11.imx"
SRC_URI = "${NNSHARK_SRC};branch=${SRCBRANCH}"
SRCREV = "a5096a6dd1e05c9f1aa4613d9ff3fa46ef205883"

S = "${WORKDIR}/git"

inherit pkgconfig autotools-brokensep

EXTRA_OECONF = " \
        --disable-graphviz \
        --disable-gtk-doc \
"


do_configure:prepend() {
    sh autogen.sh --noconfigure
}

FILES:${PN} += "\
       ${libdir}/gstreamer-1.0/libgstsharktracers.so  \
       ${libdir}/gstreamer-1.0/libgstsharktracers.la \
"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
