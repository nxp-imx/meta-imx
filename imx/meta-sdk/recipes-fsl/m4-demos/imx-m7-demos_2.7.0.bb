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
   #Set 0644 permission for Demo binaries
   chmod 0644 ${DEPLOYDIR}/*
}
addtask deploy after do_install

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

SRC_URI[imx8mn.md5sum] = "21d749b82a57852ec3fdf51399661338"
SRC_URI[imx8mn.sha256sum] = "d825a9dd0dc28154e2ade11133315290102201a4a75118224436ee1e940dd03b"

COMPATIBLE_MACHINE = "(mx8mn)"
