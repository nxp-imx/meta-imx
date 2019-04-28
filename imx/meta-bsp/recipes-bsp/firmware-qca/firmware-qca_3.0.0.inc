# Copyright 2018-2019 NXP

SUMMARY = "Qualcomm Wi-Fi and Bluetooth firmware"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6dfb32a488e5fd6bae52fbf6c7ebb086 \
                    file://QUALCOMM_ATHEROS_LICENSE_AGREEMENT.pdf;md5=e629669cf17f6a2a6872e067582986e3 \
"

SRC_URI[md5sum] = "02f7ef1037ac7c4459a4f3efc4a80cc5"
SRC_URI[sha256sum] = "cbf8271c588b359d72f785b60bd9e3412989bb125b6e3c4eaf46967ef934a26d"

inherit fsl-eula2-unpack2

IMX_PACKAGE_NAME = "firmware-qca-${IMX_PACKAGE_VERSION}"
