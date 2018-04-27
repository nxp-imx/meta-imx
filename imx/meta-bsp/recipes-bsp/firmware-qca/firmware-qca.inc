# Copyright 2018 NXP

SUMMARY = "Qualcomm Wi-Fi and Bluetooth firmware"
DESCRIPTION = "Qualcomm Wi-Fi and Bluetooth firmware for modules QCA9377-3, QCA6174A"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"

inherit fsl-eula-unpack allarch

SRC_URI = " ${FSL_MIRROR}/firmware-qca-${PV}.bin;fsl-eula=true; \
"
SRC_URI[md5sum] = "f79734ff3831328e1e6f7bfb61188cbf"
SRC_URI[sha256sum] = "8e9440f9ceca7226c2736aafd4646ea11dbdef85dcd79947cf0635f4adc363c1"

S = "${WORKDIR}/firmware-qca-${PV}"
