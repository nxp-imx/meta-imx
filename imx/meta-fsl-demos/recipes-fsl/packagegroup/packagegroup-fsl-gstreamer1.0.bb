# Copyright (C) 2012-2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale package group - gstreamer"
LICENSE = "MIT"

inherit packagegroup

GST_INSTALL_mx6 = "${@base_contains('DISTRO_FEATURES', 'x11', \
   'gstreamer1.0-plugins-bad-rawparse', '', d)}"

RDEPENDS_${PN} += " \
    gstreamer1.0-plugins-good-meta \
    gstreamer1.0-plugins-base-meta \
    gst1.0-fsl-plugin \
    gst1.0-fsl-plugin-gplay \
    ${GST_INSTALL} \
"

PACKAGE_ARCH = "${MACHINE_ARCH}"
