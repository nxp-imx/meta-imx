do_compile:imx8qm-cockpit () {
    unset ${CLEAR_FLAGS} COCKPIT_A72
    oe_runmake clean BUILD_BASE=a53
    oe_runmake BUILD_BASE=a53 COCKPIT_A53=1 SPD=none bl31
    unset ${CLEAR_FLAGS} COCKPIT_A53
    oe_runmake clean BUILD_BASE=a72
    oe_runmake BUILD_BASE=a72 COCKPIT_A72=1 SPD=none bl31

    if ${BUILD_OPTEE}; then
       unset ${CLEAR_FLAGS} COCKPIT_A72
       oe_runmake clean BUILD_BASE=build-optee-a53
       oe_runmake BUILD_BASE=optee-a53 COCKPIT_A53=1 SPD=opteed bl31

       unset ${CLEAR_FLAGS} COCKPIT_A53
       oe_runmake clean BUILD_BASE=build-optee-a72
       oe_runmake BUILD_BASE=optee-a72 COCKPIT_A72=1 SPD=opteed bl31
    fi
}

do_deploy:imx8qm-cockpit () {
    install -Dm 0644 ${S}/a53/${PLATFORM}/release/bl31.bin ${DEPLOYDIR}/${BOOT_TOOLS}/bl31-imx8qm-cockpit.bin-a53
    install -m 0644 ${S}/a72/${PLATFORM}/release/bl31.bin ${DEPLOYDIR}/${BOOT_TOOLS}/bl31-imx8qm-cockpit.bin-a72
    if ${BUILD_OPTEE}; then
       install -m 0644 ${S}/optee-a53/${PLATFORM}/release/bl31.bin ${DEPLOYDIR}/${BOOT_TOOLS}/bl31-imx8qm-cockpit.bin-optee-a53
       install -m 0644 ${S}/optee-a72/${PLATFORM}/release/bl31.bin ${DEPLOYDIR}/${BOOT_TOOLS}/bl31-imx8qm-cockpit.bin-optee-a72
    fi
}
