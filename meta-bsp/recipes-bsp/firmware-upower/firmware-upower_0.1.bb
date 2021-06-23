# Copyright 2021 NXP
DESCRIPTION = "NXP i.MX uPower firmware"
LICENSE = "Proprietary"
SECTION = "BSP"
LIC_FILES_CHKSUM = "file://COPYING;md5=b3b0bab6ff55420d043cf1652c52d788"

inherit fsl-eula2-unpack2 pkgconfig deploy

SRC_URI[md5sum] = "db57de38e141709772319c1477eebfdf"
SRC_URI[sha256sum] = "6656aae0cf68d79d8a457e665a0a5bf222ab7db31d78056e787e20c4ca4f0353"

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
