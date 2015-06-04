# Copyright (C) 2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Package group used by freescale to provide set of packages for GStreamer1.x test applications"
SUMMARY = "Freescale Package group for multimedia Gstreamer1.x test applications"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

MACHINE_GSTREAMER_1_0_TESTAPPS ?= ""

RDEPENDS_${PN} += " \
    ${MACHINE_GSTREAMER_1_0_TESTAPPS} \
"

ALLOW_EMPTY_${PN} = "1"

IMX_GSTREAMER_1_0_TESTAPPS = " ${@base_contains("MACHINE_GSTREAMER_1_0_PLUGIN", "gst1.0-fsl-plugin", "gst1.0-fsl-plugin-gplay", "", d)} \
                               ${@base_contains("MACHINE_GSTREAMER_1_0_PLUGIN", "gst1.0-fsl-plugin", "gst1.0-fsl-plugin-grecorder", "", d)} \
"

MACHINE_GSTREAMER_1_0_TESTAPPS_mx6 = "${IMX_GSTREAMER_1_0_TESTAPPS}"
MACHINE_GSTREAMER_1_0_TESTAPPS_mx7 = "${IMX_GSTREAMER_1_0_TESTAPPS}"
