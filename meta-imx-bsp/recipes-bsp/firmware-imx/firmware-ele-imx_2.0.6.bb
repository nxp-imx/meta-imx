# Copyright 2021-2025 NXP
SUMMARY = "NXP i.MX ELE firmware"
DESCRIPTION = "EdgeLock Secure Enclave firmware for i.MX series SoCs"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

inherit fsl-eula-unpack use-imx-security-controller-firmware deploy

SRC_URI = "${FSL_MIRROR}/${BP}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "4f3b746"
SRC_URI[sha256sum] = "46bfb704dedf2993c5c408073121e44ca9103dbbcb1bb91a84f6d3d9a2249682"

S = "${UNPACKDIR}/${BP}-${IMX_SRCREV_ABBREV}"

do_compile[noexec] = "1"

do_install() {
    install -d ${D}${nonarch_base_libdir}/firmware/imx/ele
    for fw in ${SECO_FIRMWARE_NAME} ${SECOEXT_FIRMWARE_NAME}; do
        install -m 0644 ${S}/$fw ${D}${nonarch_base_libdir}/firmware/imx/ele
    done
}

do_deploy () {
    # Deploy the related firmware to be packaged by imx-boot
    for fw in ${SECO_FIRMWARE_NAME}; do
        install -m 0644 ${S}/$fw  ${DEPLOYDIR}
    done
}
addtask deploy after do_install before do_build

FILES:${PN} = "${nonarch_base_libdir}/firmware"

RREPLACES:${PN} = "firmware-sentinel"
RPROVIDES:${PN} = "firmware-sentinel"

COMPATIBLE_MACHINE = "(mx8ulp-generic-bsp|mx9-generic-bsp)"
