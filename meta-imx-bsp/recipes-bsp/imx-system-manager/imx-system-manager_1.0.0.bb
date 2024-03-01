SUMMARY = "i.MX System Manager Firmware"
DESCRIPTION = "\
The System Manager (SM) is a firmware that runs on a Cortex-M processor on \
many NXP i.MX processors. The Cortex-M is the boot core, runs the boot ROM \
which loads the SM (and other boot code), and then branches to the SM. The \
SM then configures some aspects of the hardware such as isolation mechanisms \
and then starts other cores in the system. After starting these cores, it \
enters a service mode where it provides access to clocking, power, sensor, \
and pin control via a client RPC API based on ARM's System Control and \
Management Interface (SCMI)."

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=0858ec9c7a80c4a2cf16e4f825a2cc91"

INHIBIT_DEFAULT_DEPS = "1"
DEPENDS = "gcc-arm-none-eabi-native"

SRC_URI = "${IMX_SYSTEM_MANAGER_SRC};branch=${SRCBRANCH}"
IMX_SYSTEM_MANAGER_SRC ?= "git://github.com/nxp-imx/imx-sm.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "7896a71b9d689659a2ce6a13db0dc71c99c94f0c"

S = "${WORKDIR}/git"

inherit deploy

SYSTEM_MANAGER_CONFIG ?= "UNDEFINED"

LDFLAGS[unexport] = "1"

EXTRA_OEMAKE = " \
    V=y \
    config=${SYSTEM_MANAGER_CONFIG} \
    SM_CROSS_COMPILE=arm-none-eabi-"

do_compile() {
    oe_runmake img
}

do_install() {
    install -D -p -m 0644 ${B}/build/${SYSTEM_MANAGER_CONFIG}/m33_image.bin ${D}/firmware/m33_image.bin
}

addtask deploy after do_install
do_deploy() {
    cp -rf ${D}/firmware/* ${DEPLOYDIR}/
}

FILES:${PN} = "/firmware"
SYSROOT_DIRS += "/firmware"

COMPATIBLE_MACHINE = "(mx95-generic-bsp)"
