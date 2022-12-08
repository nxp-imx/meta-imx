
do_compile:imx8qm-cockpit() {
    PLAT_LIBGCC_PATH=$(${CC} -print-libgcc-file-name)
    oe_runmake -C ${S} PLATFORM_FLAVOR=mx8qmmekcockpita53
    ${TARGET_PREFIX}objcopy -O binary ${B}/core/tee.elf ${B}/core/tee-a53.bin
    oe_runmake -C ${S} clean
    oe_runmake -C ${S} PLATFORM_FLAVOR=mx8qmmekcockpita72
    ${TARGET_PREFIX}objcopy -O binary ${B}/core/tee.elf ${B}/core/tee-a72.bin
}
