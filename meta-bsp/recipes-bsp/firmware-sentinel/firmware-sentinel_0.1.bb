# Copyright 2021 NXP
DESCRIPTION = "NXP i.MX 8ULP SECO Firmware"
LICENSE = "Proprietary"
SECTION = "BSP"
LIC_FILES_CHKSUM = "file://COPYING;md5=b3b0bab6ff55420d043cf1652c52d788"

inherit fsl-eula2-unpack2 pkgconfig deploy

SRC_URI[md5sum] = "a77bfeae003dd0bcb55688bac40bc613"
SRC_URI[sha256sum] = "747fceb91b6598fbcb2790c5f0ac124ec6ec9416c977a105f6224b062116fef5"

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
