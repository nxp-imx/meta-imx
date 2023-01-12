# Copyright 2021-2022 NXP
DESCRIPTION = "NXP i.MX uPower firmware"
LICENSE = "Proprietary"
SECTION = "BSP"
LIC_FILES_CHKSUM = "file://COPYING;md5=ea25d099982d035af85d193c88a1b479"

inherit fsl-eula2-unpack2 pkgconfig deploy

SRC_URI[md5sum] = "6067c06d8d01cc3d30c5009683bf27b6"
SRC_URI[sha256sum] = "1aa8c49fee2949cf6043d106d3d4ebe3eaa17e47f4f6353120109cd4d5425e27"

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
