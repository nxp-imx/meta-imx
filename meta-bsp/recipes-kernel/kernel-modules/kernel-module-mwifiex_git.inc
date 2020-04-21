SUMMARY = "NXP Wi-Fi SDK for 88w8997 and 88w8987"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://mwifiex_8997/gpl-2.0.txt;md5=ab04ac0f249af12befccb94447c08b77;"

MRVL_SRC ?= "git://source.codeaurora.org/external/imx/mwifiex.git;protocol=https"

# Kernel 5.4
SRC_URI = "${MRVL_SRC};branch=master"
SRCREV = "33d9f8e4f3805144e74af0ec4e680d1a4b61b0bb"

S = "${WORKDIR}/git"

RRECOMMENDS_${PN} = "wireless-tools"
