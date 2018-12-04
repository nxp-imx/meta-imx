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

SRC_URI[imx8qm.md5sum] = "75e63a312d1c1b165144ece745adfb9f"
SRC_URI[imx8qm.sha256sum] = "191ec055237de2e9452ba4e68be85be1957d31bee5c7ffe153aa6f7a23d3d40d"

SRC_URI[imx8qx.md5sum] = "3b9a5a4eb29bc6201f33832dbac17eb2"
SRC_URI[imx8qx.sha256sum] = "62b034cd9b8f524283991c7a3f03d2a87726b1705864a7a145c6a8690605ba68"

SCR = "SCR-${SOC}-m4-demo.txt"

do_deploy () {
   # Install the demo binaries
   cp ${D}/* ${DEPLOYDIR}/
}

addtask deploy before do_build after do_install

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx8qm|mx8qxp)"
