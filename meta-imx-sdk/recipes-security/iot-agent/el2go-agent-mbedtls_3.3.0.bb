SUMMARY = "Lightweight crypto and SSL/TLS library"
DESCRIPTION = "Custom mbedtls static library build enabling PSA Cryptographic"

HOMEPAGE = "https://tls.mbed.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SECTION = "libs"

DEPENDS = "python3-jsonschema-native python3-jinja2-native"

S = "${WORKDIR}/git"
SRCREV = "01f6e617816b9b73381244013a4e1112406f8853"
SRC_URI = "git://github.com/ARMmbed/mbedtls.git;protocol=https;branch=development \
           file://run-ptest \
          "

inherit cmake update-alternatives ptest python3native

SRC_URI:append = "file://0001-crypto_struct-change-psa_key_attributes_t-layout.patch \
                  file://0002-library-tls-disable-PSA-APIs-for-most-operations.patch"

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

PROVIDES += "polarssl"
RPROVIDES:${PN} = "polarssl"

PACKAGES =+ "${PN}-programs"
FILES:${PN}-programs = "${bindir}/"

ALTERNATIVE:${PN}-programs = "hello"
ALTERNATIVE_LINK_NAME[hello] = "${bindir}/hello"

CVE_PRODUCT = "mbed_tls"

do_install_ptest () {
	if ${@bb.utils.contains('PACKAGECONFIG', 'tests', 'true', 'false', d)}; then
		install -d ${D}${PTEST_PATH}/tests
		cp -f ${B}/tests/test_suite_* ${D}${PTEST_PATH}/tests/
		find ${D}${PTEST_PATH}/tests/ -type f -name "*.c" -delete
		cp -fR ${S}/tests/data_files ${D}${PTEST_PATH}/tests/
	fi
}

