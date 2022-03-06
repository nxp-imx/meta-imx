# Copyright 2020-22 NXP

SUMMARY = "NXP i.MX Security Middleware Library"
DESCRIPTION = "NXP i.MX Security Middleware Library"
SECTION = "base"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=8636bd68fc00cc6a3809b7b58b45f982"

DEPENDS = "json-c optee-os optee-client python3-pycryptodomex-native"
DEPENDS:append:mx8qxp = " imx-seco-libs"

SRCBRANCH = "release/version_1.x"
SMW_LIB_SRC ?= "git://source.codeaurora.org/external/imx/imx-smw.git;protocol=https"
SRC_URI = "${SMW_LIB_SRC};branch=${SRCBRANCH} \
    file://0001-FindSeco.cmake-Use-CMAKE-variable-to-find-seco-libra.patch"
SRCREV = "6c085c30532b85b6c1df4424d7e5c77612d92850"

S = "${WORKDIR}/git"

inherit cmake python3native

OPTEE_OS_TA_EXPORT_DIR:aarch64 = "${STAGING_INCDIR}/optee/export-user_ta_arm64"
OPTEE_OS_TA_EXPORT_DIR:arm = "${STAGING_INCDIR}/optee/export-user_ta_arm32"

EXTRA_OECMAKE = " \
    -DTA_DEV_KIT_ROOT=${OPTEE_OS_TA_EXPORT_DIR} \
    -DTEEC_ROOT=${STAGING_DIR_HOST} \
    -DJSONC_ROOT="${COMPONENTS_DIR}/${TARGET_ARCH}/json-c/usr" \
"
EXTRA_OECMAKE:append:mx8qxp = " -DSECO_ROOT=${STAGING_INCDIR}"

OECMAKE_TARGET_COMPILE += "build_tests"
OECMAKE_TARGET_INSTALL += "install_tests"

PACKAGES =+ "${PN}-tests"

FILES:${PN} += "${base_libdir}/optee_armtz/*"

FILES:${PN}-tests = "${bindir}/* ${datadir}/${BPN}/*"

RDEPENDS:${PN}-tests += "bash cmake"

COMPATIBLE_MACHINE = "(imx)"
