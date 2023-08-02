# Use the latest revision

LIC_FILES_CHKSUM = "file://EULA.txt;md5=db4762b09b6bda63da103963e6e081de"

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
