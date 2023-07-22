# Use the latest revision

LIC_FILES_CHKSUM = "file://EULA.txt;md5=9135422c7a38dac21bf1f858b6ef3bac"

SRC_URI = "${IMX_FIRMWARE_SRC};branch=${SRCBRANCH}"
SRCBRANCH = "master"
SRCREV = "8e310c33cd7e258a239f0847dce2a8db4a8de27a"

do_install() {
    install -d ${D}${nonarch_base_libdir}/firmware/nxp
    oe_runmake install INSTALLDIR=${D}${nonarch_base_libdir}/firmware/nxp
}

FILES:${PN}-nxp-common += " \
    ${nonarch_base_libdir}/firmware/nxp/helper_uart_3000000.bin \
"
