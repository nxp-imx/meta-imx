SUMMARY = "i.MX Optional Execution Image"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b66f32a90f9577a5a3255c21d79bc619"

INHIBIT_DEFAULT_DEPS = "1"
DEPENDS = "gcc-arm-none-eabi-native"

SRC_URI = "${IMX_OEI_SRC};branch=${SRCBRANCH}"
IMX_OEI_SRC ?= "git://github.com/nxp-imx/imx-oei.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "77f6a1bc3d5eb2ea87ed8998f9d1d089a8a2a3f7"

inherit deploy

PACKAGECONFIG ??= " \
    ${@bb.utils.contains('UBOOT_CONFIG', 'sd-ecc', 'ecc', '', d)}"

PACKAGECONFIG[ecc] = ""
PACKAGECONFIG[tcm] = ""

PACKAGE_ARCH = "${MACHINE_ARCH}"

OEI_CORE    ?= "UNDEFINED"
OEI_SOC     ?= "UNDEFINED"
OEI_BOARD   ?= "UNDEFINED"
OEI_CONFIGS ?= "ddr ${@bb.utils.filter('PACKAGECONFIG', 'tcm', d)}"

LDFLAGS[unexport] = "1"

EXTRA_OEMAKE = "\
    board=${OEI_BOARD} \
    DDR_CONFIG=${@bb.utils.contains('PACKAGECONFIG', 'ecc', '${OEI_DDR_CONFIG_ECC}', '${OEI_DDR_CONFIG}', d)} \
    DEBUG=1 \
    OEI_CROSS_COMPILE=arm-none-eabi-"

EXTRA_OEMAKE:append:mx95-nxp-bsp = " r=${IMX_SOC_REV}"

do_configure() {
    for oei_config in ${OEI_CONFIGS}; do
        oe_runmake clean oei=$oei_config
    done
}

do_compile() {
    for oei_config in ${OEI_CONFIGS}; do
        oe_runmake oei=$oei_config
    done
}

do_install() {
    install -d ${D}/firmware
    for oei_config in ${OEI_CONFIGS}; do
        install -m 0644 ${B}/build/${OEI_BOARD}/$oei_config/oei-*.bin ${D}/firmware
    done
}

addtask deploy after do_install
do_deploy() {
    cp -rf ${D}/firmware/* ${DEPLOYDIR}/
}

FILES:${PN} = "/firmware"
SYSROOT_DIRS += "/firmware"

PROVIDES += "virtual/imx-oei"

COMPATIBLE_MACHINE = "(mx95-generic-bsp|mx943-generic-bsp|mx952-generic-bsp)"
