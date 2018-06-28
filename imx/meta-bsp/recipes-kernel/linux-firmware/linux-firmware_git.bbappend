# Copyright 2017-2018 NXP

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " \
            file://firmware.conf \
            git://github.com/murata-wireless/qca-linux-calibration.git;protocol=https;name=murata;destsuffix=murata \
            git://github.com/murata-wireless/cyw-fmac-fw;protocol=git;branch=battra;destsuffix=cyw-fmac-fw;name=cyw-fmac-fw \
            git://github.com/murata-wireless/cyw-fmac-nvram;protocol=git;branch=battra;destsuffix=cyw-fmac-nvram;name=cyw-fmac-nvram \
            git://github.com/murata-wireless/cyw-bt-patch;protocol=git;branch=morty-battra;destsuffix=cyw-bt-patch;name=cyw-bt-patch \
"
SRCREV_murata = "a0026b646ce6adfb72f135ffa8a310f3614b2272"
SRCREV_cyw-fmac-fw = "7464b01bc1681330d2a0f7e20597e9579e537dc5"
SRCREV_cyw-fmac-nvram = "ae2c8b2bd93f9a51cca984dbc7dd0659b0babe92"
SRCREV_cyw-bt-patch = "e66601d560d2e289de18e26f14bbb639c7a239a6"
SRCREV_FORMAT = "default_murata+cyw-fmac-fw+cyw-fmac-nvram+cyw-bt-patch"

do_install_append () {
    # Install firmware.conf for QCA modules
    install -d ${D}${sysconfdir}/bluetooth
    cp ${WORKDIR}/firmware.conf ${D}${sysconfdir}/bluetooth

    # Use Murata's QCA calibration files
    install -m 0644 ${WORKDIR}/murata/1CQ/board.bin ${D}${nonarch_base_libdir}/firmware/ath10k/QCA6174/hw3.0/

    # No need to do install for imx sdma binaries
    if [ -d ${D}${base_libdir}/firmware/imx/sdma ]; then
        rm -rf ${D}${base_libdir}/firmware/imx/sdma
    fi

    # Install Murata BCM4339 firmware
    cp ${WORKDIR}/cyw-fmac-fw/brcmfmac4339-sdio.bin ${D}${nonarch_base_libdir}/firmware/brcm/brcmfmac4339-sdio.bin
    cp ${WORKDIR}/cyw-fmac-nvram/brcmfmac4339-sdio*.txt ${D}${nonarch_base_libdir}/firmware/brcm
    install -d ${D}${sysconfdir}/firmware
    cp ${WORKDIR}/cyw-bt-patch/CYW4335C0.ZP.hcd ${D}${sysconfdir}/firmware
}

# Use the latest version of sdma firmware in firmware-imx
PACKAGES_remove = "${PN}-imx-sdma-license ${PN}-imx-sdma-imx6q ${PN}-imx-sdma-imx7d"

FILES_${PN}-qca += " \
  ${sysconfdir}/bluetooth/firmware.conf \
"

FILES_${PN}-bcm4339 += " \
       ${nonarch_base_libdir}/firmware/brcm/brcmfmac4339-sdio.txt \
       ${sysconfdir}/firmware/CYW4335C0.ZP.hcd \
"
