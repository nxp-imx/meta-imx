# Copyright 2021 NXP
DESCRIPTION = "NXP i.MX 8ULP SECO Firmware"
LICENSE = "Proprietary"
SECTION = "BSP"
LIC_FILES_CHKSUM = "file://COPYING;md5=f35df765ff17e69043ea21f350e3229c"

inherit fsl-eula2-unpack2 pkgconfig deploy

SRC_URI[md5sum] = "2251bfb37203b6fe5d9acbe88c960c58"
SRC_URI[sha256sum] = "3db2e29fe16119a581d84a42a47de8a00732e3cfb4b94beb85a91536fa59497e"

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
