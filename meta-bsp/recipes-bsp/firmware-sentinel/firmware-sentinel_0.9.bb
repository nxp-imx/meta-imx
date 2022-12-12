# Copyright 2021-2023 NXP
SUMMARY = "NXP i.MX Sentinel firmware"
DESCRIPTION = "Firmware for i.MX Sentinel Security Controller"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=add2d392714d3096ed7e0f7e2190724b"

inherit fsl-eula-unpack use-imx-security-controller-firmware deploy

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "b7cb8827486805f8f7b03f963759539e"
SRC_URI[sha256sum] = "2ec672929ff302923e44670ae9fd066c4b70d9180b55605e184f2b7815173424"

do_compile[noexec] = "1"

do_install() {
   install -d ${D}${nonarch_base_libdir}/firmware/ele
   install -m 0644 ${S}/${SECO_FIRMWARE_NAME} ${D}${nonarch_base_libdir}/firmware/ele
}

do_deploy () {
    # Deploy the related firmware to be package by imx-boot
    install -m 0644 ${S}/${SECO_FIRMWARE_NAME}  ${DEPLOYDIR}
}
addtask deploy after do_install before do_build

FILES:${PN} += "${nonarch_base_libdir}/firmware/ele/${SECO_FIRMWARE_NAME}"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx9-nxp-bsp)"
