require recipes-security/optee/optee-test.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/optee-test:"

SRC_URI:remove = "git://github.com/OP-TEE/optee_test.git;branch=master;protocol=https"
SRC_URI:prepend = "${OPTEE_TEST_SRC};branch=${SRCBRANCH} "
SRC_URI:append = "file://musl-workaround.patch"

OPTEE_TEST_SRC ?= "git://github.com/nxp-imx/imx-optee-test.git;protocol=https"

EXTRA_OEMAKE:append = " CFG_TEE_PLUGIN_LOAD_PATH=${libdir}/tee-supplicant/plugins/"

EXTRA_OEMAKE:append:libc-musl = " OPTEE_OPENSSL_EXPORT=${STAGING_INCDIR}"
DEPENDS:append:libc-musl = " openssl"
CFLAGS:append:libc-musl = " -Wno-error=deprecated-declarations"

COMPATIBLE_MACHINE = "(imx-nxp-bsp)"
