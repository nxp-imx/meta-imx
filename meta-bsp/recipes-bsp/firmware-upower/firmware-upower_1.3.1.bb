# Copyright 2021-2023 NXP
DESCRIPTION = "NXP i.MX uPower firmware"
LICENSE = "Proprietary"
SECTION = "BSP"
LIC_FILES_CHKSUM = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"

inherit fsl-eula2-unpack2 pkgconfig deploy

SRC_URI[md5sum] = "e6c8f0d7490475627b153188aca1f22e"
SRC_URI[sha256sum] = "1e9f224b1862640a2ae4c0ec83ee37dded7752d6a459936ab3afdcde04b07b9c"

do_configure[noexec] = "1"

do_compile[noexec] = "1"

do_install[noexec] = "1"

BOOT_TOOLS = "imx-boot-tools"

do_deploy () {
    # Deploy the related firmware to be package by imx-boot
    install -d ${DEPLOYDIR}/${BOOT_TOOLS}
    install -m 0644 ${S}/${UPOWER_FIRMWARE_NAME}  ${DEPLOYDIR}/${BOOT_TOOLS}/upower.bin
}
addtask deploy after do_install before do_build

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp)"
