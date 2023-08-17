# Use the latest revision

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=db4762b09b6bda63da103963e6e081de"

SRC_URI = "${IMX_FIRMWARE_SRC};branch=${SRCBRANCH}"
SRCBRANCH = "lf-6.1.36_2.1.0"
SRCREV = "5bdcbdee93589ff49be62c9154ef289dd7037944"

do_install() {
    install -d ${D}${nonarch_base_libdir}/firmware/nxp
    oe_runmake install INSTALLDIR=${D}${nonarch_base_libdir}/firmware/nxp
}

FILES:${PN}-nxp-common += " \
    ${nonarch_base_libdir}/firmware/nxp/helper_uart_3000000.bin \
"
