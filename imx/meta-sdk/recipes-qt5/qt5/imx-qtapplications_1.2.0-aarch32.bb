# Copyright (C) 2014-2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale QT Multimedia applications"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6b552f505eedab4a11ab538cf3db743a"

inherit fsl-eula-unpack pkgconfig

# base on QtMultimedia v5.2.1
DEPENDS += "qtmultimedia gstreamer1.0 gstreamer1.0-plugins-base imx-gst1.0-plugin qtquickcontrols"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true \
           file://qtimxplayer.desktop \
           file://qtimxcamera.desktop \
"
SRC_URI[md5sum] = "e65c9a365a4ed76efd4e5de8c3b35293"
SRC_URI[sha256sum] = "4a43cc4ec58827dda287e2f3c4700bfa821c5075ffefa06056a33290ccaede9a"

USE_X11 = "${@bb.utils.contains("DISTRO_FEATURES", "x11", "yes", "no", d)}"
PLATFORM_HAS_VPU = " "
PLATFORM_HAS_VPU_imxvpu = "yes"

# imx-qtapplications will be enabled on board with GPU 3D
# For now, imxcamera & imxplayer can only be supported on x11 backend for SoC with VPU only (including i.MX6Q & i.MX6DL)
# And test_qmlglsrc & test_qmlglsink can be supported on all backends
do_install () {
    if [ "${USE_X11}" = "yes" ]; then
        if [ "${PLATFORM_HAS_VPU}" = "yes" ]; then
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


