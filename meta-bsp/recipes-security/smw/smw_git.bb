# Copyright 2020-22 NXP

SUMMARY = "NXP i.MX Security Middleware Library"
DESCRIPTION = "NXP i.MX Security Middleware Library"
SECTION = "base"
LICENSE = "BSD-3-Clause"
LICENSE = "Apache-2.0 & BSD-3-Clause & Zlib"
LIC_FILES_CHKSUM = "file://COPYING;md5=8636bd68fc00cc6a3809b7b58b45f982 \
                    file://../psa-arch-tests/LICENSE.md;md5=2a944942e1496af1886903d274dedb13"

DEPENDS = "json-c optee-os optee-client python3-cryptography-native"
DEPENDS:append:mx8qxp-nxp-bsp = " imx-seco-libs"
DEPENDS:append:mx8dx-nxp-bsp  = " imx-seco-libs"
DEPENDS:append:mx8ulp-nxp-bsp  = " imx-secure-enclave"

SRC_URI = "${SMW_LIB_SRC};branch=${SRCBRANCH_smw};name=smw;destsuffix=git/smw \
           ${PSA_LIB_SRC};branch=${SRCBRANCH_psa};name=psa;destsuffix=git/${PSA_ARCH_TESTS_SRC_PATH} \
           "
SMW_LIB_SRC ?= "git://github.com/nxp-imx/imx-smw.git;protocol=https"
PSA_LIB_SRC ?= "git://github.com/ARM-software/psa-arch-tests.git;protocol=https"
PSA_ARCH_TESTS_SRC_PATH = "psa-arch-tests"
SRCBRANCH_smw = "release/version_2.x"
SRCBRANCH_psa = "main"
SRCREV_smw = "d32054496719fcb27d2c64e08bafc53ba9802db4" 
SRCREV_psa = "2a1852252a9b9af655cbe02d5d3c930952d0d798"
SRCREV_FORMAT = "smw_psa"
S = "${WORKDIR}/git/smw"

inherit cmake python3native

CFLAGS[unexport] = "1"
CPPFLAGS[unexport] = "1"
AS[unexport] = "1"
LD[unexport] = "1"

# setting the linker options
TARGET_LDFLAGS:remove = "${DEBUG_PREFIX_MAP}"

OPTEE_OS_TA_EXPORT_DIR:aarch64 = "${STAGING_INCDIR}/optee/export-user_ta_arm64"
OPTEE_OS_TA_EXPORT_DIR:arm = "${STAGING_INCDIR}/optee/export-user_ta_arm32"

# Needs to sign OPTEE TAs
export OPENSSL_MODULES="${STAGING_LIBDIR_NATIVE}/ossl-modules"

EXTRA_OECMAKE = " \
    -DTA_DEV_KIT_ROOT=${OPTEE_OS_TA_EXPORT_DIR} \
    -DTEEC_ROOT=${STAGING_DIR_HOST} \
    -DJSONC_ROOT="${COMPONENTS_DIR}/${TARGET_ARCH}/json-c/usr" \
    -DPSA_ARCH_TESTS_SRC_PATH=../${PSA_ARCH_TESTS_SRC_PATH} \
"
EXTRA_OECMAKE:append:mx8qxp-nxp-bsp = " -DSECO_ROOT=${STAGING_DIR_HOST}"
EXTRA_OECMAKE:append:mx8dx-nxp-bsp  = " -DSECO_ROOT=${STAGING_DIR_HOST}"
EXTRA_OECMAKE:append:mx8ulp-nxp-bsp  = " -DELE_ROOT=${STAGING_DIR_HOST}"

OECMAKE_TARGET_COMPILE += "build_tests"
OECMAKE_TARGET_INSTALL += "install_tests"

INSANE_SKIP_${PN}-tests = "textrel"

PACKAGES =+ "${PN}-tests"

FILES:${PN} += "${base_libdir}/optee_armtz/*"

FILES:${PN}-tests = "${bindir}/* ${datadir}/${BPN}/*"

RDEPENDS:${PN}-tests += "bash cmake"

COMPATIBLE_MACHINE = "(imx-nxp-bsp)"
