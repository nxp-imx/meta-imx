# Copyright 2018 NXP

SUMMARY = "Qualcomm Wi-Fi and Bluetooth firmware"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d \
                    file://QUALCOMM_ATHEROS_LICENSE_AGREEMENT.pdf;md5=e629669cf17f6a2a6872e067582986e3 \
"

inherit fsl-eula-unpack allarch

SRC_URI = " ${FSL_MIRROR}/firmware-qca-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "f3fbfc63a954ddad778c84ca6960574c"
SRC_URI[sha256sum] = "a8a40d30bda62d68057281790b3b67cc40adb37ca343b37bdd871cd18c367763"

S = "${WORKDIR}/firmware-qca-${PV}"
