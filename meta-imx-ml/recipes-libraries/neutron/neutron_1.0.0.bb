SUMMARY = "The firmware, library and converter for i.MX Neutron NPU"
DESCRIPTION = "The firmware library and converter for i.MX Neutron NPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=44a8052c384584ba09077e85a3d1654f"

SRC_URI = "${NEUTRON_SRC};branch=${SRCBRANCH}"
NEUTRON_SRC ?= "git://github.com/nxp-imx/neutron.git;protocol=https"
SRCBRANCH = "main"
SRCREV = "2b12bade2e7a5a191fc2d481d41d79b11e6ec19f"

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
}

FILES:${PN} += "${nonarch_base_libdir}/firmware/*"
INSANE_SKIP:${PN} = "arch"

COMPATIBLE_MACHINE = "(mx95-nxp-bsp)"
