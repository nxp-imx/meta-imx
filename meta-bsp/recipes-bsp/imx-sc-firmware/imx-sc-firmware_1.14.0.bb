# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2022 NXP

DESCRIPTION = "i.MX System Controller Firmware"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=65c483bb431ccd9a1820e6872c604771"
SECTION = "BSP"

inherit fsl-eula2-unpack2 pkgconfig deploy

SRC_URI[md5sum] = "f33d446b4bbd35f1df5138362da1f248"
SRC_URI[sha256sum] = "90915fcdddacd43695b2d92565fb8309e6023134364a2aa8456c0a1a60a8fdb4"

BOARD_TYPE ?= "mek"
SC_FIRMWARE_NAME ?= "INVALID"
SC_FIRMWARE_NAME:mx8qm-nxp-bsp = "mx8qm-${BOARD_TYPE}-scfw-tcm.bin"
SC_FIRMWARE_NAME:mx8qxp-nxp-bsp = "mx8qx-${BOARD_TYPE}-scfw-tcm.bin"
SC_FIRMWARE_NAME:mx8dxl-nxp-bsp = "mx8dxl-${BOARD_TYPE}-scfw-tcm.bin"
SC_FIRMWARE_NAME:mx8dx-nxp-bsp = "mx8dx-${BOARD_TYPE}-scfw-tcm.bin"

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

COMPATIBLE_MACHINE = "(mx8qm-nxp-bsp|mx8qxp-nxp-bsp|mx8dxl-nxp-bsp|mx8dx-nxp-bsp)"
