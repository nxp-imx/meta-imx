# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "i.MX M4/M7/M33 core Demo images"
SECTION = "app"
LICENSE = "Proprietary"

inherit deploy fsl-eula2-unpack2

SOC        ?= "INVALID"
SOC_mx7ulp  = "imx7ulp"
SOC_mx8dxl  = "imx8dxl"
SOC_mx8mm   = "imx8mm"
SOC_mx8mn   = "imx8mn"
SOC_mx8mnul = "imx8mnddr3l"
SOC_mx8mp   = "imx8mp"
SOC_mx8mpul = "imx8mp"
SOC_mx8mq   = "imx8mq"
SOC_mx8qm   = "imx8qm"
SOC_mx8qxp  = "imx8qx"
SOC_mx8ulp  = "imx8ulp"

MCORE_TYPE  ?= "m4"
MCORE_TYPE_mx8mn  = "m7"
MCORE_TYPE_mx8mnul = "m7"
MCORE_TYPE_mx8mp  = "m7"
MCORE_TYPE_mx8mpul  = "m7"
MCORE_TYPE_mx8ulp  = "m33"

IMX_PACKAGE_NAME = "${SOC}-${MCORE_TYPE}-demo-${PV}"
SRC_URI_append = ";name=${SOC}"

SCR = "SCR-${SOC}-${MCORE_TYPE}-demo.txt"

do_install () {
    # install elf format binary to /lib/firmware
    install -d ${D}${base_libdir}/firmware
    install -m 0644 ${S}/*.elf ${D}${base_libdir}/firmware
}

DEPLOY_FILE_EXT       ?= "bin"
DEPLOY_FILE_EXT_mx7ulp = "img"

do_deploy () {
   # Install the demo binaries
   install -m 0644 ${S}/*.${DEPLOY_FILE_EXT} ${DEPLOYDIR}/
}

addtask deploy after do_install

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
