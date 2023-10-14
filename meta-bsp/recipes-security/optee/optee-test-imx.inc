require recipes-security/optee/optee-test.inc

DEPENDS += "openssl"

FILESEXTRAPATHS:prepend := "${THISDIR}/optee-test:"

SRC_URI:remove = "git://github.com/OP-TEE/optee_test.git;branch=master;protocol=https"
SRC_URI:prepend = "${OPTEE_TEST_SRC};branch=${SRCBRANCH} "

OPTEE_TEST_SRC ?= "git://github.com/nxp-imx/imx-optee-test.git;protocol=https"

EXTRA_OEMAKE:append:libc-musl = " OPTEE_OPENSSL_EXPORT=${STAGING_INCDIR}"
CFLAGS:append:libc-musl = " -Wno-error=deprecated-declarations"

COMPATIBLE_MACHINE = "(imx-nxp-bsp)"
