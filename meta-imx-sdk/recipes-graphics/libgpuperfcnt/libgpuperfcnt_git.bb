# Copyright 2026 NXP
DESCRIPTION = "A library to retrieve i.MX GPU information"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0858ec9c7a80c4a2cf16e4f825a2cc91"

PV = "1.4.0+git"

SRC_URI = "${GPUPERFCNT};branch=${SRCBRANCH}"
GPUPERFCNT ?= "https://github.com/nxp-imx/libgpuperfcnt.git;protocol=https"
SRCBRANCH = "release"
SRCREV = "00f2448c4c2f9fe42042baf1dc7676bec6cbbb43"

inherit cmake pkgconfig

PACKAGECONFIG         ??= "vivante"
PACKAGECONFIG:imxmali ??= "mali"

PACKAGECONFIG[mali] = "-DMALI_GPU=1,,mali-imx,,,vivante"
PACKAGECONFIG[vivante] = ",,imx-gpu-viv,,,mali"

EXTRA_OECMAKE = " \
    -DCMAKE_POLICY_VERSION_MINIMUM=3.5 \
    -DENABLE_SHARED=ON \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '', \
       bb.utils.contains('DISTRO_FEATURES', 'x11',     '-DENABLE_X11=ON',\
                                                       '-DENABLE_FB=ON', d), d)} \
"

do_compile:append () {
    oe_runmake -C ${S} man
}

do_install:append () {
    install -d ${D}/${mandir}
    install -m 0444 ${S}/man/* ${D}/${mandir}
}

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
