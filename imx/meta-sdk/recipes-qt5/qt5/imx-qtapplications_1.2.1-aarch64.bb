# Copyright (C) 2014-2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale QT Multimedia applications"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

inherit fsl-eula-unpack pkgconfig

# base on QtMultimedia v5.2.1
DEPENDS += "qtmultimedia gstreamer1.0 gstreamer1.0-plugins-base imx-gst1.0-plugin qtquickcontrols"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true \
"
SRC_URI[md5sum] = "a4df8c4b998d9de7fde469d20d3cd8b1"
SRC_URI[sha256sum] = "8f64a8d232dc1e3f03873b6702c281750bae9d720e89e414c0104f0ded3d2f84"

do_install () {
    install -d ${D}${datadir}/qt5/examples/multimedia/
    cp -r ${S}/usr/share/qt5/examples/multimedia/qmlgltest/ ${D}${datadir}/qt5/examples/multimedia/
}

FILES_${PN} = " \
    ${datadir}/qt5/examples/*/* \
"

INSANE_SKIP_${PN} += "debug-files"

COMPATIBLE_MACHINE = "(mx8)"

