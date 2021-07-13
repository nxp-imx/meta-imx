# Copyright 2021 NXP
DESCRIPTION = "NXP i.MX uPower firmware"
LICENSE = "Proprietary"
SECTION = "BSP"
LIC_FILES_CHKSUM = "file://COPYING;md5=f35df765ff17e69043ea21f350e3229c"

inherit fsl-eula2-unpack2 pkgconfig deploy

SRC_URI[md5sum] = "c0ac6a268dfa612ed29420b1bd42e9dd"
SRC_URI[sha256sum] = "553f5ca807c92ca00240bdce1817fba5d3fc7565c748e3eb5b119f17ebda6a11"

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
