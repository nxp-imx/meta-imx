# Use the latest revision

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=bc649096ad3928ec06a8713b8d787eac"

IMX_FIRMWARE_SRC ?= "git://github.com/nxp-imx/imx-firmware.git;protocol=https"
SRC_URI = "${IMX_FIRMWARE_SRC};branch=${SRCBRANCH}"
SRCBRANCH = "master"
SRCREV = "a631e4841b078a7428ef057dd52480dcad619858"

do_install() {
    install -d ${D}${nonarch_base_libdir}/firmware/nxp
    oe_runmake install INSTALLDIR=${D}${nonarch_base_libdir}/firmware/nxp
}

FILES:${PN}-nxp8997-sdio = " \
    ${nonarch_base_libdir}/firmware/nxp/sd*8997* \
"
FILES:${PN}-nxp9098-sdio = " \
    ${nonarch_base_libdir}/firmware/nxp/sd*9098* \
"

FILES:${PN}-nxpiw610-sdio += " \
    ${nonarch_base_libdir}/firmware/nxp/sduartspi_iw610.bin.se \
"

FILES:${PN}-nxpiw610-usb += " \
    ${nonarch_base_libdir}/firmware/nxp/usb*_iw610.bin.se \
"

FILES:${PN}-nxpaw693-pcie += " \
    ${nonarch_base_libdir}/firmware/nxp/pcie*aw693* \
    ${nonarch_base_libdir}/firmware/nxp/uart*aw693* \
"

PACKAGES += "${PN}-all-sdio ${PN}-all-pcie ${PN}-all-usb ${PN}-nxpiw610-usb ${PN}-nxpaw693-pcie"
PACKAGES:remove = "${PN}-nxp8801-sdio"

RDEPENDS:${PN}-all-sdio = " \
    ${PN}-nxp8987-sdio \
    ${PN}-nxp8997-sdio \
    ${PN}-nxp9098-sdio \
    ${PN}-nxpiw416-sdio \
    ${PN}-nxpiw610-sdio \
    ${PN}-nxpiw612-sdio \
"
RDEPENDS:${PN}-all-usb = " \
    ${PN}-nxpiw610-usb \
"

RDEPENDS:${PN}-all-pcie = " \
    ${PN}-nxp8997-pcie \
    ${PN}-nxp9098-pcie \
    ${PN}-nxpaw693-pcie \
"

ALLOW_EMPTY:${PN}-all-sdio = "1"
ALLOW_EMPTY:${PN}-all-pcie = "1"
ALLOW_EMPTY:${PN}-all-usb = "1"
