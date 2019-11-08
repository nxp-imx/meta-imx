# Copyright 2017-2018 NXP

SUMMARY = "OPTEE test"
HOMEPAGE = "http://www.optee.org/"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=daa2bcccc666345ab8940aab1315a4fa"

inherit pythonnative
DEPENDS = "optee-os-imx optee-client-imx python-pycrypto-native openssl"

SRCBRANCH = "imx_3.2.y"
OPTEE_TEST_SRC ?= "git://source.codeaurora.org/external/imx/imx-optee-test.git;protocol=https"
SRC_URI = "${OPTEE_TEST_SRC};branch=${SRCBRANCH} \
           file://0001-fix-build-failure-with-GCC-9.patch"
SRCREV = "b7114b828b82f2c0eec124ed424eff1230cc5319"

S = "${WORKDIR}/git"

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
    V=1 \
"

do_install () {
    install -d ${D}/usr/bin
    install ${S}/out/xtest/xtest ${D}/usr/bin/

    install -d ${D}/lib/optee_armtz
    find ${S}/out/ta -name '*.ta' | while read name; do
    install -m 444 $name ${D}/lib/optee_armtz/
    done

}

FILES_${PN} = "/usr/bin/ /lib*/optee_armtz/"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
