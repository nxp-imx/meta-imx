# Set generic compiler for system manager core
INHIBIT_DEFAULT_DEPS = "1"
DEPENDS += "${SM_COMPILER}"
DEPENDS:append:mx943-nxp-bsp = " srecord-native"
SM_COMPILER ?= "gcc-arm-none-eabi-native"

PROVIDES = "virtual/imx-system-manager"

inherit deploy

PACKAGE_ARCH = "${MACHINE_ARCH}"

SYSTEM_MANAGER_CONFIG ?= "INVALID"

LDFLAGS[unexport] = "1"

EXTRA_OEMAKE = " \
    CONFIG=${SYSTEM_MANAGER_CONFIG} \
    SM_CROSS_COMPILE=arm-none-eabi- \
    V=1 \
    M=${SYSTEM_MANAGER_MONITOR_MODE} \
    ${PACKAGECONFIG_CONFARGS} \
"
SYSTEM_MANAGER_MONITOR_MODE ??= "2"

do_configure() {
    oe_runmake clean
    oe_runmake cfg
}

do_install[noexec] = "1"

addtask deploy after do_compile
do_deploy() {
    install -D -p -m 0644 \
        ${B}/build/${SYSTEM_MANAGER_CONFIG}/${SYSTEM_MANAGER_FIRMWARE_BASENAME}.bin \
        ${DEPLOYDIR}/${SYSTEM_MANAGER_FIRMWARE_BASENAME}-${SYSTEM_MANAGER_CONFIG}.bin
}

COMPATIBLE_MACHINE = "(mx95-generic-bsp|mx943-generic-bsp|mx952-generic-bsp)"
