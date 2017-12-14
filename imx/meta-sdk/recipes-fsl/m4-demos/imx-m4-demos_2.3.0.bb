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

SRC_URI[imx8mq.md5sum] = "c2aeda4ca7cc7d1c2916be7dd42b946f"
SRC_URI[imx8mq.sha256sum] = "fd441e75395b0c6f90626c883ee8a93406b14e7d55adc7925116254394bb7ad8"

SRC_URI[imx8qm.md5sum] = "694f9590283a57b6e50016db068d0315"
SRC_URI[imx8qm.sha256sum] = "00e853af98184948af75061079a22144264b971045a72195ca2631957f0b4a33"

SRC_URI[imx8qx.md5sum] = "b18198150c3aa5b1e01aba2047166728"
SRC_URI[imx8qx.sha256sum] = "3b3887694b7cfe02d2918b0780f941da3d5c0e867725927b8c8f19fbff106bc9"

SCR = "SCR-${SOC}-m4-demo.txt"

do_deploy () {
   # Install the demo binaries
   install -d ${DEPLOYDIR}
   cp ${S}/*.bin ${DEPLOYDIR}/
   ls ${DEPLOYDIR}/
}

addtask deploy before do_build after do_compile

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx8mq|mx8qm|mx8qxp)"
