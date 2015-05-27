# Copyright (C) 2012-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale package group - gstreamer"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

GST_1_X_EXTRA_INSTALL = "gstreamer1.0-plugins-bad-meta"

RDEPENDS_${PN} += " \
    gstreamer1.0-plugins-good-meta \
    gstreamer1.0-plugins-base-meta \
    gstreamer1.0-rtsp-server \
    ${GST_1_X_EXTRA_INSTALL} \
    ${MACHINE_GSTREAMER_1_0_PLUGIN} \
    ${@base_contains("MACHINE_GSTREAMER_1_0_PLUGIN", "gst1.0-fsl-plugin", "gst1.0-fsl-plugin-gplay", "", d)} \
    ${@base_contains("MACHINE_GSTREAMER_1_0_PLUGIN", "gst1.0-fsl-plugin", "gst1.0-fsl-plugin-grecorder", "", d)} \
"
