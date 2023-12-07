OPTEEMACHINE:imx8qm-cockpit = "imx-mx8qmmekcockpita72"

do_compile:imx8qm-cockpit() {
    PLAT_LIBGCC_PATH=$(${CC} -print-libgcc-file-name)
    oe_runmake -C ${S} PLATFORM=imx-mx8qmmekcockpita53
    cp ${B}/core/tee-raw.bin ${B}/core/tee-a53.bin
    oe_runmake -C ${S} clean
    oe_runmake -C ${S} PLATFORM=imx-mx8qmmekcockpita72
    cp ${B}/core/tee-raw.bin ${B}/core/tee-a72.bin
}
