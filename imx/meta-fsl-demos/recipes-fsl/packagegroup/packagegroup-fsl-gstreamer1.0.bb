# Copyright (C) 2012-2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale package group - gstreamer"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} += " \
    gstreamer1.0-plugins-good-meta \
    gstreamer1.0-plugins-base-meta \
    gst1.0-fsl-plugin \
    gst1.0-fsl-plugin-gplay \
    gstreamer1.0-plugins-bad-rawparse \
"

PACKAGE_ARCH = "${MACHINE_ARCH}"
