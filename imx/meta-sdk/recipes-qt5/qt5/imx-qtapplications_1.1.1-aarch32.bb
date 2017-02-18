# Copyright (C) 2014-2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale QT Multimedia applications"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=88595f92466edd79be7f4f9547ffa0ef"

inherit fsl-eula-unpack pkgconfig

# base on QtMultimedia v5.2.1
DEPENDS += "qtmultimedia gstreamer1.0 gstreamer1.0-plugins-base imx-gst1.0-plugin"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true \
           file://qtimxplayer.desktop \
           file://qtimxcamera.desktop \
"
SRC_URI[md5sum] = "8de6fb1d8766f106d9a99029d6c664e2"
SRC_URI[sha256sum] = "39963c3fd51e7ebdc8c466b86eab05ddac3f4ba63fcee3ed1b448a641e890f0a"

USE_X11 = "${@bb.utils.contains("DISTRO_FEATURES", "x11", "yes", "no", d)}"

# for now, imxcamera & imxplayer can only be supported on x11 backend
# but test_qmlglsrc & test_qmlglsink can be supported on all backends
do_install () {
    if [ "${USE_X11}" = "yes" ]; then
        install -d ${D}${datadir}/applications
        install -m 0644 ${WORKDIR}/qt*.desktop ${D}${datadir}/applications
        install -d ${D}${datadir}/qt5
        cp -r ${S}/usr/share/qt5/examples ${D}${datadir}/qt5
        install -d ${D}${datadir}/pixmaps
        cp -r ${S}/usr/share/pixmaps/* ${D}${datadir}/pixmaps
    else
        install -d ${D}${datadir}/qt5/examples/multimedia/
        cp -r ${S}/usr/share/qt5/examples/multimedia/qmlgltest/ ${D}${datadir}/qt5/examples/multimedia/
    fi
}

FILES_${PN} = " \
    ${datadir}/qt5/examples/*/* \
    ${datadir}/applications/* \
    ${datadir}/pixmaps/* \
"

INSANE_SKIP_${PN} += "debug-files"

COMPATIBLE_MACHINE = "(mx6|mx7ulp)"


