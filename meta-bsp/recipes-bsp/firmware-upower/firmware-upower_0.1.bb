# Copyright 2021 NXP
DESCRIPTION = "NXP i.MX uPower firmware"
LICENSE = "Proprietary"
SECTION = "BSP"
LIC_FILES_CHKSUM = "file://COPYING;md5=b3b0bab6ff55420d043cf1652c52d788"

inherit fsl-eula2-unpack2 pkgconfig deploy

SRC_URI[md5sum] = "1d94fae1ce2c4dc542c436e982c71b86"
SRC_URI[sha256sum] = "9f5f315e4758820b415961b662e38e2b716c3bdf189e5c66a6e76af6e7d597eb"

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
