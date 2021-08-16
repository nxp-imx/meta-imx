
do_compile:append:imx8qm-cockpit () {
    unset LDFLAGS
    export CFLAGS="${CFLAGS} --sysroot=${STAGING_DIR_HOST}"
    oe_runmake clean
    oe_runmake -C ${S} PLATFORM_FLAVOR=mx8qmmekcockpita53
    ${TARGET_PREFIX}objcopy -O binary ${B}/core/tee.elf ${B}/core/tee-a53.bin
    oe_runmake clean
    oe_runmake -C ${S} PLATFORM_FLAVOR=mx8qmmekcockpita72
    ${TARGET_PREFIX}objcopy -O binary ${B}/core/tee.elf ${B}/core/tee-a72.bin
}

do_deploy:append:imx8qm-cockpit () {
    install -d ${DEPLOYDIR}
    install ${B}/core/tee-a53.bin  ${DEPLOYDIR}
    install ${B}/core/tee-a72.bin  ${DEPLOYDIR}
}
