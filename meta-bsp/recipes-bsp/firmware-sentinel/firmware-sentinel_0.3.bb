# Copyright 2021-2022 NXP
SUMMARY = "NXP i.MX Sentinel firmware"
DESCRIPTION = "Firmware for i.MX Sentinel Security Controller"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829"

inherit fsl-eula-unpack use-imx-security-controller-firmware deploy

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "8551a2af761d4a4a9b13a56c3e8a0986"
SRC_URI[sha256sum] = "3812e02986b12aa2fd54ec520026c31be8a1d1fb1b5fb37461923aa7c1460a72"

do_compile[noexec] = "1"

do_install() {
}

do_deploy () {
    # Deploy the related firmware to be package by imx-boot
    install -m 0644 ${S}/${SECO_FIRMWARE_NAME}  ${DEPLOYDIR}
}
addtask deploy after do_install before do_build

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp)"
