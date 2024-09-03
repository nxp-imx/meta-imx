SUMMARY = "The firmware, library and converter for i.MX Neutron NPU"
DESCRIPTION = "The firmware library and converter for i.MX Neutron NPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ca53281cc0caa7e320d4945a896fb837"

SRC_URI = "${NEUTRON_SRC};branch=${SRCBRANCH}"
NEUTRON_SRC ?= "git://github.com/nxp-imx/neutron.git;protocol=https"
SRCBRANCH = "lf-6.6.36_2.1.0"
SRCREV = "8a6c7198afc15fde284180c5a8e4eeebb5b17577"

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

# The packaged binaries have been stripped of debug info, so disable
# operations accordingly.
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"

# Library file is unversioned
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

FILES:${PN} += "${nonarch_base_libdir}/firmware/*"
INSANE_SKIP:${PN} = "arch"

COMPATIBLE_MACHINE = "(mx95-nxp-bsp)"
