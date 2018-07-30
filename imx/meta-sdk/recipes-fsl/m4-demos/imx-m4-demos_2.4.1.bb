# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "i.MX M4 core Demo images"
SECTION = "app"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"
LIC_FILES_CHKSUM_mx8mm = "file://COPYING;md5=ab61cab9599935bfe9f700405ef00f28"
LIC_FILES_CHKSUM_mx8qm = "file://COPYING;md5=ab61cab9599935bfe9f700405ef00f28"

inherit deploy fsl-eula-unpack2

SOC ?= "imx8qm"
SOC_mx7ulp= "imx7ulp"
SOC_mx8mm= "imx8mm"
SOC_mx8mq= "imx8mq"
SOC_mx8qm= "imx8qm"
SOC_mx8qxp= "imx8qx"

IMX_PACKAGE_NAME = "${SOC}-m4-demo-${PV}"
SRC_URI_NAME = "${SOC}"

SRC_URI[imx8mm.md5sum] = "3e369b9caa7ce6ac214915eae6badca1"
SRC_URI[imx8mm.sha256sum] = "e2bf99fe235765dabf969a3c39cf36c5914f5ff51a5b09bd2bc325d265c8e515"

SCR = "SCR-${SOC}-m4-demo.txt"

do_deploy () {
   # Install the demo binaries
   cp ${D}/* ${DEPLOYDIR}/
}

addtask deploy before do_build after do_install

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx8mm)"
