SUMMARY = "Plug & Trust ECC example for SE050"
DESCRIPTION = "\
This example demonstrates Elliptic Curve Cryptography sign and verify \
operation using NXP Plug & Trust middleware for EdgeLock SE050 secure \
element family."

SECTION = "apps"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=25d592776b78ef09663409514483b8c9"
DEPENDS = ""

SRC_URI = "git://github.com/NXP/plug-and-trust.git;protocol=https;branch=master"
SRCREV = "f124d81642fa2b65cbbb484b7e49b0b8ea97cdce"

S = "${WORKDIR}/git"

PV = "4.7.1+git${SRCPV}"

inherit cmake

OECMAKE_SOURCEPATH = "${S}/ecc_example"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/ex_ecc ${D}${bindir}
}
