# Copyright (C) 2014-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale QT Multimedia applications"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=8cf95184c220e247b9917e7244124c5a"

inherit fsl-eula-unpack autotools pkgconfig

# base on QtMultimedia v5.2.1
DEPENDS += "qtmultimedia gstreamer1.0 gstreamer1.0-plugins-base imx-gst1.0-plugin"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true \
           file://qtimxplayer.desktop \
           file://qtimxcamera.desktop \
"
SRC_URI[md5sum] = "eb3d81e68eef223cfc31b53a0a542dec"
SRC_URI[sha256sum] = "19cdd35cade5a701f8f211373c74f5f5662e9d62752246cd781dc6018d4ac072"

do_install () {
    install -d ${D}${datadir}/applications
    install -m 0644 ${WORKDIR}/qt*.desktop ${D}${datadir}/applications
    install -d ${D}${datadir}/qt5
    cp -r ${S}/usr/share/qt5/examples ${D}${datadir}/qt5
    install -d ${D}${datadir}/pixmaps
    cp -r ${S}/usr/share/pixmaps/* ${D}${datadir}/pixmaps
}

FILES_${PN} = " \
    ${datadir}/qt5/examples/*/* \
    ${datadir}/applications/* \
    ${datadir}/pixmaps/* \
"

INSANE_SKIP_${PN} += "debug-files"



