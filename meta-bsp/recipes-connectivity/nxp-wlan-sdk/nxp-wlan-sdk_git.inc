SUMMARY = "NXP Wi-Fi SDK for 88w8997 and 88w8987"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://mwifiex_8997/gpl-2.0.txt;md5=ab04ac0f249af12befccb94447c08b77;"

MRVL_SRC ?= "git://source.codeaurora.org/external/imx/mwifiex.git;protocol=https"

# Kernel 5.4
SRCBRANCH = "imx_5.4.70_2.3.0"
SRC_URI = "${MRVL_SRC};branch=${SRCBRANCH}"
SRCREV = "78b86e78be2f8c361adf8d09f4c1e58d4092b13b" 

S = "${WORKDIR}/git"

RRECOMMENDS_${PN} = "wireless-tools"
