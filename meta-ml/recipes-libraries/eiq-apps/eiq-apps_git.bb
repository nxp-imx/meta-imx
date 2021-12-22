# Copyright 2021 NXP
DESCRIPTION = "GStreamer Neural Network Inference Demo"
LICENSE = "LGPLv2.0+"
LIC_FILES_CHKSUM = "file://COPYING-LGPL2.0;md5=6762ed442b3822387a51c92d928ead0d \
                    file://COPYING-LGPL2.1;md5=fbc093901857fcd118f065f900982c24"


DEPENDS = "google-coral-posenet gstreamer1.0-plugins-base opencv"

EIQ_APPS_SRC ?= "git://source.codeaurora.org/external/imx/eiq-apps-imx.git;protocol=https"
SRCBRANCH = "lf-5.15.5_1.0.0"

SRC_URI = "${EIQ_APPS_SRC};branch=${SRCBRANCH}"
SRCREV = "4dee4c6b0174048267318e0c6bb9556aeae7ccf7" 

inherit autotools pkgconfig

S = "${WORKDIR}/git"

export SDKTARGETSYSROOT = "${RECIPE_SYSROOT}"

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${libdir}/gstreamer-1.0

    install -m 0755 ${S}/src/gstnninferencedemo-* ${D}${bindir}
    install -m 0755 ${B}/src/.libs/libgstnninferencedemo.so ${D}${libdir}/gstreamer-1.0
}

FILES:${PN} += "${libdir}/gstreamer-1.0/*"

COMPATIBLE_MACHINE = "(mx8mm|mx8mp)"
