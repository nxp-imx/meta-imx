# Copyright 2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "i.MX M33 core Demo images"
SECTION = "app"
LICENSE = "Proprietary"

inherit deploy fsl-eula2-unpack2

SOC        ?= "INVALID"
SOC:mx8ulp  = "imx8ulp"

MCORE_TYPE  ?= "m33"
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

do_deploy () {
   # Install the demo binaries
   install -m 0644 ${S}/*.${DEPLOY_FILE_EXT} ${DEPLOYDIR}/
}

addtask deploy after do_install

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
