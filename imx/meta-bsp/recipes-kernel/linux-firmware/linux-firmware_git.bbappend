# Copyright 2017-2019 NXP

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

# Firmware for Murata QCA Modules
SRC_URI += " \
            file://firmware.conf \
            git://github.com/murata-wireless/qca-linux-calibration.git;protocol=https;name=murata-qca;destsuffix=murata-qca \
"
SRCREV_murata-qca = "a0026b646ce6adfb72f135ffa8a310f3614b2272"

# Firmware for Murata CYW4339/CYW43430/CYW43455/CYW4356/CYW4359 Module
IMX_FIRMWARE_SRC ?= "git://github.com/NXP/imx-firmware.git;protocol=https"
SRC_URI += " \
           ${IMX_FIRMWARE_SRC};branch=master;destsuffix=imx-firmware;name=imx-firmware \
"
SRCREV_imx-firmware = "f6d0859f9435796f03ae93b70b5f92f4406bc56d"

SRCREV_FORMAT = "default_murata-qca+imx-firmware"

do_install_append () {
    # Install firmware.conf for QCA modules
    install -d ${D}${sysconfdir}/bluetooth
    cp ${WORKDIR}/firmware.conf ${D}${sysconfdir}/bluetooth

    # Use Murata's QCA calibration files
    install -m 0644 ${WORKDIR}/murata-qca/1CQ/board.bin ${D}${nonarch_base_libdir}/firmware/ath10k/QCA6174/hw3.0/

    # No need to do install for imx sdma binaries
    if [ -d ${D}${base_libdir}/firmware/imx/sdma ]; then
        rm -rf ${D}${base_libdir}/firmware/imx/sdma
    fi

    install -d ${D}${sysconfdir}/firmware
    # Install Murata CYW4339 firmware
    install -m 0644 ${WORKDIR}/imx-firmware/cyw-wifi-bt/ZP_CYW4339/brcmfmac4339-sdio.bin ${D}${nonarch_base_libdir}/firmware/brcm/brcmfmac4339-sdio.bin
    install -m 0644 ${WORKDIR}/imx-firmware/cyw-wifi-bt/ZP_CYW4339/brcmfmac4339-sdio*.txt ${D}${nonarch_base_libdir}/firmware/brcm
    install -m 0644 ${WORKDIR}/imx-firmware/cyw-wifi-bt/ZP_CYW4339/BCM4335C0.ZP.hcd ${D}${sysconfdir}/firmware

    # Install Murata CYW43430 firmware
    install -m 0644 ${WORKDIR}/imx-firmware/cyw-wifi-bt/1DX_CYW43430/brcmfmac43430-sdio.bin ${D}${nonarch_base_libdir}/firmware/brcm
    install -m 0644 ${WORKDIR}/imx-firmware/cyw-wifi-bt/1DX_CYW43430/brcmfmac43430-sdio.clm_blob ${D}${nonarch_base_libdir}/firmware/brcm
    install -m 0644 ${WORKDIR}/imx-firmware/cyw-wifi-bt/1DX_CYW43430/brcmfmac43430-sdio.txt ${D}${nonarch_base_libdir}/firmware/brcm
    install -m 0644 ${WORKDIR}/imx-firmware/cyw-wifi-bt/1DX_CYW43430/BCM43430A1.1DX.hcd ${D}${sysconfdir}/firmware

    # Install Murata CYW43455 firmware
    install -m 0644 ${WORKDIR}/imx-firmware/cyw-wifi-bt/1MW_CYW43455/brcmfmac43455-sdio.bin ${D}${nonarch_base_libdir}/firmware/brcm
    install -m 0644 ${WORKDIR}/imx-firmware/cyw-wifi-bt/1MW_CYW43455/brcmfmac43455-sdio.clm_blob ${D}${nonarch_base_libdir}/firmware/brcm
    install -m 0644 ${WORKDIR}/imx-firmware/cyw-wifi-bt/1MW_CYW43455/brcmfmac43455-sdio.txt ${D}${nonarch_base_libdir}/firmware/brcm
    install -m 0644 ${WORKDIR}/imx-firmware/cyw-wifi-bt/1MW_CYW43455/BCM4345C0.1MW.hcd ${D}${sysconfdir}/firmware

    # Install Murata CYW4356 firmware
    install -m 0644 ${WORKDIR}/imx-firmware/cyw-wifi-bt/1CX_CYW4356/brcmfmac4356-pcie.bin ${D}${nonarch_base_libdir}/firmware/brcm
    install -m 0644 ${WORKDIR}/imx-firmware/cyw-wifi-bt/1CX_CYW4356/brcmfmac4356-pcie.clm_blob ${D}${nonarch_base_libdir}/firmware/brcm
    install -m 0644 ${WORKDIR}/imx-firmware/cyw-wifi-bt/1CX_CYW4356/brcmfmac4356-pcie.txt ${D}${nonarch_base_libdir}/firmware/brcm
    install -m 0644 ${WORKDIR}/imx-firmware/cyw-wifi-bt/1CX_CYW4356/BCM4354A2.1CX.hcd ${D}${sysconfdir}/firmware

    # Install Murata CYW4359 firmware
    install -m 0644 ${WORKDIR}/imx-firmware/cyw-wifi-bt/1FD_CYW4359/brcmfmac4359-pcie.bin ${D}${nonarch_base_libdir}/firmware/brcm
    install -m 0644 ${WORKDIR}/imx-firmware/cyw-wifi-bt/1FD_CYW4359/brcmfmac4359-pcie.clm_blob ${D}${nonarch_base_libdir}/firmware/brcm
    install -m 0644 ${WORKDIR}/imx-firmware/cyw-wifi-bt/1FD_CYW4359/brcmfmac4359-pcie.txt ${D}${nonarch_base_libdir}/firmware/brcm
    install -m 0644 ${WORKDIR}/imx-firmware/cyw-wifi-bt/1FD_CYW4359/BCM4349B1_002.002.014.0077.0083.hcd ${D}${sysconfdir}/firmware
}

# Use the latest version of sdma firmware in firmware-imx
PACKAGES_remove = "${PN}-imx-sdma-license ${PN}-imx-sdma-imx6q ${PN}-imx-sdma-imx7d"
PACKAGES =+ " ${PN}-bcm4359-pcie"

FILES_${PN}-qca += " \
  ${sysconfdir}/bluetooth/firmware.conf \
"

FILES_${PN}-bcm4339 += " \
       ${nonarch_base_libdir}/firmware/brcm/brcmfmac4339-sdio.txt \
       ${sysconfdir}/firmware/BCM4335C0.ZP.hcd \
"

FILES_${PN}-bcm43430 += " \
       ${nonarch_base_libdir}/firmware/brcm/brcmfmac43430-sdio.clm_blob \
       ${nonarch_base_libdir}/firmware/brcm/brcmfmac43430-sdio.txt \
       ${sysconfdir}/firmware/BCM43430A1.1DX.hcd \
"

FILES_${PN}-bcm43455 += " \
       ${nonarch_base_libdir}/firmware/brcm/brcmfmac43455-sdio.clm_blob \
       ${nonarch_base_libdir}/firmware/brcm/brcmfmac43455-sdio.txt \
       ${sysconfdir}/firmware/BCM4345C0.1MW.hcd \
"

FILES_${PN}-bcm4356-pcie += " \
       ${nonarch_base_libdir}/firmware/brcm/brcmfmac4356-pcie.clm_blob \
       ${nonarch_base_libdir}/firmware/brcm/brcmfmac4356-pcie.txt \
       ${sysconfdir}/firmware/BCM4354A2.1CX.hcd \
"

LICENSE_${PN}-bcm4359-pcie = "Firmware-cypress"
RDEPENDS_${PN}-bcm4359-pcie += "${PN}-cypress-license"

FILES_${PN}-bcm4359-pcie = " \
       ${nonarch_base_libdir}/firmware/brcm/brcmfmac4359-pcie.bin \
       ${nonarch_base_libdir}/firmware/brcm/brcmfmac4359-pcie.clm_blob \
       ${nonarch_base_libdir}/firmware/brcm/brcmfmac4359-pcie.txt \
       ${sysconfdir}/firmware/BCM4349B1_002.002.014.0077.0083.hcd \
"
