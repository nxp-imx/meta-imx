
SRCBRANCH_COCKPIT = "feature/LFOPTEE-37-support-optee-for-i.mx8qm-cockpit-domains"
SRC_URI_imx8qm-cockpit = "${OPTEE_OS_SRC};branch=${SRCBRANCH_COCKPIT}"
SRCREV_imx8qm-cockpit = "0cca7e4e79d64389c0d94b121a7c9f9221289dae"

do_compile_append_imx8qm-cockpit () {
    unset LDFLAGS
    export CFLAGS="${CFLAGS} --sysroot=${STAGING_DIR_HOST}"
    oe_runmake clean
    oe_runmake -C ${S} PLATFORM_FLAVOR=mx8qmmekcockpita53
    ${TARGET_PREFIX}objcopy -O binary ${B}/core/tee.elf ${B}/core/tee-a53.bin
    oe_runmake clean
    oe_runmake -C ${S} PLATFORM_FLAVOR=mx8qmmekcockpita72
    ${TARGET_PREFIX}objcopy -O binary ${B}/core/tee.elf ${B}/core/tee-a72.bin
}

do_deploy_append_imx8qm-cockpit () {
    install -d ${DEPLOYDIR}
    install ${B}/core/tee-a53.bin  ${DEPLOYDIR}
    install ${B}/core/tee-a72.bin  ${DEPLOYDIR}
}
