# Copyright 2017-2019 NXP

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

# Firmware for Murata QCA Modules
SRC_URI += " \
            file://firmware.conf \
            git://github.com/murata-wireless/qca-linux-calibration.git;protocol=https;name=murata-qca;destsuffix=murata-qca \
"
SRCREV_murata-qca = "a0026b646ce6adfb72f135ffa8a310f3614b2272"

# Firmware for Murata CYW4339 Module
SRC_URI += " \
            git://github.com/murata-wireless/cyw-fmac-fw;protocol=git;branch=battra;destsuffix=cyw-fmac-fw;name=cyw-fmac-fw \
            git://github.com/murata-wireless/cyw-fmac-nvram;protocol=git;branch=battra;destsuffix=cyw-fmac-nvram;name=cyw-fmac-nvram \
            git://github.com/murata-wireless/cyw-bt-patch;protocol=git;branch=morty-battra;destsuffix=cyw-bt-patch;name=cyw-bt-patch \
"
SRCREV_cyw-fmac-fw = "7464b01bc1681330d2a0f7e20597e9579e537dc5"
SRCREV_cyw-fmac-nvram = "ae2c8b2bd93f9a51cca984dbc7dd0659b0babe92"
SRCREV_cyw-bt-patch = "e66601d560d2e289de18e26f14bbb639c7a239a6"

# Firmware for Murata CYW43455 and CYW4356 Modules
SRC_URI += " \
            git://github.com/murata-wireless/cyw-fmac-fw;protocol=git;branch=manda;destsuffix=cyw-fmac-fw-manda;name=cyw-fmac-fw-manda \
            git://github.com/murata-wireless/cyw-fmac-nvram;protocol=git;branch=manda;destsuffix=cyw-fmac-nvram-manda;name=cyw-fmac-nvram-manda \
            git://github.com/murata-wireless/cyw-bt-patch;protocol=git;branch=morty-manda;destsuffix=cyw-bt-patch-manda;name=cyw-bt-patch-manda \
"
SRCREV_cyw-fmac-fw-manda = "9a813ba411870cffd4ec20d30623035773564da9"
SRCREV_cyw-fmac-nvram-manda = "d27f1bf105fa1e5b828e355793b88d4b66188411"
SRCREV_cyw-bt-patch-manda = "748462f0b02ec4aeb500bedd60780ac51c37be31"

# Firmware for Murata CYW43430 Module
SRC_URI += " \
            git://github.com/murata-wireless/cyw-fmac-fw;protocol=git;branch=mothra;destsuffix=cyw-fmac-fw-mothra;name=cyw-fmac-fw-mothra \
            git://github.com/murata-wireless/cyw-fmac-nvram;protocol=git;branch=mothra;destsuffix=cyw-fmac-nvram-mothra;name=cyw-fmac-nvram-mothra \
            git://github.com/murata-wireless/cyw-bt-patch;protocol=git;branch=morty-mothra;destsuffix=cyw-bt-patch-mothra;name=cyw-bt-patch-mothra \
"
SRCREV_cyw-fmac-fw-mothra = "400d2128fbb3986cb36f20e6d479c1f13dd512f8"
SRCREV_cyw-fmac-nvram-mothra = "5c31182a8b779ae88b589ddb15dd69d43dec29b3"
SRCREV_cyw-bt-patch-mothra = "e6a115528b543be7744148ebd390f6eb46b7d3e1"

# Firmware for Murata CYW4359 Module
IMX_FIRMWARE_SRC ?= "git://github.com/NXP/imx-firmware.git;protocol=https"
SRC_URI += " \
           ${IMX_FIRMWARE_SRC};branch=master;destsuffix=imx-firmware;name=imx-firmware \
"
SRCREV_imx-firmware = "dc95bcf35709e8730af29dc2284e62dc0391fd99"

SRCREV_FORMAT = "default_murata-qca+cyw-fmac-fw+cyw-fmac-nvram+cyw-bt-patch"

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

    # Install Murata BCM4339 firmware
    install -m 0644 ${WORKDIR}/cyw-fmac-fw/brcmfmac4339-sdio.bin ${D}${nonarch_base_libdir}/firmware/brcm/brcmfmac4339-sdio.bin
    install -m 0644 ${WORKDIR}/cyw-fmac-nvram/brcmfmac4339-sdio*.txt ${D}${nonarch_base_libdir}/firmware/brcm
    install -d ${D}${sysconfdir}/firmware
    install -m 0644 ${WORKDIR}/cyw-bt-patch/CYW4335C0.ZP.hcd ${D}${sysconfdir}/firmware

    # Install Murata BCM43430 firmware
    install -m 0644 ${WORKDIR}/cyw-fmac-fw-mothra/brcmfmac43430-sdio.bin ${D}${nonarch_base_libdir}/firmware/brcm/brcmfmac43430-sdio.bin
    install -m 0644 ${WORKDIR}/cyw-fmac-fw-mothra/brcmfmac43430-sdio.1DX.clm_blob ${D}${nonarch_base_libdir}/firmware/brcm/brcmfmac43430-sdio.clm_blob
    install -m 0644 ${WORKDIR}/cyw-fmac-nvram-mothra/brcmfmac43430-sdio.1DX.txt ${D}${nonarch_base_libdir}/firmware/brcm/brcmfmac43430-sdio.txt
    install -m 0644 ${WORKDIR}/cyw-bt-patch-mothra/CYW43430A1.1DX.hcd ${D}${sysconfdir}/firmware/BCM43430A1.1DX.hcd

    # Install Murata BCM43455 firmware
    install -m 0644 ${WORKDIR}/cyw-fmac-fw-manda/brcmfmac43455-sdio.bin ${D}${nonarch_base_libdir}/firmware/brcm/brcmfmac43455-sdio.bin
    install -m 0644 ${WORKDIR}/cyw-fmac-fw-manda/brcmfmac43455-sdio.1MW.clm_blob ${D}${nonarch_base_libdir}/firmware/brcm/brcmfmac43455-sdio.clm_blob
    install -m 0644 ${WORKDIR}/cyw-fmac-nvram-manda/brcmfmac43455-sdio.1MW.txt ${D}${nonarch_base_libdir}/firmware/brcm/brcmfmac43455-sdio.txt
    install -m 0644 ${WORKDIR}/cyw-bt-patch-manda/CYW4345C0.1MW.hcd ${D}${sysconfdir}/firmware/BCM4345C0.1MW.hcd

    # Install Murata BCM4356 firmware
    install -m 0644 ${WORKDIR}/cyw-fmac-fw-manda/brcmfmac4356-pcie.bin ${D}${nonarch_base_libdir}/firmware/brcm/brcmfmac4356-pcie.bin
    install -m 0644 ${WORKDIR}/cyw-fmac-fw-manda/brcmfmac4356-pcie.1CX.clm_blob ${D}${nonarch_base_libdir}/firmware/brcm/brcmfmac4356-pcie.clm_blob
    install -m 0644 ${WORKDIR}/cyw-fmac-nvram-manda/brcmfmac4356-pcie.1CX.txt ${D}${nonarch_base_libdir}/firmware/brcm/brcmfmac4356-pcie.txt
    install -m 0644 ${WORKDIR}/cyw-bt-patch-manda/CYW4354A2.1CX.hcd ${D}${sysconfdir}/firmware/BCM4354A2.1CX.hcd

    # Install Murata BCM4359 firmware
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
       ${sysconfdir}/firmware/CYW4335C0.ZP.hcd \
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
