# Copyright 2019-2022 NXP

SUMMARY = "NXP i.MX SECO firmware"
DESCRIPTION = "Firmware for i.MX SECO Security Controller"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829"

inherit fsl-eula-unpack use-imx-security-controller-firmware deploy

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"

SRC_URI[md5sum] = "2427a45069a89bb9b9b470642ce17f18"
SRC_URI[sha256sum] = "3bf3f4ae69f77fd8fe28a216f3927fb84e75461364ad332dd9b4605beadae59a"


do_compile[noexec] = "1"

do_install() {
}

addtask deploy after do_install
do_deploy () {
    # Deploy i.MX8 SECO firmware files
    install -m 0644 ${S}/firmware/seco/${SECO_FIRMWARE_NAME} ${DEPLOYDIR}
}

COMPATIBLE_MACHINE = "(mx8-nxp-bsp)"
COMPATIBLE_MACHINE:mx8m-nxp-bsp = "(^$)"
