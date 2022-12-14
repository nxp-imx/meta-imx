# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2019 NXP

DESCRIPTION = "i.MX System Controller Firmware"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=add2d392714d3096ed7e0f7e2190724b"
SECTION = "BSP"

inherit fsl-eula2-unpack2 pkgconfig deploy

SRC_URI[md5sum] = "0ef32d52172c0956119d800b0f7918bd"
SRC_URI[sha256sum] = "ab946e91480f21f6735793c1191f5a1afc12d506b938e79f0353254e8558335c"

BOARD_TYPE ?= "mek"
SC_FIRMWARE_NAME ?= "INVALID"
SC_FIRMWARE_NAME_mx8qm = "mx8qm-${BOARD_TYPE}-scfw-tcm.bin"
SC_FIRMWARE_NAME_mx8qxp = "mx8qx-${BOARD_TYPE}-scfw-tcm.bin"
SC_FIRMWARE_NAME_mx8phantomdxl = "mx8dxl-phantom-${BOARD_TYPE}-scfw-tcm.bin"
SC_FIRMWARE_NAME_mx8dxl = "mx8dxl-${BOARD_TYPE}-scfw-tcm.bin"
SC_FIRMWARE_NAME_mx8dx = "mx8dx-${BOARD_TYPE}-scfw-tcm.bin"

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
COMPATIBLE_MACHINE_mx8m = "(^$)"
