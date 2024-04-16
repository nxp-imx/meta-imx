# Copyright 2021-2023 NXP
SUMMARY = "NXP i.MX ELE firmware"
DESCRIPTION = "EdgeLock Secure Enclave firmware for i.MX series SoCs"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"

inherit fsl-eula-unpack use-imx-security-controller-firmware deploy

SRC_URI = "${FSL_MIRROR}/${BP}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "b2317da"
SRC_URI[md5sum] = "851a04739ce09d83205b4b80cc708e49"
SRC_URI[sha256sum] = "504e7b304ded7a20ee59192a6c73e42832e53aeb7efdfc89164bd1f1166cfc7b"

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
