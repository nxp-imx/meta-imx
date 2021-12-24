# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2021 NXP

DESCRIPTION = "i.MX System Controller Firmware"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=dedee5689786754f61ea3a76035c8a81" 
SECTION = "BSP"

inherit fsl-eula2-unpack2 pkgconfig deploy

SRC_URI[md5sum] = "2a92cdb370dd54b647281ec2e7b22e4c"
SRC_URI[sha256sum] = "c961f9d6fbbce27fa3b9de3a8ad50a1d7455d0679321a5e6845e92faf5be745f"

BOARD_TYPE ?= "mek"
SC_FIRMWARE_NAME ?= "INVALID"
SC_FIRMWARE_NAME:mx8qm = "mx8qm-${BOARD_TYPE}-scfw-tcm.bin"
SC_FIRMWARE_NAME:mx8qxp = "mx8qx-${BOARD_TYPE}-scfw-tcm.bin"
SC_FIRMWARE_NAME:mx8dxl = "mx8dxl-${BOARD_TYPE}-scfw-tcm.bin"
SC_FIRMWARE_NAME:mx8dx = "mx8dx-${BOARD_TYPE}-scfw-tcm.bin"

symlink_name = "scfw_tcm.bin"

BOOT_TOOLS = "imx-boot-tools"

do_compile[noexec] = "1"

do_install[noexec] = "1"

do_deploy() {
    install -Dm 0644 ${S}/${SC_FIRMWARE_NAME} ${DEPLOYDIR}/${BOOT_TOOLS}/${SC_FIRMWARE_NAME}
    ln -sf ${SC_FIRMWARE_NAME} ${DEPLOYDIR}/${BOOT_TOOLS}/${symlink_name}
}
addtask deploy after do_install

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "(mx8)"
COMPATIBLE_MACHINE:mx8m = "(^$)"
