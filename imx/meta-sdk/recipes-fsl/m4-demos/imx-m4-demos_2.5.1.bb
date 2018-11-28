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

SRC_URI[imx8qm.md5sum] = "7601fa410671682afe3d520301618724"
SRC_URI[imx8qm.sha256sum] = "f43a69395d87d1bb1d314f03885e0cf506902d7cac76639fb774a32c306744c1"

SRC_URI[imx8qx.md5sum] = "342879f8f1bd20a254fd79f9a80f8b8f"
SRC_URI[imx8qx.sha256sum] = "36ee583e25afeaed209adb497416c577fe84c02369031f0a0b10aa31b7a74978"

SCR = "SCR-${SOC}-m4-demo.txt"

do_deploy () {
   # Install the demo binaries
   cp ${D}/* ${DEPLOYDIR}/
}

addtask deploy before do_build after do_install

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx8qm|mx8qxp)"
