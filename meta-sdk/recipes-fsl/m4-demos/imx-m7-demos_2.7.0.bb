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

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

SRC_URI[imx8mn.md5sum] = "4dd5b924a6486efba82474da9e0dbe1d"
SRC_URI[imx8mn.sha256sum] = "9785721f2863ad6fa14cfcb63a813789bbcd206ff2f38c27e35235c9ae154e9f"

SRC_URI[imx8mp.md5sum] = "106361256fa92a894147e8050054b2fc"
SRC_URI[imx8mp.sha256sum] = "789c5c402d6d564df4ff8f01e3d7ce1bc091c45567b3832ab91d14fae98b2a3e"

COMPATIBLE_MACHINE = "(mx8mn|mx8mp)"
