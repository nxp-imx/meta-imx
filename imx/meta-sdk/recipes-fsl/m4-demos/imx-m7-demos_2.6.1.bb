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

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3"

SRC_URI[imx8mn.md5sum] = "8d3770d380e40bcfe9aeda9fe2f81c4c"
SRC_URI[imx8mn.sha256sum] = "44982946cea36edb167677230b5e887d95c6b97ea623271ac0f7fbcc6b5e1c5c"

COMPATIBLE_MACHINE = "(mx8mn)"
