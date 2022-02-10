# Copyright 2021 NXP
DESCRIPTION = "NXP i.MX 8ULP SECO Firmware"
LICENSE = "Proprietary"
SECTION = "BSP"
LIC_FILES_CHKSUM = "file://COPYING;md5=e565271ec9a80ce47abbddc4bffe56fa" 

inherit fsl-eula2-unpack2 pkgconfig deploy

SRC_URI[md5sum] = "80b10540655af5770a2f9a0c7c692d56"
SRC_URI[sha256sum] = "1a1757b5afb03d64d829474de9fa5ccc92556546944d2dc15d03a0a08cdfb958"

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
