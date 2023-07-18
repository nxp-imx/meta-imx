# Use the latest revision

LIC_FILES_CHKSUM = "file://EULA.txt;md5=673fa34349fa40f59e0713cb0ac22b1f"

SRC_URI = "${IMX_FIRMWARE_SRC};branch=${SRCBRANCH}"
SRCBRANCH = "master"
SRCREV = "9ba6bfbcda14be2c5841ecfba525d98c66698925"

do_install() {
    # Install various flavors of Broadcom firmware provided by Murata:
    # - bcm4359-pcie
    for f in cyw-wifi-bt/*_CYW*/brcmfmac4359-pcie*; do
        install -D -m 0644 $f ${D}${nonarch_base_libdir}/firmware/brcm/$(basename $f)
    done

    for f in cyw-wifi-bt/*_CYW*/BCM4349B1*.hcd; do
        install -D -m 0644 $f ${D}${sysconfdir}/firmware/$(basename $f)
    done

    # Install NXP Connectivity common
    install -D -m 0644 nxp/wifi_mod_para.conf ${D}${nonarch_base_libdir}/firmware/nxp/wifi_mod_para.conf

    # Install NXP Connectivity SD8801 firmware
    install -m 0644 nxp/FwImage_8801_SD/ed_mac_ctrl_V1_8801.conf  ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 nxp/FwImage_8801_SD/sd8801_uapsta.bin         ${D}${nonarch_base_libdir}/firmware/nxp

    # Install NXP Connectivity SDIO8987 firmware
    install -m 0644 nxp/FwImage_8987/ed_mac_ctrl_V3_8987.conf  ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 nxp/FwImage_8987/sdiouart8987_combo_v0.bin ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 nxp/FwImage_8987/txpwrlimit_cfg_8987.conf  ${D}${nonarch_base_libdir}/firmware/nxp

    # Install NXP Connectivity PCIE8997 firmware
    install -m 0644 nxp/FwImage_8997/ed_mac_ctrl_V3_8997.conf  ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 nxp/FwImage_8997/pcieuart8997_combo_v4.bin ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 nxp/FwImage_8997/txpwrlimit_cfg_8997.conf  ${D}${nonarch_base_libdir}/firmware/nxp

    # Install NXP Connectivity SDIO8997 firmware
    install -m 0644 nxp/FwImage_8997_SD/ed_mac_ctrl_V3_8997.conf  ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 nxp/FwImage_8997_SD/sdiouart8997_combo_v4.bin ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 nxp/FwImage_8997_SD/txpwrlimit_cfg_8997.conf  ${D}${nonarch_base_libdir}/firmware/nxp

    # Install NXP Connectivity PCIE9098 firmware
    install -m 0644 nxp/FwImage_9098_PCIE/ed_mac_ctrl_V3_909x.conf  ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 nxp/FwImage_9098_PCIE/pcieuart9098_combo_v1.bin ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 nxp/FwImage_9098_PCIE/txpwrlimit_cfg_9098.conf  ${D}${nonarch_base_libdir}/firmware/nxp

    # Install NXP Connectivity SDIO9098 firmware
    install -m 0644 nxp/FwImage_9098_SD/sdiouart9098_combo_v1.bin ${D}${nonarch_base_libdir}/firmware/nxp

    # Install NXP Connectivity IW416 firmware
    install -m 0644 nxp/FwImage_IW416_SD/sdioiw416_wlan_v0.bin      ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 nxp/FwImage_IW416_SD/sdiouartiw416_combo_v0.bin ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 nxp/FwImage_IW416_SD/uartiw416_bt_v0.bin        ${D}${nonarch_base_libdir}/firmware/nxp

    # Install NXP Connectivity IW612 firmware
    install -m 0644 nxp/FwImage_IW612_SD/sduart_nw61x_v1.bin.se ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 nxp/FwImage_IW612_SD/sd_w61x_v1.bin.se      ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 nxp/FwImage_IW612_SD/uartspi_n61x_v1.bin.se ${D}${nonarch_base_libdir}/firmware/nxp
}
