# Use the latest revision

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=db4762b09b6bda63da103963e6e081de"

SRC_URI = "${IMX_FIRMWARE_SRC};branch=${SRCBRANCH}"
SRCBRANCH = "master"
SRCREV = "1fb80d0266e8044fb7eea695c7678cddcbbc77c5"

do_install() {
    install -d ${D}${nonarch_base_libdir}/firmware/nxp
    oe_runmake install INSTALLDIR=${D}${nonarch_base_libdir}/firmware/nxp
}

FILES:${PN}-nxp-common += " \
    ${nonarch_base_libdir}/firmware/nxp/helper_uart_3000000.bin \
"
