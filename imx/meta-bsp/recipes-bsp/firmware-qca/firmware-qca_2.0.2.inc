# Copyright 2018 NXP

SUMMARY = "Qualcomm Wi-Fi and Bluetooth firmware"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db \
                    file://QUALCOMM_ATHEROS_LICENSE_AGREEMENT.pdf;md5=e629669cf17f6a2a6872e067582986e3 \
"

inherit fsl-eula-unpack

SRC_URI = " ${FSL_MIRROR}/firmware-qca-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "f35fe7b4818eb4df0ff4acc53cdd1b8c"
SRC_URI[sha256sum] = "2ad400cf74cbfabd84a873edab9ab21b8ddbc21038daa67afcb8f39fcf612c4a"

S = "${WORKDIR}/firmware-qca-${PV}"
