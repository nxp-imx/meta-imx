SUMMARY = "Lightweight crypto and SSL/TLS library"
DESCRIPTION = "Custom mbedtls static library build enabling PSA Cryptographic"

HOMEPAGE = "https://tls.mbed.org/"

LICENSE = "Apache-2.0 | GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=379d5819937a6c2f1ef1630d341e026d"

SECTION = "libs"

DEPENDS = "python3-jsonschema-native python3-jinja2-native"

S = "${WORKDIR}/git"
SRCREV = "2ca6c285a0dd3f33982dd57299012dacab1ff206"
SRC_URI = "gitsm://github.com/Mbed-TLS/mbedtls;protocol=https;branch=development \
           file://0001-crypto_struct-change-psa_key_attributes_t-layout.patch \
           file://0002-library-tls-disable-PSA-APIs-for-most-operations.patch"

inherit cmake

PACKAGECONFIG = "psa"
PACKAGECONFIG[shared-libs] = "-DUSE_SHARED_MBEDTLS_LIBRARY=ON,-DUSE_SHARED_MBEDTLS_LIBRARY=OFF"
PACKAGECONFIG[programs] = "-DENABLE_PROGRAMS=ON,-DENABLE_PROGRAMS=OFF"
PACKAGECONFIG[werror] = "-DMBEDTLS_FATAL_WARNINGS=ON,-DMBEDTLS_FATAL_WARNINGS=OFF"
# Make X.509 and TLS calls use PSA
# https://github.com/Mbed-TLS/mbedtls/blob/development/docs/use-psa-crypto.md
PACKAGECONFIG[psa] = ""
PACKAGECONFIG[tests] = "-DENABLE_TESTING=ON,-DENABLE_TESTING=OFF"

# For now the only way to enable PSA is to explicitly pass a -D via CFLAGS
CFLAGS:append = "${@bb.utils.contains('PACKAGECONFIG', 'psa', ' -DMBEDTLS_USE_PSA_CRYPTO', '', d)}"

CVE_PRODUCT = "mbed_tls"

EXTRA_OECMAKE:append = " \
	-DCMAKE_INSTALL_PREFIX=/usr/local/el2go \
"

SYSROOT_DIRS:append = "/usr/local/el2go"

FILES:${PN}-staticdev += "\
	/usr/local/el2go \
"
