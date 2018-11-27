# Copyright 2018 NXP

SUMMARY = "Qualcomm Wi-Fi and Bluetooth firmware"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6dfb32a488e5fd6bae52fbf6c7ebb086 \
                    file://QUALCOMM_ATHEROS_LICENSE_AGREEMENT.pdf;md5=e629669cf17f6a2a6872e067582986e3 \
"

inherit fsl-eula-unpack

SRC_URI = " ${FSL_MIRROR}/firmware-qca-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "c42561b8eb83d0b9e974bcb92173fd51"
SRC_URI[sha256sum] = "1d84beb3441d511ba03ca31e041dc8fd14bd4d09866bf588b30170187a3f2cfc"

S = "${WORKDIR}/firmware-qca-${PV}"
