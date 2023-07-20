# Use the latest revision

LIC_FILES_CHKSUM = "file://EULA.txt;md5=673fa34349fa40f59e0713cb0ac22b1f"

SRC_URI = "${IMX_FIRMWARE_SRC};branch=${SRCBRANCH}"
SRCBRANCH = "master"
SRCREV = "8e310c33cd7e258a239f0847dce2a8db4a8de27a"

do_install() {
    install -d ${D}${nonarch_base_libdir}/firmware/nxp
    oe_runmake install INSTALLDIR=${D}${nonarch_base_libdir}/firmware/nxp
}


PACKAGES =+ " ${PN}-nxp9098-common"

FILES:${PN}-nxp-common += " \
    ${nonarch_base_libdir}/firmware/nxp/helper_uart_3000000.bin \
"

FILES:${PN}-nxp8997-common += " \
    ${nonarch_base_libdir}/firmware/nxp/uartuart8997_bt_v4.bin \
"

FILES:${PN}-nxp8997-pcie += " \
    ${nonarch_base_libdir}/firmware/nxp/pcie8997_wlan_v4.bin* \
"

FILES:${PN}-nxp8997-sdio += " \
    ${nonarch_base_libdir}/firmware/nxp/sdio8997_wlan_v4.bin \
"

FILES:${PN}-nxp9098-common += " \
    ${nonarch_base_libdir}/firmware/nxp/ed_mac_ctrl_V3_909x.conf \
    ${nonarch_base_libdir}/firmware/nxp/txpwrlimit_cfg_9098.conf \
    ${nonarch_base_libdir}/firmware/nxp/uartuart9098_bt_v1.bin \
"

FILES:${PN}-nxp9098-pcie = " \
    ${nonarch_base_libdir}/firmware/nxp/pcie9098_wlan_v1.bin \
    ${nonarch_base_libdir}/firmware/nxp/pcieuart9098* \
"
RDEPENDS:${PN}-nxp9098-pcie += "${PN}-nxp9098-common"

FILES:${PN}-nxp9098-sdio += " \
    ${nonarch_base_libdir}/firmware/nxp/sdio9098_wlan_v1.bin \
"
RDEPENDS:${PN}-nxp9098-sdio += "${PN}-nxp9098-common"
