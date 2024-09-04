# Use the latest revision

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ca53281cc0caa7e320d4945a896fb837"

IMX_FIRMWARE_SRC ?= "git://github.com/nxp-imx/imx-firmware.git;protocol=https"
SRC_URI = "${IMX_FIRMWARE_SRC};branch=${SRCBRANCH}"
SRCBRANCH = "lf-6.6.36_2.1.0"
SRCREV = "1b26d19284d202b1531837ce37a05afc49ad1d98"

do_install() {
    install -d ${D}${nonarch_base_libdir}/firmware/nxp
    oe_runmake install INSTALLDIR=${D}${nonarch_base_libdir}/firmware/nxp
}

FILES:${PN}-nxp8997-common = " \
    ${nonarch_base_libdir}/firmware/nxp/ed_mac_ctrl_V3_8997.conf \
    ${nonarch_base_libdir}/firmware/nxp/txpwrlimit_cfg_8997.conf \
    ${nonarch_base_libdir}/firmware/nxp/uart8997_bt_v4.bin \
"

FILES:${PN}-nxp9098-common = " \
    ${nonarch_base_libdir}/firmware/nxp/ed_mac_ctrl_V3_909x.conf \
    ${nonarch_base_libdir}/firmware/nxp/txpwrlimit_cfg_9098.conf \
    ${nonarch_base_libdir}/firmware/nxp/uart9098_bt_v1.bin \
"

FILES:${PN}-nxpiw612-sdio += " \
    ${nonarch_base_libdir}/firmware/nxp/uartuart_n61x_v1.bin.se \
"

PACKAGES += "${PN}-all-sdio ${PN}-all-pcie"

RDEPENDS:${PN}-all-sdio = " \
    ${PN}-nxp8801-sdio \
    ${PN}-nxp8987-sdio \
    ${PN}-nxp8997-sdio \
    ${PN}-nxp9098-sdio \
    ${PN}-nxpiw416-sdio \
    ${PN}-nxpiw612-sdio \
"

RDEPENDS:${PN}-all-pcie = " \
    ${PN}-nxp8997-pcie \
    ${PN}-nxp9098-pcie \
"

ALLOW_EMPTY:${PN}-all-sdio = "1"
ALLOW_EMPTY:${PN}-all-pcie = "1"
