# Copyright 2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Add packages for ISP build"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

ISP_PKGS      ?= ""
ISP_PKGS_mx8mp = " \
    isp-imx \
    basler-camera \
    basler-camera-dev \
    kernel-module-isp-vvcam \
"
RDEPENDS_${PN} = " \
    ${ISP_PKGS} \
"
