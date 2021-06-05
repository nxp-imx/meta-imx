# Copyright 2021 NXP
DESCRIPTION = "NXP i.MX uPower firmware"
LICENSE = "Proprietary"
SECTION = "BSP"
LIC_FILES_CHKSUM = "file://COPYING;md5=417b82f17fc02b88125331ed312f6f1b"

inherit fsl-eula2-unpack2 pkgconfig deploy

SRC_URI[md5sum] = "2d5d825ce59581be0ae21623c2227ea8"
SRC_URI[sha256sum] = "12304f2635eb46f9ca2c6c06c04739a700cce76e1c3ce7c3b35095560ab71511"

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
