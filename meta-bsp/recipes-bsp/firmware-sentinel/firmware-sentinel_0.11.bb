# Copyright 2021-2023 NXP
SUMMARY = "NXP i.MX Sentinel firmware"
DESCRIPTION = "Firmware for i.MX Sentinel Security Controller"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"

inherit fsl-eula-unpack use-imx-security-controller-firmware deploy

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "9d0de3a380417188724b9dfa8207bf38"
SRC_URI[sha256sum] = "20b9bd86140dc569be6ac2aec83ed92fbef4e11b9a0bf93d3386f940d6d1f497"

do_compile[noexec] = "1"

do_install() {
   install -d ${D}${nonarch_base_libdir}/firmware/imx/ele
   install -m 0644 ${S}/${SECO_FIRMWARE_NAME} ${D}${nonarch_base_libdir}/firmware/imx/ele
}

do_deploy () {
    # Deploy the related firmware to be package by imx-boot
    install -m 0644 ${S}/${SECO_FIRMWARE_NAME}  ${DEPLOYDIR}
}
addtask deploy after do_install before do_build

FILES:${PN} += "${nonarch_base_libdir}/firmware/imx/ele/${SECO_FIRMWARE_NAME}"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx9-nxp-bsp)"
