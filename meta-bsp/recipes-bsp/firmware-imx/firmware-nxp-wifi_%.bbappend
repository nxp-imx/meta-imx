# Use the latest revision

LIC_FILES_CHKSUM = "file://EULA.txt;md5=9135422c7a38dac21bf1f858b6ef3bac"

SRC_URI = "${IMX_FIRMWARE_SRC};branch=${SRCBRANCH}"
SRCBRANCH = "lf-6.1.36_2.1.0"
SRCREV = "ca6da25784b6222601efd71a1ee5e5f00e6e226d"

do_install() {
    install -d ${D}${nonarch_base_libdir}/firmware/nxp
    oe_runmake install INSTALLDIR=${D}${nonarch_base_libdir}/firmware/nxp
}

FILES:${PN}-nxp-common += " \
    ${nonarch_base_libdir}/firmware/nxp/helper_uart_3000000.bin \
"
