# Copyright (C) 2020 NXP

SUMMARY = "OPTEE test"
HOMEPAGE = "http://www.optee.org/"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=daa2bcccc666345ab8940aab1315a4fa"

DEPENDS = "optee-os optee-client python3-pycrypto-native openssl"
inherit python3native cmake

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

OPTEE_ARCH ?= "arm"
OPTEE_ARCH_armv7a = "arm32"
OPTEE_ARCH_aarch64 = "arm64"

TA_DEV_KIT_DIR_arm = "${STAGING_INCDIR}/optee/export-user_ta_arm32/"
TA_DEV_KIT_DIR_aarch64 = "${STAGING_INCDIR}/optee/export-user_ta_arm64/"

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

EXTRA_OECMAKE = " \
    -DOPTEE_TEST_SDK=${TA_DEV_KIT_DIR} \
"
do_compile () {
    export CXXFLAGS="${CXXFLAGS} --sysroot=${STAGING_DIR_HOST}"
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
