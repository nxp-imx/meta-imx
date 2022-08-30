# Copyright (C) 2017-2022 NXP

DESCRIPTION = "i.MX ARM Trusted Firmware"
SECTION = "BSP"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

PV .= "+git${SRCPV}"

SRC_URI = "${ATF_SRC};branch=${SRCBRANCH} \
           file://0001-Makefile-Suppress-array-bounds-error.patch"
ATF_SRC ?= "git://github.com/nxp-imx/imx-atf.git;protocol=https"
SRCBRANCH = "lf_v2.6"
SRCREV = "ae5e50886594dfcfd681c1edc43bcc8dd5394c14"

S = "${WORKDIR}/git"

inherit deploy

ATF_PLATFORM ??= "INVALID"

# FIXME: We should return INVALID here but currently only i.MX8M has support to override the UART
# base address in source code.
ATF_BOOT_UART_BASE ?= ""

EXTRA_OEMAKE += " \
    CROSS_COMPILE="${TARGET_PREFIX}" \
    PLAT=${ATF_PLATFORM} \
"

# Let the Makefile handle setting up the CFLAGS and LDFLAGS as it is a standalone application
CFLAGS[unexport] = "1"
LDFLAGS[unexport] = "1"
AS[unexport] = "1"
LD[unexport] = "1"

# Baremetal, just need a compiler
INHIBIT_DEFAULT_DEPS = "1"
DEPENDS = "virtual/${HOST_PREFIX}gcc"

BUILD_OPTEE = "${@bb.utils.contains('MACHINE_FEATURES', 'optee', 'true', 'false', d)}"

# CC and LD introduce arguments which conflict with those otherwise provided by
# this recipe. The heads of these variables excluding those arguments
# are therefore used instead.
def remove_options_tail (in_string):
    from itertools import takewhile
    return ' '.join(takewhile(lambda x: not x.startswith('-'), in_string.split(' ')))

EXTRA_OEMAKE += 'LD="${@remove_options_tail(d.getVar('LD'))}"'

EXTRA_OEMAKE += 'CC="${@remove_options_tail(d.getVar('CC'))}"'

# Set the UART to use during the boot.
EXTRA_OEMAKE += 'IMX_BOOT_UART_BASE=${ATF_BOOT_UART_BASE}'

do_configure[noexec] = "1"

do_compile() {
    # Clear LDFLAGS to avoid the option -Wl recognize issue
    oe_runmake bl31
    if ${BUILD_OPTEE}; then
        oe_runmake clean BUILD_BASE=build-optee
        oe_runmake BUILD_BASE=build-optee SPD=opteed bl31
    fi
}

do_install[noexec] = "1"

do_deploy() {
    install -Dm 0644 ${S}/build/${ATF_PLATFORM}/release/bl31.bin ${DEPLOYDIR}/bl31-${ATF_PLATFORM}.bin
    if ${BUILD_OPTEE}; then
        install -m 0644 ${S}/build-optee/${ATF_PLATFORM}/release/bl31.bin ${DEPLOYDIR}/bl31-${ATF_PLATFORM}.bin-optee
    fi
}
addtask deploy after do_compile

BOOT_TOOLS = "imx-boot-tools"
do_deploy:append() {
    install -d ${DEPLOYDIR}/${BOOT_TOOLS}
    cp ${DEPLOYDIR}/bl31-${ATF_PLATFORM}.bin ${DEPLOYDIR}/${BOOT_TOOLS}
    if ${BUILD_OPTEE}; then
        cp ${DEPLOYDIR}/bl31-${ATF_PLATFORM}.bin-optee ${DEPLOYDIR}/${BOOT_TOOLS}
    fi
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx8-generic-bsp|mx9-generic-bsp)"
