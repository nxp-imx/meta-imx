# Copyright 2021-2023 NXP
DESCRIPTION = "NXP i.MX uPower firmware"
LICENSE = "Proprietary"
SECTION = "BSP"
LIC_FILES_CHKSUM = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"

inherit fsl-eula2-unpack2 pkgconfig deploy

SRC_URI[md5sum] = "c672103f21060544e62c8c48a5f06a32"
SRC_URI[sha256sum] = "a2847df941e14ab1e4c7750bf24b0dbf16256423251592771b95e4b9f64ce289"

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
