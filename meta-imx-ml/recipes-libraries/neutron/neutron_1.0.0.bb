SUMMARY = "The firmware, library and converter for i.MX Neutron NPU"
DESCRIPTION = "The firmware library and converter for i.MX Neutron NPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3d7aaf8cc156393cada035b7ff497237"

SRC_URI = "${NEUTRON_SRC};branch=${SRCBRANCH}"
NEUTRON_SRC ?= "git://github.com/nxp-imx/neutron.git;protocol=https"
SRCBRANCH = "lf-6.6.3_1.0.0"
SRCREV = "e2a6860b7b9f7fdd0e4bf30306b4106d655afbff"

S = "${WORKDIR}/git"

NEUTRON_TARGET = ""
NEUTRON_TARGET:mx95-nxp-bsp= "imx95"

do_install () {
    # install firmware
    install -d ${D}${nonarch_base_libdir}/firmware
    install -m 0644 ${S}/${NEUTRON_TARGET}/firmware/* ${D}${nonarch_base_libdir}/firmware/

    # install header files
    install -d ${D}${includedir}/neutron
    cp ${S}/${NEUTRON_TARGET}/include/* ${D}${includedir}/neutron

    # install libraries
    install -d ${D}${libdir}
    cp --no-preserve=ownership -d ${S}/${NEUTRON_TARGET}/library/* ${D}${libdir}

    # install neutron converter
    install -d ${D}${bindir}/
    install -m 0555 ${S}/converter/neutron-converter ${D}${bindir}
}

FILES:${PN} += "${nonarch_base_libdir}/firmware/*"
INSANE_SKIP:${PN} = "arch"

COMPATIBLE_MACHINE = "(mx95-nxp-bsp)"
