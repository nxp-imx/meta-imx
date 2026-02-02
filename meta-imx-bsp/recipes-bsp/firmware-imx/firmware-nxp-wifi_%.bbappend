# Use the latest revision

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=bc649096ad3928ec06a8713b8d787eac"

IMX_FIRMWARE_SRC ?= "git://github.com/nxp-imx/imx-firmware.git;protocol=https"
SRC_URI = "${IMX_FIRMWARE_SRC};branch=${SRCBRANCH}"
SRCBRANCH = "lf-6.18.2_1.0.0"
SRCREV = "d7e4bb37b45bbf93faf888e0ca6763a29e28054a"

do_install() {
    install -d ${D}${nonarch_base_libdir}/firmware/nxp
    oe_runmake install INSTALLDIR=${D}${nonarch_base_libdir}/firmware/nxp
}

PACKAGES += "${PN}-all-sdio ${PN}-all-pcie ${PN}-all-usb"
PACKAGES:remove = "${PN}-nxp8801-sdio"

RDEPENDS:${PN}-all-sdio:remove = "${PN}-nxp8801-sdio"

PACKAGES:remove = " \
    ${PN}-nxp8997-common \
    ${PN}-nxp8997-pcie \
    ${PN}-nxp8997-sdio \
"
RDEPENDS:${PN}-all-pcie:remove = "${PN}-nxp8997-pcie"

FILES:${PN}-nxpiw612-sdio = " \
    ${nonarch_base_libdir}/firmware/nxp/sd_w61x_v1.bin.se \
    ${nonarch_base_libdir}/firmware/nxp/sduart_nw61x_*.bin.se \
    ${nonarch_base_libdir}/firmware/nxp/uartspi_n61x_*.bin.se \
    ${nonarch_base_libdir}/firmware/nxp/uartuart_n61x_*.bin.se \
    ${nonarch_base_libdir}/firmware/nxp/IW612_SD_RFTest/ \
"

ALLOW_EMPTY:${PN}-all-usb = "1"
