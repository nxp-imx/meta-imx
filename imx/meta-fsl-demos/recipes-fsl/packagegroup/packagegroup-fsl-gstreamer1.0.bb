# Copyright (C) 2012-2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale package group - gstreamer"
LICENSE = "MIT"

inherit packagegroup

GST_EXTRA = "gstreamer1.0-plugins-bad-rawparse"

GST_INSTALL = ""
GST_INSTALL_append_mx6q = " ${GST_EXTRA}"
GST_INSTALL_append_mx6dl = " ${GST_EXTRA}"
GST_INSTALL_append_mx6sx = " ${GST_EXTRA}"

RDEPENDS_${PN} += " \
    gstreamer1.0-plugins-good-meta \
    gstreamer1.0-plugins-base-meta \
    ${MACHINE_GSTREAMER_1_0_PLUGIN} \
    ${@base_contains("MACHINE_GSTREAMER_1_0_PLUGIN", "gst1.0-fsl-plugin", "gst1.0-fsl-plugin-gplay", "", d)} \
    ${GST_INSTALL} \
"

PACKAGE_ARCH = "${MACHINE_ARCH}"
