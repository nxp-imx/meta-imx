# Copyright 2021-2023 NXP
SUMMARY = "NXP i.MX ELE firmware"
DESCRIPTION = "EdgeLock Enclave firmware for i.MX series SoCs"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=2827219e81f28aba7c6a569f7c437fa7" 

inherit fsl-eula-unpack use-imx-security-controller-firmware deploy

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "fab6abd752ea51188569b3e918fa319a"
SRC_URI[sha256sum] = "b362ddcffeea152bd4fc9403cce28c5856da9caf869fc27d1478b2fc0b21cfaa"

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
