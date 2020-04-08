# Copyright 2019-2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "i.MX M7 core Demo images"
SECTION = "app"
LICENSE = "Proprietary"

inherit deploy fsl-eula2-unpack2

SOC        ?= "INVALID"
SOC_mx8mn   = "imx8mn"
SOC_mx8mp   = "imx8mp"

IMX_PACKAGE_NAME = "${SOC}-m7-demo-${PV}"
SRC_URI_append = ";name=${SOC}"

SCR = "SCR-${SOC}-m7-demo.txt"

do_deploy () {
   # Install the demo binaries
   cp ${D}/* ${DEPLOYDIR}/
   #Set 0644 permission for Demo binaries
   chmod 0644 ${DEPLOYDIR}/*
}
addtask deploy after do_install

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

SRC_URI[imx8mn.md5sum] = "bfed8dd48c3e116c144508d92bfed7e8"
SRC_URI[imx8mn.sha256sum] = "e8cff203d501fb1ad2fb992d5303328711cc5863fc8076b4f0d6b48f675b4009"

SRC_URI[imx8mp.md5sum] = "a5625c2d6516d3e48e8fcbe353c957e2"
SRC_URI[imx8mp.sha256sum] = "bdeed8335945c916e07a3ee314ad4fe3fcd3a973cee84f6f19fb3d73d4c35b92"

COMPATIBLE_MACHINE = "(mx8mn|mx8mp)"
