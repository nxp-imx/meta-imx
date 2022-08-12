# Copyright 2021-2022 NXP
DESCRIPTION = "NXP i.MX uPower firmware"
LICENSE = "Proprietary"
SECTION = "BSP"
LIC_FILES_CHKSUM = "file://COPYING;md5=65c483bb431ccd9a1820e6872c604771"

inherit fsl-eula2-unpack2 pkgconfig deploy

SRC_URI[md5sum] = "ce9bfbb98acd80d157f21b5f15f1d822"
SRC_URI[sha256sum] = "6ae22981bb7db3912059f357faf08a247a63e3c8a32a029d73f896d3ea08b039"

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
