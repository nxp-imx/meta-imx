# Copyright 2019 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "i.MX M7 core Demo images"
SECTION = "app"
LICENSE = "Proprietary"

inherit deploy fsl-eula2-unpack2

SOC        ?= "INVALID"
SOC_mx8mn   = "imx8mn"

IMX_PACKAGE_NAME = "${SOC}-m7-demo-${PV}"
SRC_URI_append = ";name=${SOC}"

SCR = "SCR-${SOC}-m7-demo.txt"

do_deploy () {
   # Install the demo binaries
   cp ${D}/* ${DEPLOYDIR}/
}
addtask deploy after do_install

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44" 

SRC_URI[imx8mn.md5sum] = "0b8f07d116a480a5b600f935a3519d9e"
SRC_URI[imx8mn.sha256sum] = "8217169ce0709f5037338e5178d5a8239ca4d154d2e73da2dbdac90643345067"

COMPATIBLE_MACHINE = "(mx8mn)"
