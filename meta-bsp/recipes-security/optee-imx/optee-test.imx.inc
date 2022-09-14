# Copyright (C) 2017-2020 NXP

SUMMARY = "OPTEE test"
HOMEPAGE = "http://www.optee.org/"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=daa2bcccc666345ab8940aab1315a4fa"

inherit python3native

DEPENDS = "optee-os optee-client python3-pycrypto-native openssl"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

OPTEE_TEST_SRC ?= "git://github.com/nxp-imx/imx-optee-test.git;protocol=https"

SRC_URI = "${OPTEE_TEST_SRC};branch=${SRCBRANCH} \
"

S = "${WORKDIR}/git"
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

do_compile () {
    export CXXFLAGS="${CXXFLAGS} --sysroot=${STAGING_DIR_HOST}"

    if [ ${DEFAULTTUNE} = "aarch64" ];then
        export TA_DEV_KIT_DIR=${STAGING_INCDIR}/optee/export-user_ta_arm64/
        export ARCH=arm64
    else
        export TA_DEV_KIT_DIR=${STAGING_INCDIR}/optee/export-user_ta_arm32/
        export ARCH=arm
    fi
    export OPTEE_CLIENT_EXPORT=${STAGING_DIR_HOST}/usr
    export CROSS_COMPILE_HOST=${HOST_PREFIX}
    export CROSS_COMPILE_TA=${HOST_PREFIX}
    export CROSS_COMPILE=${HOST_PREFIX}
    export OPTEE_OPENSSL_EXPORT=${STAGING_INCDIR}/
    oe_runmake V=1
}

do_install () {
    install -d ${D}/usr/bin
    install ${B}/xtest/xtest ${D}/usr/bin/

    install -d ${D}/lib/optee_armtz
    find ${B}/ta -name '*.ta' | while read name; do
    install -m 444 $name ${D}/lib/optee_armtz/
    done
}

FILES_${PN} = "/usr/bin/ /lib*/optee_armtz/"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
