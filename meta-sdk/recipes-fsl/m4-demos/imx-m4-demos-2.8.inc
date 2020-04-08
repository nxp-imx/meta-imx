# Copyright 2017-2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "i.MX M4 core Demo images"
SECTION = "app"
LICENSE = "Proprietary"

inherit deploy fsl-eula2-unpack2

SOC        ?= "INVALID"
SOC_mx7ulp  = "imx7ulp"
SOC_mx8mm   = "imx8mm"
SOC_mx8mq   = "imx8mq"
SOC_mx8qm   = "imx8qm"
SOC_mx8qxp  = "imx8qx"
SOC_mx8dxl  = "imx8dxl-phantom"
SOC_mx8phantomdxl = "imx8dxl-phantom"

IMX_PACKAGE_NAME = "${SOC}-m4-demo-${PV}"
SRC_URI_append = ";name=${SOC}"

SCR = "SCR-${SOC}-m4-demo.txt"

do_install () {
    # install elf format binary to /lib/firmware
    install -d ${D}${base_libdir}/firmware
    install -m 0644 ${S}/*.elf ${D}${base_libdir}/firmware
}

do_deploy () {
   # Install the demo binaries
   install -m 0644 ${S}/*.bin ${DEPLOYDIR}/
}

addtask deploy after do_install

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
