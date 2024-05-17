# Set generic compiler for system manager core
INHIBIT_DEFAULT_DEPS = "1"
DEPENDS = "${SM_COMPILER}"
SM_COMPILER ?= "gcc-arm-none-eabi-native"

inherit deploy

SYSTEM_MANAGER_CONFIG ?= "INVALID"

LDFLAGS[unexport] = "1"

EXTRA_OEMAKE = " \
    V=y \
    SM_CROSS_COMPILE=arm-none-eabi-"

do_configure() {
    oe_runmake config=${SYSTEM_MANAGER_CONFIG} clean
    oe_runmake config=${SYSTEM_MANAGER_CONFIG} cfg
}

do_compile() {
    oe_runmake config=${SYSTEM_MANAGER_CONFIG}
}

do_install[noexec] = "1"

addtask deploy after do_compile
do_deploy() {
    install -D -p -m 0644 \
        ${B}/build/${SYSTEM_MANAGER_CONFIG}/${SYSTEM_MANAGER_FIRMWARE_BASENAME}.bin \
        ${DEPLOYDIR}/${SYSTEM_MANAGER_FIRMWARE_BASENAME}-${SYSTEM_MANAGER_CONFIG}.bin
}

COMPATIBLE_MACHINE = "(mx95-generic-bsp)"
