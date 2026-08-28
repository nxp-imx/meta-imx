# Use the latest revision

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ef4f968b9dae8ba406390cd617c2301d"

SRC_URI = "${IMX_FIRMWARE_SRC};branch=${SRCBRANCH}"
IMX_FIRMWARE_SRC ?= "git://github.com/nxp-imx/imx-firmware.git;protocol=https"
SRCBRANCH = "lf-6.18.37_2.1.0"
SRCREV = "07dd4579523496db967107397695958ff80b6c51"

do_install() {
    install -d ${D}${nonarch_base_libdir}/firmware/nxp
    oe_runmake install INSTALLDIR=${D}${nonarch_base_libdir}/firmware/nxp
}

PACKAGES =+ "\
    ${PN}-nxpaw693-sdio \
"
RDEPENDS:${PN}-all-sdio += "\
    ${PN}-nxpaw693-sdio \
"
FILES:${PN}-nxpaw693-sdio += "\
    ${nonarch_base_libdir}/firmware/nxp/sdiw693_wlan_v1.bin.se \
    ${nonarch_base_libdir}/firmware/nxp/sduartiw693_combo_v1.bin.se \
    ${nonarch_base_libdir}/firmware/nxp/uartiw693_bt_v1.bin.se \
"
RDEPENDS:${PN}-nxpaw693-sdio += "${PN}-nxp-common"

#-----------------don't upstream, keep in imx ------------------------
PACKAGES:remove = "\
    ${PN}-nxp8997-sdio \
"
RDEPENDS:${PN}-all-sdio:remove = "\
    ${PN}-nxp8997-sdio \
"
