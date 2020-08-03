# Copyright (C) 2019-2020 NXP

require recipes-security/optee-imx/optee-test_3.2.0.imx.bb

inherit python3native
DEPENDS_remove = "python-pycrypto-native"
DEPENDS_append = " python3-pycrypto-native"

SRC_URI_remove = "file://0001-regression-4011-correct-potential-overflow.patch \
                  file://0001-xtest-prevent-unexpected-build-warning-with-strncpy.patch \
                  file://0003-sock_server-fix-compilation-against-musl-sys-errno.h.patch \
                  file://0004-build-ignore-declaration-after-statement-warnings.patch \
                  file://0005-benchmark_1000-fix-compilation-against-musl-uint.patch \
                  file://0006-regression_8100-use-null-terminated-strings-with-fil.patch \
                 "
B = "${WORKDIR}/build"

TA_DEV_KIT_DIR_aarch64 = "${STAGING_INCDIR}/optee/export-user_ta_arm64/"
OPTEE_ARCH_aarch64 = "arm64"
TA_DEV_KIT_DIR_arm = "${STAGING_INCDIR}/optee/export-user_ta_arm32/"
OPTEE_ARCH_arm = "arm"

EXTRA_OEMAKE = " \
    TA_DEV_KIT_DIR=${TA_DEV_KIT_DIR} \
    ARCH=${OPTEE_ARCH} \
    OPTEE_CLIENT_EXPORT=${STAGING_DIR_HOST}/usr \
    CROSS_COMPILE_HOST=${HOST_PREFIX} \
    CROSS_COMPILE_TA=${HOST_PREFIX} \
    CROSS_COMPILE=${HOST_PREFIX} \
    OPTEE_OPENSSL_EXPORT=${STAGING_INCDIR}/ \
    -C ${S} O=${B} \
"
do_compile_prepend () {
    export CXXFLAGS="${CXXFLAGS} --sysroot=${STAGING_DIR_HOST}"
}

do_install () {
    install -d ${D}/usr/bin
    install ${B}/xtest/xtest ${D}/usr/bin/

    install -d ${D}/lib/optee_armtz
    find ${B}/ta -name '*.ta' | while read name; do
    install -m 444 $name ${D}/lib/optee_armtz/
    done
}
