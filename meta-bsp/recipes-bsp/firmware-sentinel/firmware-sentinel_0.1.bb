# Copyright 2021 NXP
DESCRIPTION = "NXP i.MX 8ULP SECO Firmware"
LICENSE = "Proprietary"
SECTION = "BSP"
LIC_FILES_CHKSUM = "file://COPYING;md5=417b82f17fc02b88125331ed312f6f1b"

inherit fsl-eula2-unpack2 pkgconfig deploy

SRC_URI[md5sum] = "3850c2642746018cec46df2b62ee0f4e"
SRC_URI[sha256sum] = "cc2c9ee83de8bb65aa2e017bafea0b7a2a3506798d54f3dd3981c0a3dc60a0ec"

do_configure[noexec] = "1"

do_compile[noexec] = "1"

do_install[noexec] = "1"

BOOT_TOOLS = "imx-boot-tools"

do_deploy () {
    # Deploy the related firmware to be package by imx-boot
    install -d ${DEPLOYDIR}/${BOOT_TOOLS}
    install -m 0644 ${S}/mx8ulpa0-ahab-container.img  ${DEPLOYDIR}/${BOOT_TOOLS}
}
addtask deploy after do_install before do_build

COMPATIBLE_MACHINE = "(mx8ulp)"
