# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "i.MX M4/M7/M33 core Demo images"
SECTION = "app"
LICENSE = "Proprietary"

inherit deploy fsl-eula2-unpack2

SOC        ?= "INVALID"
SOC:mx7ulp  = "imx7ulp"
SOC:mx8dxl  = "imx8dxl"
SOC:mx8mm   = "imx8mm"
SOC:mx8mn   = "imx8mn"
SOC:mx8mnul = "imx8mnddr3l"
SOC:mx8mp   = "imx8mp"
SOC:mx8mpul = "imx8mp"
SOC:mx8mq   = "imx8mq"
SOC:mx8qm   = "imx8qm"
SOC:mx8qxp  = "imx8qx"
SOC:mx8ulp  = "imx8ulp"

MCORE_TYPE  ?= "m4"
MCORE_TYPE:mx8mn  = "m7"
MCORE_TYPE:mx8mnul = "m7"
MCORE_TYPE:mx8mp  = "m7"
MCORE_TYPE:mx8mpul  = "m7"
MCORE_TYPE:mx8ulp  = "m33"

IMX_PACKAGE_NAME = "${SOC}-${MCORE_TYPE}-demo-${PV}"
SRC_URI:append = ";name=${SOC}"

SCR = "SCR-${SOC}-${MCORE_TYPE}-demo.txt"

do_install () {
    # install elf format binary to /lib/firmware
    install -d ${D}${base_libdir}/firmware
    install -m 0644 ${S}/*.elf ${D}${base_libdir}/firmware
}

DEPLOY_FILE_EXT       ?= "bin"
DEPLOY_FILE_EXT:mx7ulp = "img"

do_deploy () {
   # Install the demo binaries
   install -m 0644 ${S}/*.${DEPLOY_FILE_EXT} ${DEPLOYDIR}/
}

addtask deploy after do_install

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
