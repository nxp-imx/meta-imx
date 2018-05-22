# Copyright 2018 NXP

SUMMARY = "Qualcomm Wi-Fi and Bluetooth firmware"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d \
                    file://QUALCOMM_ATHEROS_LICENSE_AGREEMENT.pdf;md5=e629669cf17f6a2a6872e067582986e3 \
"

inherit fsl-eula-unpack allarch

SRC_URI = " ${FSL_MIRROR}/firmware-qca-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "2a44938a46b8e4acd66a299a946c3930"
SRC_URI[sha256sum] = "4758ff561d25cb3bd489fd7ae3a701290ce8bfc46c651d732f3339683d4c15c6"

S = "${WORKDIR}/firmware-qca-${PV}"
