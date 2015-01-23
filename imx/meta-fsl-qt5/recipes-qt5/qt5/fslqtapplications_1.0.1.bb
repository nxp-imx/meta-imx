# Copyright (C) 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale QT Multimedia applications"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://EULA;md5=b063366b066c9f10037c59756a9ced54"

inherit fsl-eula-unpack autotools pkgconfig

# base on QtMultimedia v5.2.1
DEPENDS += "qtmultimedia gstreamer1.0 gstreamer1.0-plugins-base"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true \
           file://qtimxplayer.desktop \
"
SRC_URI[md5sum] = "6711ecc2493960171750b0ea9fce3567"
SRC_URI[sha256sum] = "c21cc446149655c4c748743b4b85d15e468e3d31f957fbf8fdc974d56b49508d"

do_install () {
    install -d ${D}${datadir}/applications
    install -m 0644 ${WORKDIR}/qtimxplayer.desktop ${D}${datadir}/applications
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



