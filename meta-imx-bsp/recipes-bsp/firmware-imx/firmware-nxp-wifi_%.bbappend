# Use the latest revision

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c0fb372b5d7f12181de23ef480f225f3"

IMX_FIRMWARE_SRC ?= "git://github.com/nxp-imx/imx-firmware.git;protocol=https"
SRC_URI = "${IMX_FIRMWARE_SRC};branch=${SRCBRANCH}"
SRCBRANCH = "master"
SRCREV = "eef7ef94bc44cacd3b068f66658ef33391547daa"

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

PACKAGES += "${PN}-all-sdio ${PN}-all-pcie"

RDEPENDS:${PN}-all-sdio = " \
    ${PN}-nxp8801-sdio \
    ${PN}-nxp8987-sdio \
    ${PN}-nxp8997-sdio \
    ${PN}-nxp9098-sdio \
    ${PN}-nxpiw416-sdio \
    ${PN}-nxpiw610-sdio \
    ${PN}-nxpiw612-sdio \
"

RDEPENDS:${PN}-all-pcie = " \
    ${PN}-nxp8997-pcie \
    ${PN}-nxp9098-pcie \
"

ALLOW_EMPTY:${PN}-all-sdio = "1"
ALLOW_EMPTY:${PN}-all-pcie = "1"
