# Copyright 2017-2022 NXP

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

IMX_FIRMWARE_SRC ?= "git://github.com/NXP/imx-firmware.git;protocol=https"
SRCBRANCH_imx-firmware = "lf-6.1.22_2.0.0"
SRC_URI += " \
    git://github.com/murata-wireless/qca-linux-calibration.git;protocol=https;branch=master;name=murata-qca;destsuffix=murata-qca \
    ${IMX_FIRMWARE_SRC};branch=${SRCBRANCH_imx-firmware};destsuffix=imx-firmware;name=imx-firmware \
"

SRCREV_murata-qca = "a0026b646ce6adfb72f135ffa8a310f3614b2272"
SRCREV_imx-firmware = "f775d53ca3a478c85e8c8a880e44cc269bd14db0"

SRCREV_FORMAT = "default_murata-qca_imx-firmware"

do_install:append () {
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

    # Install NXP Connectivity
    install -d ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/wifi_mod_para.conf    ${D}${nonarch_base_libdir}/firmware/nxp

    # Install NXP Connectivity SD8801 firmware
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8801_SD/ed_mac_ctrl_V1_8801.conf  ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8801_SD/sd8801_uapsta.bin         ${D}${nonarch_base_libdir}/firmware/nxp

    # Install NXP Connectivity 8987 firmware
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8987/ed_mac_ctrl_V3_8987.conf  ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8987/sd8987_wlan.bin           ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8987/sdiouart8987_combo_v0.bin ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8987/txpwrlimit_cfg_8987.conf  ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8987/uartuart8987_bt.bin       ${D}${nonarch_base_libdir}/firmware/nxp

    # Install NXP Connectivity PCIE8997 firmware
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8997/ed_mac_ctrl_V3_8997.conf  ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8997/pcie8997_wlan_v4.bin      ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8997/pcieuart8997_combo_v4.bin ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8997/txpwrlimit_cfg_8997.conf  ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8997/uartuart8997_bt_v4.bin    ${D}${nonarch_base_libdir}/firmware/nxp

    # Install NXP Connectivity SDIO8997 firmware
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8997_SD/ed_mac_ctrl_V3_8997.conf  ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8997_SD/sdio8997_wlan_v4.bin      ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8997_SD/sdiouart8997_combo_v4.bin ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8997_SD/txpwrlimit_cfg_8997.conf  ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8997_SD/uartuart8997_bt_v4.bin    ${D}${nonarch_base_libdir}/firmware/nxp

    # Install NXP Connectivity PCIE9098 firmware
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_9098_PCIE/ed_mac_ctrl_V3_909x.conf  ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_9098_PCIE/pcie9098_wlan_v1.bin      ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_9098_PCIE/pcieuart9098_combo_v1.bin ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_9098_PCIE/txpwrlimit_cfg_9098.conf  ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_9098_PCIE/uartuart9098_bt_v1.bin    ${D}${nonarch_base_libdir}/firmware/nxp

    # Install NXP Connectivity SD9098 firmware
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_9098_SD/sdio9098_wlan_v1.bin      ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_9098_SD/sdiouart9098_combo_v1.bin ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_9098_SD/uartuart9098_bt_v1.bin    ${D}${nonarch_base_libdir}/firmware/nxp

    # Install NXP Connectivity IW416 firmware
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_IW416_SD/sdioiw416_wlan_v0.bin      ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_IW416_SD/sdiouartiw416_combo_v0.bin ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_IW416_SD/uartiw416_bt_v0.bin        ${D}${nonarch_base_libdir}/firmware/nxp

    # Install NXP Connectivity IW612 firmware
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_IW612_SD/sduart_nw61x_v1.bin.se ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_IW612_SD/sd_w61x_v1.bin.se      ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_IW612_SD/uartspi_n61x_v1.bin.se ${D}${nonarch_base_libdir}/firmware/nxp
    install -d ${D}${nonarch_base_libdir}/firmware/nxp/IW612_SD_RFTest
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_IW612_SD/IW612_SD_RFTest/*      ${D}${nonarch_base_libdir}/firmware/nxp/IW612_SD_RFTest
}

# Use the latest version of sdma firmware in firmware-imx
PACKAGES:remove = "${PN}-imx-sdma-license ${PN}-imx-sdma-imx6q ${PN}-imx-sdma-imx7d"
PACKAGES =+ " ${PN}-bcm4359-pcie ${PN}-nxp89xx"

FILES:${PN}-bcm4339 += " \
       ${nonarch_base_libdir}/firmware/brcm/brcmfmac4339-sdio.txt \
       ${sysconfdir}/firmware/BCM4335C0.ZP.hcd \
"

FILES:${PN}-bcm43430 += " \
       ${nonarch_base_libdir}/firmware/brcm/brcmfmac43430-sdio.clm_blob \
       ${nonarch_base_libdir}/firmware/brcm/brcmfmac43430-sdio.txt \
       ${sysconfdir}/firmware/BCM43430A1.1DX.hcd \
"

FILES:${PN}-bcm43455 += " \
       ${nonarch_base_libdir}/firmware/brcm/brcmfmac43455-sdio.clm_blob \
       ${nonarch_base_libdir}/firmware/brcm/brcmfmac43455-sdio.txt \
       ${sysconfdir}/firmware/BCM4345C0.1MW.hcd \
"

FILES:${PN}-bcm4356-pcie += " \
       ${nonarch_base_libdir}/firmware/brcm/brcmfmac4356-pcie.clm_blob \
       ${nonarch_base_libdir}/firmware/brcm/brcmfmac4356-pcie.txt \
       ${sysconfdir}/firmware/BCM4354A2.1CX.hcd \
"

LICENSE:${PN}-bcm4359-pcie = "Firmware-cypress"
RDEPENDS:${PN}-bcm4359-pcie += "${PN}-cypress-license"

FILES:${PN}-bcm4359-pcie = " \
       ${nonarch_base_libdir}/firmware/brcm/brcmfmac4359-pcie.bin \
       ${nonarch_base_libdir}/firmware/brcm/brcmfmac4359-pcie.clm_blob \
       ${nonarch_base_libdir}/firmware/brcm/brcmfmac4359-pcie.txt \
       ${sysconfdir}/firmware/BCM4349B1_*.hcd \
"

FILES:${PN}-nxp89xx = " \
       ${nonarch_base_libdir}/firmware/nxp/* \
"
