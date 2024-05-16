# Copyright 2021-2023 NXP
SUMMARY = "NXP i.MX ELE firmware"
DESCRIPTION = "EdgeLock Secure Enclave firmware for i.MX series SoCs"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"

inherit fsl-eula-unpack use-imx-security-controller-firmware deploy

SRC_URI = "${FSL_MIRROR}/${BP}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "51f96d0"
SRC_URI[md5sum] = "232dc6d49f499d676c4392f8cb5aca3a"
SRC_URI[sha256sum] = "d407d278af5e4e7d81142932b04dffaa9380835e4f278c7cb874fb6820b460bb"

S = "${WORKDIR}/${BP}-${IMX_SRCREV_ABBREV}"

do_compile[noexec] = "1"

do_install() {
   install -d ${D}${nonarch_base_libdir}/firmware/imx/ele
   install -m 0644 ${S}/${SECO_FIRMWARE_NAME} ${D}${nonarch_base_libdir}/firmware/imx/ele
    if [ -e ${S}/${SECOEXT_FIRMWARE_NAME} ]; then
        install -m 0644 ${S}/${SECOEXT_FIRMWARE_NAME} ${D}${nonarch_base_libdir}/firmware/imx/ele
    fi
}

do_deploy () {
    # Deploy the related firmware to be package by imx-boot
    install -m 0644 ${S}/${SECO_FIRMWARE_NAME}  ${DEPLOYDIR}
}
addtask deploy after do_install before do_build

PACKAGES += "${PN}-ext"

ALLOW_EMPTY:${PN}-ext = "1"

FILES:${PN} += "${nonarch_base_libdir}/firmware/imx/ele/${SECO_FIRMWARE_NAME}"
FILES:${PN}-ext += "${nonarch_base_libdir}/firmware/imx/ele/${SECOEXT_FIRMWARE_NAME}"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx9-nxp-bsp)"
