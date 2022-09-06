# Copyright (C) 2017-2022 NXP

SUMMARY = "OPTEE test"
HOMEPAGE = "http://www.optee.org/"
LICENSE = "GPL-2.0-only & BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=daa2bcccc666345ab8940aab1315a4fa"

DEPENDS = "python3-cryptography-native optee-os optee-client openssl"

OPTEE_TEST_SRC ?= "git://github.com/nxp-imx/imx-optee-test.git;protocol=https"
SRC_URI = "${OPTEE_TEST_SRC};branch=${SRCBRANCH}"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"


inherit python3native features_check

REQUIRED_MACHINE_FEATURES = "optee"

OPTEE_ARCH:arm = "arm32"
OPTEE_ARCH:aarch64 = "arm64"

EXTRA_OEMAKE = " \
    TA_DEV_KIT_DIR=${STAGING_INCDIR}/optee/export-user_ta_${OPTEE_ARCH}/ \
    OPTEE_CLIENT_EXPORT=${STAGING_DIR_HOST}/usr \
    CROSS_COMPILE_HOST=${HOST_PREFIX} \
    CROSS_COMPILE_TA=${HOST_PREFIX} \
    CROSS_COMPILE=${HOST_PREFIX} \
    OPENSSL_MODULES=${STAGING_LIBDIR_NATIVE}/ossl-modules \
    -C ${S} O=${B} \
"

CFLAGS += "--sysroot=${STAGING_DIR_HOST}"
CXXFLAGS += "--sysroot=${STAGING_DIR_HOST}"

do_compile() {
    oe_runmake all
}
do_compile[cleandirs] = "${B}"

do_install () {
	# Install xtest
	install -d ${D}${bindir}/
	install -D -m 0755 ${B}/xtest/xtest ${D}${bindir}/

	# Install TAs
	install -d ${D}${base_libdir}/optee_armtz/
	install -m 444 ${B}/ta/*/*.ta ${D}${base_libdir}/optee_armtz/

	# Install plugins
	install -d ${D}${libdir}/tee-supplicant/plugins/
	install -m 444 ${B}/supp_plugin/*.plugin ${D}${libdir}/tee-supplicant/plugins/
}

FILES:${PN} += "${base_libdir}/optee_armtz/ ${libdir}/tee-supplicant/plugins/"

COMPATIBLE_MACHINE = "(imx-nxp-bsp)"
