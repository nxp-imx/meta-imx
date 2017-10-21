# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017 NXP

DESCRIPTION = "i.MX System Controller Firmware"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SECTION = "BSP"

inherit fsl-eula-unpack pkgconfig deploy

SRC_URI = "${MX8_DOWNLOADS}/${PN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "88f5218653a8c706458b4b429802950e"
SRC_URI[sha256sum] = "847328549bebfd87546ce242e8b3c5ca33732fdd08849f84397dc4e4a881aae7"

S = "${WORKDIR}/${PN}-${PV}"

SC_MACHINE_NAME ?= "mx8qm-scfw-tcm.bin"
SC_MACHINE_NAME_mx8qm = "mx8qm-scfw-tcm.bin"
SC_MACHINE_NAME_mx8qxp = "mx8qx-scfw-tcm.bin"

SYSROOT_DIRS += "/boot"

do_install () {
    install -d ${D}/boot
    install -m 0644 ${S}/${SC_MACHINE_NAME} ${D}/boot/
}

BOOT_TOOLS = "imx-boot-tools"

do_deploy () {
    install -d ${DEPLOYDIR}/${BOOT_TOOLS}
    install -m 0644 ${S}/${SC_MACHINE_NAME} ${DEPLOYDIR}/${BOOT_TOOLS}/
}

addtask deploy after do_install

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
PACKAGE_ARCH = "${MACHINE_ARCH}"

FILES_${PN} = "/boot"

COMPATIBLE_MACHINE = "(mx8qm|mx8qxp)"
