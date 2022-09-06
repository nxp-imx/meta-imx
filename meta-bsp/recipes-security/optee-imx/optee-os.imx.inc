# Copyright (C) 2017-2022 NXP

SUMMARY = "OPTEE OS"
DESCRIPTION = "OPTEE OS"
HOMEPAGE = "http://www.optee.org/"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c1f21c4f72f372ef38a5a4aee55ec173"

DEPENDS = "python3-pyelftools-native u-boot-mkimage-native \
           python3-cryptography-native"

OPTEE_OS_SRC ?= "git://github.com/nxp-imx/imx-optee-os.git;protocol=https"
SRC_URI = "${OPTEE_OS_SRC};branch=${SRCBRANCH}"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

inherit deploy python3native autotools features_check

REQUIRED_MACHINE_FEATURES = "optee"

# The platform flavor corresponds to the Yocto machine without the leading 'i'.
PLATFORM_FLAVOR                   = "${@d.getVar('MACHINE')[1:]}"
PLATFORM_FLAVOR:imx6qpdlsolox     = "mx6qsabresd"
PLATFORM_FLAVOR:imx6ul7d          = "mx6ulevk"
PLATFORM_FLAVOR:imx6ull14x14evk   = "mx6ullevk"
PLATFORM_FLAVOR:imx6ull9x9evk     = "mx6ullevk"
PLATFORM_FLAVOR:imx6ulz-14x14-evk = "mx6ulzevk"
PLATFORM_FLAVOR:mx8mq-nxp-bsp     = "mx8mqevk"
PLATFORM_FLAVOR:mx8mm-nxp-bsp     = "mx8mmevk"
PLATFORM_FLAVOR:mx8mn-nxp-bsp     = "mx8mnevk"
PLATFORM_FLAVOR:mx8mp-nxp-bsp     = "mx8mpevk"
PLATFORM_FLAVOR:mx8mpul-nxp-bsp   = "mx8mpevk"
PLATFORM_FLAVOR:mx8qm-nxp-bsp     = "mx8qmmek"
PLATFORM_FLAVOR:mx8qxp-nxp-bsp    = "mx8qxpmek"
PLATFORM_FLAVOR:mx8dx-nxp-bsp     = "mx8dxmek"
PLATFORM_FLAVOR:mx8dxl-nxp-bsp    = "mx8dxlevk"
PLATFORM_FLAVOR:mx8mnul-nxp-bsp   = "mx8mnevk"
PLATFORM_FLAVOR:mx8ulp-nxp-bsp    = "mx8ulpevk"

EXTRA_OEMAKE = " \
    PLATFORM=imx-${PLATFORM_FLAVOR} \
    CROSS_COMPILE=${HOST_PREFIX} \
    CROSS_COMPILE64=${HOST_PREFIX} \
    CFG_TEE_TA_LOG_LEVEL=0 \
    CFG_TEE_CORE_LOG_LEVEL=0 \
    OPENSSL_MODULES=${STAGING_LIBDIR_NATIVE}/ossl-modules \
    -C ${S} O=${B} \
"

LDFLAGS[unexport] = "1"
CFLAGS += "--sysroot=${STAGING_DIR_HOST}"
CXXFLAGS += "--sysroot=${STAGING_DIR_HOST}"

OPTEE_ARCH:arm = "arm32"
OPTEE_ARCH:aarch64 = "arm64"

do_configure[noexec] = "1"

do_compile:arm () {
    oe_runmake all uTee
}

do_compile:aarch64 () {
    oe_runmake all
}
do_compile[cleandirs] = "${B}"

do_deploy () {
    install -d ${DEPLOYDIR}
    cp ${B}/core/tee-raw.bin ${DEPLOYDIR}/tee.${PLATFORM_FLAVOR}.bin
    ln -sf tee.${PLATFORM_FLAVOR}.bin ${DEPLOYDIR}/tee.bin
}

do_deploy:append:arm () {
    cp ${B}/core/uTee ${DEPLOYDIR}/uTee-${OPTEE_BIN_EXT}
}

do_install () {
    install -d ${D}${nonarch_base_libdir}/firmware/
    install -m 644 ${B}/core/*.bin ${D}${nonarch_base_libdir}/firmware/

    # Install embedded TAs
    install -d ${D}${base_libdir}/optee_armtz/
    install -m 444 ${B}/ta/*/*.ta ${D}${base_libdir}/optee_armtz/

    # Install TA devkit
    install -d ${D}${includedir}/optee/export-user_ta_${OPTEE_ARCH}/
    cp -aR ${B}/export-ta_${OPTEE_ARCH}/* \
        ${D}${includedir}/optee/export-user_ta_${OPTEE_ARCH}/
}

addtask deploy after do_compile before do_install

FILES:${PN} = "${nonarch_base_libdir}/firmware/ /lib*/optee_armtz/"
FILES:${PN}-staticdev = "/usr/include/optee/"
RDEPENDS:${PN}-dev += "${PN}-staticdev"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(imx-nxp-bsp|imx-boot-container)"
