SUMMARY = "An OpenSSL provider that allows direct interfacing with pkcs11 drivers"
DESCRIPTION = "\
This is an Openssl 3.x provider to access Hardware or Software Tokens using \
the PKCS#11 Cryptographic Token Interface\
\
This code targets version 3.2 of the interface but should be backwards \
compatible to previous versions as well.\
"
HOMEPAGE = "https://github.com/openssl-projects/pkcs11-provider"
SECTION = "libs"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=b53b787444a60266932bd270d1cf2d45"
DEPENDS = "\
    openssl \
    p11-kit \
"

SRC_URI = "${PKCS11_PROVIDER_SRC};branch=${SRCBRANCH}"
PKCS11_PROVIDER_SRC ?= "git://github.com/nxp-imx/${BPN}.git;branch=main;protocol=https"
SRCBRANCH = "lf_1.0.y"
SRCREV = "4c572524d24d1cd08977d73806861068d0bbd65e"

inherit meson pkgconfig

# Overwrite default pkcs11 module path
#EXTRA_OEMESON += "-Ddefault_pkcs11_module=/path/to/mymodule.so"

FILES:${PN} += "${libdir}/ossl-modules/pkcs11.so"
