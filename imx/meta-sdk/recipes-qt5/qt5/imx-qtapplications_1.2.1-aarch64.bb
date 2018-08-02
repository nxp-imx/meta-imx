# Copyright (C) 2014-2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale QT Multimedia applications"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

inherit fsl-eula-unpack pkgconfig

# base on QtMultimedia v5.2.1
DEPENDS += "qtmultimedia gstreamer1.0 gstreamer1.0-plugins-base imx-gst1.0-plugin qtquickcontrols"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true \
"
SRC_URI[md5sum] = "017b9495681c2ade9aed2cd5b193e76d"
SRC_URI[sha256sum] = "c197f134db3f8f3e5ef7a0153a15a8baba998eb7d03ba13beef7a4189eb46070"

do_install () {
    install -d ${D}${datadir}/qt5/examples/multimedia/
    cp -r ${S}/usr/share/qt5/examples/multimedia/qmlgltest/ ${D}${datadir}/qt5/examples/multimedia/
}

FILES_${PN} = " \
    ${datadir}/qt5/examples/*/* \
"

INSANE_SKIP_${PN} += "debug-files"

COMPATIBLE_MACHINE = "(mx8)"

