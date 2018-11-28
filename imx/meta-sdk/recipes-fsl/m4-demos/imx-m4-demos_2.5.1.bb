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

SRC_URI[imx8qm.md5sum] = "e3d6f4695955897075c566a716dfafe1"
SRC_URI[imx8qm.sha256sum] = "c91a935d413ce32a2abe67a3fa7b2a1cb3d01ae3e8b34f0c044538155ec23b68"

SRC_URI[imx8qx.md5sum] = "e82fcba057c87937bcd0362780bf7668"
SRC_URI[imx8qx.sha256sum] = "527b7e6770c98e785595b3f7ec509202b806dfb7041b0cfba134f779ed6d327b"

SCR = "SCR-${SOC}-m4-demo.txt"

do_deploy () {
   # Install the demo binaries
   cp ${D}/* ${DEPLOYDIR}/
}

addtask deploy before do_build after do_install

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx8qm|mx8qxp)"
