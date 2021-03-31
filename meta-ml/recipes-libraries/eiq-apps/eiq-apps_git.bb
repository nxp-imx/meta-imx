DESCRIPTION = "GStreamer Neural Network Inference demo"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"

DEPENDS = "google-coral-posenet gstreamer1.0-plugins-base opencv"
RDEPENDS_${PN} += "google-coral-posenet"

EIQ_APPS_SRC ?= "git://source.codeaurora.org/external/imx/eiq-apps-imx.git;protocol=https"
SRCBRANCH = "lf-5.10.y_1.0.0"

SRC_URI = "${EIQ_APPS_SRC};branch=${SRCBRANCH}"
SRCREV = "82de0a15cee2dc12ddfdd4d3fe7ba1994af5f5db"

inherit autotools pkgconfig

S = "${WORKDIR}/git"

export SDKTARGETSYSROOT = "${RECIPE_SYSROOT}"

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${libdir}/gstreamer-1.0

    install -m 0755 ${S}/src/gstnninferencedemo-* ${D}${bindir}
    install -m 0755 ${B}/src/.libs/libgstnninferencedemo.so ${D}${libdir}/gstreamer-1.0
}

FILES_${PN} += "${libdir}/gstreamer-1.0/*"

COMPATIBLE_MACHINE = "(mx8mm|mx8mp)"
