SUMMARY = "A generic signing tool framework"
DESCRIPTION = "\
This project targets to provide a generic signing framework. This framework \
separates the signing request and signing process and correspondingly forms \
the so-called signlet and signaturelet. \
Each signaturelet only concerns about the details about how to construct the \
layout of a signature format, and signlet only cares how to construct the \
signing request. \
"
HOMEPAGE = "https://github.com/jiazhang0/libsign"
SECTION = "devel"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=d9bf404642f21afb4ad89f95d7bc91ee"

DEPENDS += "openssl"

PV = "0.3.2+git"

SRC_URI = "\
    git://github.com/jiazhang0/libsign.git;branch=master;protocol=https \
    file://0001-selsign.c-remove-build-time-from-show_banner.patch \
    file://0001-env.mk-fix-LDFLAGS-expansion.patch \
"
SRCREV = "eb3a5927dd18e166014cf1e2eb6e9e461cf973fb"

S = "${UNPACKDIR}/git"

PARALLEL_MAKE = ""


EXTRA_OEMAKE = "\
    CC="${CC}" \
    CCLD="${CCLD}" \
    bindir="${STAGING_BINDIR}" \
    libdir="${STAGING_LIBDIR}" \
    includedir="${STAGING_INCDIR}" \
    EXTRA_CFLAGS="${CFLAGS}" \
    EXTRA_LDFLAGS="${LDFLAGS}" \
    SIGNATURELET_DIR="${libdir}/signaturelet" \
    BINDIR="${bindir}" \
    LIBDIR="${libdir}" \
"
SECURITY_LDFLAGS:remove:pn-${BPN} = "-fstack-protector-strong"

do_install() {
    oe_runmake install DESTDIR="${D}"
}

FILES:${PN} += "\
    ${libdir}/signaturelet \
"

RDEPENDS:${PN}:class-target += "libcrypto"
RDEPENDS:${PN}:class-native += "openssl-native"

BBCLASSEXTEND = "native nativesdk"
