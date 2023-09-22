SUMMARY = "Plug & Trust ECC example for SE050"
DESCRIPTION = "\
This example demonstrates Elliptic Curve Cryptography sign and verify \
operation using NXP Plug & Trust middleware for EdgeLock SE050 secure \
element family."
SECTION = "apps"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://Apache_2_0.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"
DEPENDS = ""

SRC_URI = "git://github.com/NXP/plug-and-trust.git;protocol=https;branch=master"
SRCREV = "5aae9189b07286f80847d1280de3be8462e5f001"

S = "${WORKDIR}/git"

inherit cmake

OECMAKE_SOURCEPATH = "${S}/ecc_example"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/ex_ecc ${D}${bindir}
}
