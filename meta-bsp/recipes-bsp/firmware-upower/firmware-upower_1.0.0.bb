# Copyright 2021-2022 NXP
DESCRIPTION = "NXP i.MX uPower firmware"
LICENSE = "Proprietary"
SECTION = "BSP"
LIC_FILES_CHKSUM = "file://COPYING;md5=b54da624b8d2ffe8a3b47757da48e60f"

inherit fsl-eula2-unpack2 pkgconfig deploy

SRC_URI[md5sum] = "1bffa36c6589c5295d50f90af9cf37ca"
SRC_URI[sha256sum] = "31cbb0f640a24cd4c0518dada8130c8a1950da4f2f9a2e138140bd77906a8746"

do_configure[noexec] = "1"

do_compile[noexec] = "1"

do_install[noexec] = "1"

BOOT_TOOLS = "imx-boot-tools"

do_deploy () {
    # Deploy the related firmware to be package by imx-boot
    install -d ${DEPLOYDIR}/${BOOT_TOOLS}
    install -m 0644 ${S}/upower_a0.1.bin  ${DEPLOYDIR}/${BOOT_TOOLS}/upower.bin
}
addtask deploy after do_install before do_build

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp)"
