
SRC_URI_imx8qm-cockpit = "${ATF_SRC};branch=imx_v2.4"
SRCREV_imx8qm-cockpit = "ea633e229404b5813b0bddfa52959a2dba24d34a"

do_compile_imx8qm-cockpit () {
    unset ${CLEAR_FLAGS}
    oe_runmake clean bl31 BUILD_BASE=a53
    oe_runmake ${BUILD_STRING} PLAT=${PLATFORM} BUILD_BASE=a53 COCKPIT_A53=1 SPD=none bl31
    oe_runmake clean bl31 BUILD_BASE=a72
    oe_runmake ${BUILD_STRING} PLAT=${PLATFORM} BUILD_BASE=a72 COCKPIT_A72=1 SPD=none bl31

    if ${BUILD_OPTEE}; then
       oe_runmake clean BUILD_BASE=build-optee-a53
       oe_runmake ${BUILD_STRING} PLAT=${PLATFORM} BUILD_BASE=optee-a53 COCKPIT_A53=1 SPD=opteed bl31
       oe_runmake clean BUILD_BASE=build-optee-a72
       oe_runmake ${BUILD_STRING} PLAT=${PLATFORM} BUILD_BASE=optee-a72 COCKPIT_A53=1 SPD=opteed bl31
    fi
}

do_deploy_imx8qm-cockpit () {
    install -Dm 0644 ${S}/a53/${PLATFORM}/release/bl31.bin ${DEPLOYDIR}/${BOOT_TOOLS}/bl31-imx8qm-cockpit.bin-a53
    install -m 0644 ${S}/a72/${PLATFORM}/release/bl31.bin ${DEPLOYDIR}/${BOOT_TOOLS}/bl31-imx8qm-cockpit.bin-a72
    if ${BUILD_OPTEE}; then
       install -m 0644 ${S}/optee-a53/${PLATFORM}/release/bl31.bin ${DEPLOYDIR}/${BOOT_TOOLS}/bl31-imx8qm-cockpit.bin-optee-a53
       install -m 0644 ${S}/optee-a72/${PLATFORM}/release/bl31.bin ${DEPLOYDIR}/${BOOT_TOOLS}/bl31-imx8qm-cockpit.bin-optee-a72
    fi
}
