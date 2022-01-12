# Copyright (C) 2017-2021 NXP

SUMMARY = "OPTEE test"
HOMEPAGE = "http://www.optee.org/"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=daa2bcccc666345ab8940aab1315a4fa"

DEPENDS = "python3-pycrypto-native python3-pycryptodomex-native optee-os optee-client openssl"

SRCBRANCH = "lf-5.15.5_1.0.0"

OPTEE_TEST_SRC ?= "git://source.codeaurora.org/external/imx/imx-optee-test.git;protocol=https"
SRC_URI = "${OPTEE_TEST_SRC};branch=${SRCBRANCH}"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

SRCREV = "e9d8bf6ee121d6686e6e409c727caee76496bb86" 

inherit python3native

OPTEE_ARCH ?= "arm32"
OPTEE_ARCH:armv7a = "arm32"
OPTEE_ARCH:aarch64 = "arm64"

TA_DEV_KIT_DIR:arm = "${STAGING_INCDIR}/optee/export-user_ta_arm32/"
TA_DEV_KIT_DIR:aarch64 = "${STAGING_INCDIR}/optee/export-user_ta_arm64/"

CFLAGS += "--sysroot=${STAGING_DIR_HOST}"
CXXFLAGS += "--sysroot=${STAGING_DIR_HOST}"

EXTRA_OEMAKE = " \
    TA_DEV_KIT_DIR=${TA_DEV_KIT_DIR} \
    ARCH=${OPTEE_ARCH} \
    OPTEE_CLIENT_EXPORT=${STAGING_DIR_HOST}/usr \
    CROSS_COMPILE_HOST=${HOST_PREFIX} \
    CROSS_COMPILE_TA=${HOST_PREFIX} \
    CROSS_COMPILE=${HOST_PREFIX} \
    -C ${S} O=${B} \
"

do_compile() {
    oe_runmake all
}
do_compile[cleandirs] = "${B}"

do_install () {
	install -d ${D}/usr/bin
	install ${B}/xtest/xtest ${D}/usr/bin/

	install -d ${D}/lib/optee_armtz
	find ${B}/ta -name '*.ta' | while read name; do
		install -m 444 $name ${D}/lib/optee_armtz/
	done

	install -d ${D}/usr/lib/tee-supplicant/plugins/
	install ${B}/supp_plugin/*plugin ${D}/usr/lib/tee-supplicant/plugins/
}

FILES:${PN} = "/usr/bin/ /lib*/optee_armtz/ /usr/lib/tee-supplicant/plugins/"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
