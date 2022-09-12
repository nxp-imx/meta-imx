# Copyright (C) 2017-2021 NXP

DESCRIPTION = "i.MX ARM Trusted Firmware"
SECTION = "BSP"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

PV .= "+git${SRCPV}"

SRCBRANCH = "lf_v2.4"
ATF_SRC ?= "git://github.com/nxp-imx/imx-atf.git;protocol=https"
SRC_URI = "${ATF_SRC};branch=${SRCBRANCH} \
"
SRCREV = "bb4957067d4b96a6ee197a333425948e409e990d"

S = "${WORKDIR}/git"

inherit deploy

BOOT_TOOLS = "imx-boot-tools"

PLATFORM        ?= "INVALID"
PLATFORM_mx8qm   = "imx8qm"
PLATFORM_mx8x    = "imx8qx"
PLATFORM_mx8mq   = "imx8mq"
PLATFORM_mx8mm   = "imx8mm"
PLATFORM_mx8mn   = "imx8mn"
PLATFORM_mx8mnul = "imx8mn"
PLATFORM_mx8mp   = "imx8mp"
PLATFORM_mx8dx   = "imx8dx"
PLATFORM_mx8dxl  = "imx8dxl"
PLATFORM_mx8ulp  = "imx8ulp"

# Clear LDFLAGS to avoid the option -Wl recognize issue
# Clear CFLAGS to avoid coherent_arm out of OCRAM size limitation (64KB) - i.MX 8MQ only
CLEAR_FLAGS ?= "LDFLAGS"
CLEAR_FLAGS_mx8mq = "LDFLAGS CFLAGS"

EXTRA_OEMAKE += " \
    CROSS_COMPILE="${TARGET_PREFIX}" \
    PLAT=${PLATFORM} \
"

BUILD_OPTEE = "${@bb.utils.contains('MACHINE_FEATURES', 'optee', 'true', 'false', d)}"

do_compile() {
    unset ${CLEAR_FLAGS}

    oe_runmake bl31
    if ${BUILD_OPTEE}; then
       oe_runmake clean BUILD_BASE=build-optee
       oe_runmake BUILD_BASE=build-optee SPD=opteed bl31
    fi
}

do_install[noexec] = "1"

do_deploy() {
    install -Dm 0644 ${S}/build/${PLATFORM}/release/bl31.bin ${DEPLOYDIR}/${BOOT_TOOLS}/bl31-${PLATFORM}.bin
    if ${BUILD_OPTEE}; then
       install -m 0644 ${S}/build-optee/${PLATFORM}/release/bl31.bin ${DEPLOYDIR}/${BOOT_TOOLS}/bl31-${PLATFORM}.bin-optee
    fi
}
addtask deploy after do_compile

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx8)"
