# Copyright 2018 NXP

SUMMARY = "Qualcomm Wi-Fi and Bluetooth firmware"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d \
                    file://QUALCOMM_ATHEROS_LICENSE_AGREEMENT.pdf;md5=e629669cf17f6a2a6872e067582986e3 \
"

inherit fsl-eula-unpack allarch

SRC_URI = " ${FSL_MIRROR}/firmware-qca-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "8abcef21c4e4b96380465f4c305765e7"
SRC_URI[sha256sum] = "6ea14bd9e7665c9030c1c8a25dafb2290ab0f1372a5ead4fd74f268d6f8f9f69"

S = "${WORKDIR}/firmware-qca-${PV}"
