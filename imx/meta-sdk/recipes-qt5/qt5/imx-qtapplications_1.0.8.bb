# Copyright (C) 2014-2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale QT Multimedia applications"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=102094e9e695888c6a9f9fda9004165d"

inherit fsl-eula-unpack autotools pkgconfig

# base on QtMultimedia v5.2.1
DEPENDS += "qtmultimedia gstreamer1.0 gstreamer1.0-plugins-base imx-gst1.0-plugin"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true \
           file://qtimxplayer.desktop \
           file://qtimxcamera.desktop \
"
SRC_URI[md5sum] = "dbf8daef36df82dcb9e6b074f8af8864"
SRC_URI[sha256sum] = "982b249cdbdfcf02373a977474f50877ffa2b7bb417000118bd92c29fc1de3b7"

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



