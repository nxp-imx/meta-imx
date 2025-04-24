# Copyright 2020,2024,2025 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Add packages for Image Signal Processing"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

inherit packagegroup

LIBCAMERA_PKGS = " \
    libcamera \
    libcamera-gst \
    libcamera-pycamera \
"
ISP_PKGS      ?= ""
ISP_PKGS:mx8mp-nxp-bsp = " \
    isp-imx \
    basler-camera \
    basler-camera-dev \
    kernel-module-isp-vvcam \
"
ISP_PKGS:mx8mm-nxp-bsp  = "${LIBCAMERA_PKGS}"
ISP_PKGS:mx8mq-nxp-bsp  = "${LIBCAMERA_PKGS}"
ISP_PKGS:mx8ulp-nxp-bsp = "${LIBCAMERA_PKGS}"
ISP_PKGS:mx95-nxp-bsp = " \
    ${LIBCAMERA_PKGS} \
    neo-ipa-uguzzi \
"
RDEPENDS:${PN} = " \
    ${ISP_PKGS} \
"
