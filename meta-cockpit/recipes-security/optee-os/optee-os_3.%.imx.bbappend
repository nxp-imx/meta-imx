PLATFORM_FLAVOR:imx8qm-cockpit = "mx8qmmekcockpita72"

do_compile:imx8qm-cockpit () {
    unset LDFLAGS
    export CFLAGS="${CFLAGS} --sysroot=${STAGING_DIR_HOST}"
    oe_runmake -C ${S} PLATFORM=imx-mx8qmmekcockpita53
    cp ${B}/core/tee-raw.bin ${B}/core/tee-a53.bin
    oe_runmake -C ${S} clean
    oe_runmake -C ${S} PLATFORM=imx-mx8qmmekcockpita72
    cp ${B}/core/tee-raw.bin ${B}/core/tee-a72.bin
}

do_deploy:append:imx8qm-cockpit () {
    install -d ${DEPLOYDIR}
    install ${B}/core/tee-a53.bin  ${DEPLOYDIR}
    install ${B}/core/tee-a72.bin  ${DEPLOYDIR}
}
