# Copyright (C) 2014-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale QT Multimedia applications"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

inherit fsl-eula-unpack pkgconfig

# base on QtMultimedia v5.2.1
DEPENDS += "qtmultimedia gstreamer1.0 gstreamer1.0-plugins-base imx-gst1.0-plugin qtquickcontrols"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "3f17dca2b5668b97dda46eff8719e53f"
SRC_URI[sha256sum] = "a9c5511668b7f37d3d8a610da99952d78e044147fad9fc1b4e88aaa80ebc01b9"

do_install () {
    install -d ${D}${datadir}/qt5/examples/multimedia/
    cp -r ${S}/usr/share/qt5/examples/multimedia/qmlgltest/ ${D}${datadir}/qt5/examples/multimedia/
}

FILES:${PN} = " \
    ${datadir}/qt5/examples/*/* \
"

INSANE_SKIP:${PN} += "debug-files"

COMPATIBLE_MACHINE = "(mx8)"

