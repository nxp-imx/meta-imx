# Copyright 2018 NXP

SUMMARY = "Qualcomm Wi-Fi and Bluetooth firmware"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ab61cab9599935bfe9f700405ef00f28 \
                    file://QUALCOMM_ATHEROS_LICENSE_AGREEMENT.pdf;md5=e629669cf17f6a2a6872e067582986e3 \
"

inherit fsl-eula-unpack

SRC_URI = " ${FSL_MIRROR}/firmware-qca-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "561d886213b9936cb6023842daf4d24a"
SRC_URI[sha256sum] = "1712984d2e9b579caf54de41100cc6afd7280ec8ba01ce92b7bd6c8d89bf0f06"

S = "${WORKDIR}/firmware-qca-${PV}"
