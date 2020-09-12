# Copyright 2017-2020 NXP

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

# Firmware for Murata QCA Modules
SRC_URI += " \
            git://github.com/murata-wireless/qca-linux-calibration.git;protocol=https;name=murata-qca;destsuffix=murata-qca \
"
SRCREV_murata-qca = "a0026b646ce6adfb72f135ffa8a310f3614b2272"

# Firmware for Murata CYW4339/CYW43430/CYW43455/CYW4356/CYW4359 Module
# Firmware for Marvell Wi-Fi Modules
IMX_FIRMWARE_SRC ?= "git://github.com/NXP/imx-firmware.git;protocol=https"
SRCBRANCH = "master"
SRC_URI += " \
           ${IMX_FIRMWARE_SRC};branch=${SRCBRANCH};destsuffix=imx-firmware;name=imx-firmware \
"

SRCREV_imx-firmware = "484d38224fa2c26b8859a7bf20b7c4d49100f5bc"

SRCREV_FORMAT = "default_murata-qca_imx-firmware"

do_install_append () {
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
    install -m 0644 ${WORKDIR}/imx-firmware/cyw-wifi-bt/1FD_CYW4359/BCM4349B1_*.hcd ${D}${sysconfdir}/firmware

    # Install Marvell PCIE8997 firmware
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8997/pcie8997_wlan_v4.bin ${D}${nonarch_base_libdir}/firmware/mrvl
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8997/pcieuart8997_combo_v4.bin ${D}${nonarch_base_libdir}/firmware/mrvl
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8997/helper_uart_3000000.bin ${D}${nonarch_base_libdir}/firmware/mrvl
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8997/uart8997_bt_v4.bin ${D}${nonarch_base_libdir}/firmware/mrvl
    install -d ${D}${datadir}/mrvl_wireless/bin_pcie8997
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8997/fw_loader_arm64 ${D}${datadir}/mrvl_wireless/bin_pcie8997

    # Install Marvell 8987 firmware
    install -d ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8987/sdiouart8987_combo_v0.bin ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8987/wifi_mod_para_sd8987.conf ${D}${nonarch_base_libdir}/firmware/nxp
}

# Use the latest version of sdma firmware in firmware-imx
PACKAGES_remove = "${PN}-imx-sdma-license ${PN}-imx-sdma-imx6q ${PN}-imx-sdma-imx7d"
PACKAGES =+ " ${PN}-bcm4359-pcie ${PN}-nxp8987"

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
       ${sysconfdir}/firmware/BCM4349B1_*.hcd \
"

FILES_${PN}-pcie8997 += " \
       ${nonarch_base_libdir}/firmware/mrvl/helper_uart_3000000.bin \
       ${nonarch_base_libdir}/firmware/mrvl/uart8997_bt_v4.bin \
       ${datadir}/mrvl_wireless/bin_pcie8997/fw_loader_arm64 \
"


FILES_${PN}-nxp8987 = " \
       ${nonarch_base_libdir}/firmware/nxp/sdiouart8987_combo_v0.bin \
       ${nonarch_base_libdir}/firmware/nxp/wifi_mod_para_sd8987.conf \
"
