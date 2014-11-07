# Copyright (C) 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale QT Multimedia applications"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://EULA;md5=b063366b066c9f10037c59756a9ced54"

inherit fsl-eula-unpack autotools pkgconfig

# base on QtMultimedia v5.2.1
DEPENDS += "qtmultimedia gstreamer1.0"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true \
           file://qtimxplayer.desktop \
"
SRC_URI[md5sum] = "d61abdd5b32047bff822a76db980538c"
SRC_URI[sha256sum] = "70abb0926a8a23f55021ad95b37ea539a6d165b06933bb56e941d6eb8d47ee1e"

do_install () {
    install -d ${D}${datadir}/applications
    install -m 0644 ${WORKDIR}/qtimxplayer.desktop ${D}${datadir}/applications
    install -d ${D}${datadir}/qt5
    cp -r ${S}/examples ${D}${datadir}/qt5
    install -d ${D}${datadir}/pixmaps
    cp -r ${S}/pixmaps/* ${D}${datadir}/pixmaps
}

FILES_${PN} = " \
    ${datadir}/qt5/examples/*/* \
    ${datadir}/applications/* \
    ${datadir}/pixmaps/* \
"

INSANE_SKIP_${PN} += "debug-files"



