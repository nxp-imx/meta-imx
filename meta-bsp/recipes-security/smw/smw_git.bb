# Copyright 2020 NXP

SUMMARY = "NXP i.MX Security Middleware Library"
DESCRIPTION = "NXP i.MX Security Middleware Library"
SECTION = "base"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=8636bd68fc00cc6a3809b7b58b45f982"

DEPENDS = "imx-seco-libs json-c optee-os optee-client python3-pycryptodomex-native"

SRCBRANCH = "master"
SMW_LIB_SRC ?= "git://source.codeaurora.org/external/imx/imx-smw.git;protocol=https"
SRC_URI = "${SMW_LIB_SRC};branch=${SRCBRANCH}"
SRCREV = "1037bc63df5a7bde9a7c7d1a3294c678f9f53952"

S = "${WORKDIR}/git"

inherit cmake python3native

OPTEE_OS_TA_EXPORT_DIR_aarch64 = "${STAGING_INCDIR}/optee/export-user_ta_arm64"
OPTEE_OS_TA_EXPORT_DIR_arm = "${STAGING_INCDIR}/optee/export-user_ta_arm32"

EXTRA_OECMAKE = " \
    -DSECO_ROOT=${STAGING_INCDIR} \
    -DTA_DEV_KIT_ROOT=${OPTEE_OS_TA_EXPORT_DIR} \
    -DTEEC_ROOT=${STAGING_DIR_HOST} \
    -DJSONC_ROOT="${COMPONENTS_DIR}/${TARGET_ARCH}/json-c/usr" \
"
OECMAKE_TARGET_COMPILE += "build_tests"
OECMAKE_TARGET_INSTALL += "install_tests"

PACKAGES =+ "${PN}-tests"

FILES_${PN} += "${base_libdir}/optee_armtz/*"

FILES_${PN}-tests = "${bindir}/* ${datadir}/${BPN}/*"

RDEPENDS_${PN}-tests += "bash cmake"

COMPATIBLE_MACHINE = "(mx8)"
COMPATIBLE_MACHINE_mx8m = "(^$)"
