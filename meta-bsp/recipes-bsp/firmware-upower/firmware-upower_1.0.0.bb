# Copyright 2021-2022 NXP
DESCRIPTION = "NXP i.MX uPower firmware"
LICENSE = "Proprietary"
SECTION = "BSP"
LIC_FILES_CHKSUM = "file://COPYING;md5=b54da624b8d2ffe8a3b47757da48e60f"

inherit fsl-eula2-unpack2 pkgconfig deploy

SRC_URI[md5sum] = "e4286b5d4a411835300f385c9e8ee2c9"
SRC_URI[sha256sum] = "5002e5e6e6d1a2d18fc8a1fc6e3c10c947f332482ae4e0ff0da721dd2c1dafc2"

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
