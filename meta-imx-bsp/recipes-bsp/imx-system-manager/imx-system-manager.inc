inherit deploy

SYSTEM_MANAGER_CONFIG  ?= "INVALID"
SYSTEM_MANAGER_CONFIGS ?= "${SYSTEM_MANAGER_CONFIG}"

LDFLAGS[unexport] = "1"

EXTRA_OEMAKE = " \
    V=y \
    SM_CROSS_COMPILE=arm-none-eabi-"

do_configure() {
    for config in ${SYSTEM_MANAGER_CONFIGS}; do
        oe_runmake clean config=$config
    done
}

do_compile() {
    for config in ${SYSTEM_MANAGER_CONFIGS}; do
        oe_runmake config=$config
    done
}

do_install[noexec] = "1"

addtask deploy after do_compile
do_deploy() {
    for config in ${SYSTEM_MANAGER_CONFIGS}; do
        install -D -p -m 0644 \
            ${B}/build/$config/${SYSTEM_MANAGER_FIRMWARE_BASENAME}.bin \
            ${DEPLOYDIR}/${SYSTEM_MANAGER_FIRMWARE_BASENAME}-$config.bin
    done
}

COMPATIBLE_MACHINE = "(mx95-generic-bsp)"
