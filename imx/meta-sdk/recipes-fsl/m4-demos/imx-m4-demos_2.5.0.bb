# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "i.MX M4 core Demo images"
SECTION = "app"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6dfb32a488e5fd6bae52fbf6c7ebb086"

inherit deploy fsl-eula-unpack2

SOC ?= "imx8qm"
SOC_mx7ulp= "imx7ulp"
SOC_mx8mm= "imx8mm"
SOC_mx8mq= "imx8mq"
SOC_mx8qm= "imx8qm"
SOC_mx8qxp= "imx8qx"

IMX_PACKAGE_NAME = "${SOC}-m4-demo-${PV}"
SRC_URI_NAME = "${SOC}"

SRC_URI[imx7ulp.md5sum] = "5de78762343f897f911da8a949ee93ed"
SRC_URI[imx7ulp.sha256sum] = "1f6f11aea132487ef731ba188c917ec71e69d030bbd4e81b6c497912e974a033"

SRC_URI[imx8mm.md5sum] = "5d35b10e47ca0afc7545bf5fea3b9b50"
SRC_URI[imx8mm.sha256sum] = "f95ef0183c74c0d5a7ab98e193e2b15e4e27cc3dfc8b75ec5f598366e95e535d"

SCR = "SCR-${SOC}-m4-demo.txt"

do_deploy () {
   # Install the demo binaries
   cp ${D}/* ${DEPLOYDIR}/
}

addtask deploy before do_build after do_install

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx7ulp|mx8mm)"
