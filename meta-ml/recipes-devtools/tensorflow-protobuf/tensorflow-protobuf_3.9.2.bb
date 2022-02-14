# Copyright 2021 NXP
SUMMARY = "Protocol Buffers - structured data serialisation mechanism"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an \
efficient yet extensible format. Google uses Protocol Buffers for almost \
all of its internal RPC protocols and file formats."
HOMEPAGE = "https://github.com/google/protobuf"
SECTION = "console/tools"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37b5762e07f0af8c74ce80a8bda4266b"

DEPENDS = "zlib"
DEPENDS:append:class-target = " tensorflow-protobuf-native"

SRCREV = "52b2447247f535663ac1c292e088b4b27d2910ef"

SRC_URI = "git://github.com/google/protobuf.git;protocol=https;branch=3.9.x \
           file://run-ptest \
           file://0001-protobuf-fix-configure-error.patch \
           file://0001-Makefile.am-include-descriptor.cc-when-building-libp.patch \
           file://0001-examples-Makefile-respect-CXX-LDFLAGS-variables-fix-.patch \
"
S = "${WORKDIR}/git"

inherit autotools-brokensep pkgconfig 

EXTRA_OECONF += "--with-protoc=echo --includedir=${includedir}/tensorflow-protobuf "

do_install:append() {
    # Remove the symlinks for the shared libraries to avoid conflict with other protobuf versions
    rm ${D}${libdir}/*.so
    rm -r ${D}${libdir}/pkgconfig
}

PACKAGE_BEFORE_PN = "${PN}-compiler ${PN}-lite"
FILES:${PN}-compiler = "${bindir} ${libdir}/libprotoc${SOLIBS}"
FILES:${PN}-lite = "${libdir}/libprotobuf-lite${SOLIBS}"

RDEPENDS:${PN}-compiler = "${PN}"
RDEPENDS:${PN}-dev += "${PN}-compiler"

MIPS_INSTRUCTION_SET = "mips"

BBCLASSEXTEND = "native nativesdk"

LDFLAGS:append:arm = " -latomic"
LDFLAGS:append:mips = " -latomic"
LDFLAGS:append:powerpc = " -latomic"
LDFLAGS:append:mipsel = " -latomic"

INSANE_SKIP:${PN} = "dev-so"
