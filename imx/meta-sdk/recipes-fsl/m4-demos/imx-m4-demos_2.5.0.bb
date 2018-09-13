# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "i.MX M4 core Demo images"
SECTION = "app"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

inherit deploy fsl-eula-unpack2

SOC ?= "imx8qm"
SOC_mx7ulp= "imx7ulp"
SOC_mx8mq= "imx8mq"
SOC_mx8qm= "imx8qm"
SOC_mx8qxp= "imx8qx"

IMX_PACKAGE_NAME = "${SOC}-m4-demo-${PV}"
SRC_URI_NAME = "${SOC}"

SRC_URI[imx8qm.md5sum] = "a6ae73a2583ea651977c7158c6356a94"
SRC_URI[imx8qm.sha256sum] = "0cc2480a17a269dad22721533ae4076885c70b169f18f0064499cac8eac005a2"

SRC_URI[imx8qx.md5sum] = "074d9ca3b2cc7d39104e2c67fa0705ec"
SRC_URI[imx8qx.sha256sum] = "9b0d4ad9bffcd1552189056396af58f5752800fd39724a47b69fa5869f151a0e"

SCR = "SCR-${SOC}-m4-demo.txt"

do_deploy () {
   # Install the demo binaries
   cp ${D}/* ${DEPLOYDIR}/
}

addtask deploy before do_build after do_install

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx8qxp)"
