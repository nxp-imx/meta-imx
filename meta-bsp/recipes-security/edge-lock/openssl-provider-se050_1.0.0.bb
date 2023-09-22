SUMMARY = "OpenSSL Provider for SE050"
DESCRIPTION="An OpenSSL provider for NXP EdgeLock SE050 secure element product family."
SECTION = "libs"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"
DEPENDS = "openssl"

SRC_URI = "gitsm://github.com/NXPPlugNTrust/se05x-openssl-provider.git;protocol=https;branch=main"
SRCREV = "58e7caedaf8365b65c48f8aa37fa587a627245cb"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = "-DPTMW_HostCrypto=OPENSSL"

SOLIBS = ".so"
FILES_SOLIBSDEV = ""
