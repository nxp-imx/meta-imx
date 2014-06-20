# Copyright (C) 2012-2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale package group - gstreamer"
LICENSE = "MIT"

inherit packagegroup

GST_EXTRA = ""
GST_EXTRA = "${@base_contains('DISTRO_FEATURES', 'x11', \
   'gstreamer1.0-plugins-bad-rawparse', '', d)}"

GST_INSTALL = ""
GST_INSTALL_append_mx6q = " ${GST_INSTALL_EXTRA}"
GST_INSTALL_append_mx6dl = " ${GST_INSTALL_EXTRA}"
GST_INSTALL_append_mx6sx = " ${GST_INSTALL_EXTRA}"

RDEPENDS_${PN} += " \
    gstreamer1.0-plugins-good-meta \
    gstreamer1.0-plugins-base-meta \
    gst1.0-fsl-plugin \
    gst1.0-fsl-plugin-gplay \
    ${GST_INSTALL} \
"

PACKAGE_ARCH = "${MACHINE_ARCH}"
