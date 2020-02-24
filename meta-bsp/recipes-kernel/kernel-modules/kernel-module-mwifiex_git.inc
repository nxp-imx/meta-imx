SUMMARY = "Marvell WiFi driver for PCIE8997"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://mwifiex_8997/gpl-2.0.txt;md5=ab04ac0f249af12befccb94447c08b77;"

MRVL_SRC ?= "git://source.codeaurora.org/external/imx/mwifiex.git;protocol=https"
#MRVL_SRC = "git://bitbucket.sw.nxp.com/imx/mwifiex.git;protocol=ssh"

#Kernel 5.4
SRC_URI = "${MRVL_SRC};branch=master"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

DEPENDS = "virtual/kernel"
do_configure[depends] += "make-mod-scripts:do_compile"

RRECOMMENDS_${PN} = "wireless-tools"
