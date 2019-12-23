# Copyright 2018-2019 NXP

SUMMARY = "Qualcomm Wi-Fi and Bluetooth firmware"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

LIC_FILES_CHKSUM += "file://QUALCOMM_ATHEROS_LICENSE_AGREEMENT.pdf;md5=e629669cf17f6a2a6872e067582986e3 \
"

SRC_URI[md5sum] = "75b1b2a8dea8f81609ccfc072d42fa86"
SRC_URI[sha256sum] = "6ad56ac1df841e252ac6db0a8966082715a3cb6dc7189426bade13333a16fd9d"

inherit fsl-eula2-unpack2

IMX_PACKAGE_NAME = "firmware-qca-${IMX_PACKAGE_VERSION}"
