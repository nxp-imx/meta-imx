# Copyright 2018-2019 NXP

SUMMARY = "Qualcomm Wi-Fi and Bluetooth firmware"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

LIC_FILES_CHKSUM += "file://QUALCOMM_ATHEROS_LICENSE_AGREEMENT.pdf;md5=e629669cf17f6a2a6872e067582986e3 \
"

SRC_URI[md5sum] = "0b500febe6664972cf6ba8c744e98429"
SRC_URI[sha256sum] = "91b3d0bbba73955ae97efd83768009d65cba36dedb06169cea3dc06bfb071894"

inherit fsl-eula2-unpack2

IMX_PACKAGE_NAME = "firmware-qca-${IMX_PACKAGE_VERSION}"
