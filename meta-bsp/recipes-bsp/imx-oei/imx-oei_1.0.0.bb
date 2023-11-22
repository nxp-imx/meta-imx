SUMMARY = "i.MX Optional Execution Image"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=59530bdf33659b29e73d4adb9f9f6552"

INHIBIT_DEFAULT_DEPS = "1"
DEPENDS = "gcc-arm-none-eabi-native"

SRC_URI = "${IMX_OEI_SRC};branch=${SRCBRANCH}"
IMX_OEI_SRC ?= "git://github.com/nxp-imx/imx-oei.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "eacce350bbe782ac452f1ccbbc8937a44c4e33af"

S = "${WORKDIR}/git"

inherit deploy

OEI_CONFIG ?= "UNDEFINED"
OEI_CORE   ?= "UNDEFINED"
OEI_SOC    ?= "UNDEFINED"
OEI_BOARD  ?= "UNDEFINED"

LDFLAGS[unexport] = "1"

EXTRA_OEMAKE = "\
    board=${OEI_BOARD} \
    oei=${OEI_CONFIG} \
    DEBUG=1 \
    OEI_CROSS_COMPILE=arm-none-eabi-"

do_compile() {
    oe_runmake all
}

do_install() {
    install -d ${D}/firmware
    install -m 0644 ${B}/build/${OEI_BOARD}/${OEI_CONFIG}/oei-*.bin ${D}/firmware
}

addtask deploy after do_install
do_deploy() {
    cp -rf ${D}/firmware/* ${DEPLOYDIR}/
}

FILES:${PN} = "/firmware"
SYSROOT_DIRS += "/firmware"

COMPATIBLE_MACHINE = "(mx95-generic-bsp)"
