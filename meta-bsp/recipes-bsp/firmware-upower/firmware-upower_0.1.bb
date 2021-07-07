# Copyright 2021 NXP
DESCRIPTION = "NXP i.MX uPower firmware"
LICENSE = "Proprietary"
SECTION = "BSP"
LIC_FILES_CHKSUM = "file://COPYING;md5=f35df765ff17e69043ea21f350e3229c"

inherit fsl-eula2-unpack2 pkgconfig deploy

SRC_URI[md5sum] = "9177ad7b64d118d1c60bd774e3fef74a"
SRC_URI[sha256sum] = "e8b5781435e09d3aa25ca671125cbf84dac9ccf482a75da7f13ebb7031fb45c5"

do_configure[noexec] = "1"

do_compile[noexec] = "1"

do_install[noexec] = "1"

BOOT_TOOLS = "imx-boot-tools"

do_deploy () {
    # Deploy the related firmware to be package by imx-boot
    install -d ${DEPLOYDIR}/${BOOT_TOOLS}
    install -m 0644 ${S}/upower.bin  ${DEPLOYDIR}/${BOOT_TOOLS}
}
addtask deploy after do_install before do_build

COMPATIBLE_MACHINE = "(mx8ulp)"
