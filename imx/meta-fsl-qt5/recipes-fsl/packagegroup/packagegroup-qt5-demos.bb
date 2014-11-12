# Copyright (C) 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Package group for Qt5 demos"
LICENSE = "MIT"

inherit packagegroup

# Install Freescale QT demo applications
MACHINE_QT5_MULTIMEDIA_PLAYER = ""
MACHINE_QT5_MULTIMEDIA_PLAYER_mx6q = "${@base_contains("MACHINE_GSTREAMER_1_0_PLUGIN", "gst1.0-fsl-plugin", "fslqtapplications", "", d)}"
MACHINE_QT5_MULTIMEDIA_PLAYER_mx6dl = "${@base_contains("MACHINE_GSTREAMER_1_0_PLUGIN", "gst1.0-fsl-plugin", "fslqtapplications", "", d)}"
MACHINE_QT5_MULTIMEDIA_PLAYER_mx6sx = "${@base_contains("MACHINE_GSTREAMER_1_0_PLUGIN", "gst1.0-fsl-plugin", "fslqtapplications", "", d)}"

RDEPENDS_${PN} += " \
    qtbase-examples \
    qtdeclarative-examples \
    qt3d \
    qt3d-examples \
    qt3d-tools \
    qt3d-qmlplugins \
    qtsmarthome \
    qt5ledscreen \
    quitbattery \
    qt5everywheredemo \ 
    qt5nmapcarousedemo \
    qt5nmapper \
    cinematicexperience \
    quitindicators \
    qt5-demo-extrafiles \
    ${@base_contains('DISTRO_FEATURES', 'x11','${MACHINE_QT5_MULTIMEDIA_PLAYER}', '', d)} \
"
