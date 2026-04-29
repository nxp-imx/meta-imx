# Use the latest revision

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=bc649096ad3928ec06a8713b8d787eac"

SRC_URI = "${IMX_FIRMWARE_SRC};branch=${SRCBRANCH}"
IMX_FIRMWARE_SRC ?= "git://github.com/nxp-imx/imx-firmware.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "48923b0f15f6ae04ed5d7df3862821379510756d"

do_install() {
    install -d ${D}${nonarch_base_libdir}/firmware/nxp
    oe_runmake install INSTALLDIR=${D}${nonarch_base_libdir}/firmware/nxp
}

#-----------------don't upstream, keep in imx ------------------------
PACKAGES:remove = " \
    ${PN}-nxp8997-sdio \
"
RDEPENDS:${PN}-all-sdio:remove = " \
    ${PN}-nxp8997-sdio \
"
