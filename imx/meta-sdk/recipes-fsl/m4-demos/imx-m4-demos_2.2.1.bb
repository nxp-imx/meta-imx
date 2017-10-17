# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "i.MX M4 core Demo images"
SECTION = "app"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

inherit deploy fsl-eula-unpack2

SOC ?= "imx8qm"
SOC_mx8mq= "imx8mq"
SOC_mx8qm= "imx8qm"
SOC_mx8qxp= "imx8qx"

IMX_PACKAGE_NAME = "${SOC}-m4-demo-${PV}"
SRC_URI_NAME = "${SOC}"

SRC_URI[imx8qm.md5sum] = "7580970903ffc10d9c4c963e36905529"
SRC_URI[imx8qm.sha256sum] = "5d127b64d5b75eca623cc47cd3408e2b729359ac093ca7819df9af3759a61516"

SCR = "SCR-${SOC}-m4-demo.txt"

do_deploy () {
   # Install the demo binaries
   install -d ${DEPLOYDIR}
   cp ${S}/*.bin ${DEPLOYDIR}/
   ls ${DEPLOYDIR}/
}

addtask deploy before do_build after do_compile

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx8qm)"
