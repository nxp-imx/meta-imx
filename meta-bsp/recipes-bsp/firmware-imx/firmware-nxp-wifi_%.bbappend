# Use the latest revision

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2827219e81f28aba7c6a569f7c437fa7"

SRC_URI = "${IMX_FIRMWARE_SRC};branch=${SRCBRANCH}"
SRCBRANCH = "lf-6.1.55_2.2.0"
SRCREV = "6b31ace1cb217a965e4e4cb4a61ca0455412b81f" 

do_install() {
    install -d ${D}${nonarch_base_libdir}/firmware/nxp
    oe_runmake install INSTALLDIR=${D}${nonarch_base_libdir}/firmware/nxp
}

FILES:${PN}-nxp-common += " \
    ${nonarch_base_libdir}/firmware/nxp/helper_uart_3000000.bin \
"
