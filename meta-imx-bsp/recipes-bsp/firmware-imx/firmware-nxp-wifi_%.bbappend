# Use the latest revision

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=bc649096ad3928ec06a8713b8d787eac"

IMX_FIRMWARE_SRC ?= "git://github.com/nxp-imx/imx-firmware.git;protocol=https"
SRC_URI = "${IMX_FIRMWARE_SRC};branch=${SRCBRANCH}"
SRCBRANCH = "master"
SRCREV = "f5002c76000214ab1b83347460bfd728d4518338"

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

ALLOW_EMPTY:${PN}-all-usb = "1"
