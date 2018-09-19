# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "i.MX M4 core Demo images"
SECTION = "app"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

inherit deploy fsl-eula-unpack2

SOC ?= "imx8qm"
SOC_mx7ulp= "imx7ulp"
SOC_mx8mm= "imx8mm"
SOC_mx8mq= "imx8mq"
SOC_mx8qm= "imx8qm"
SOC_mx8qxp= "imx8qx"

IMX_PACKAGE_NAME = "${SOC}-m4-demo-${PV}"
SRC_URI_NAME = "${SOC}"

SRC_URI[imx8mm.md5sum] = "576aace71cf194169d36ca658d63317e"
SRC_URI[imx8mm.sha256sum] = "29844ff7771c74ea36950f5a2d561336f0d7aad5178add1a76643806fd78c63e"

SCR = "SCR-${SOC}-m4-demo.txt"

do_deploy () {
   # Install the demo binaries
   cp ${D}/* ${DEPLOYDIR}/
}

addtask deploy before do_build after do_install

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx8mm)"
