do_compile:imx8qm-cockpit () {
    unset ${CLEAR_FLAGS} COCKPIT_A72 LDFLAGS
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
    for core in a53 a72; do
        flavors=$core
        if ${BUILD_OPTEE}; then
            flavors="$core optee-$core"
        fi
        for flavor in $flavors; do
            install -Dm 0644 ${S}/$flavor/${ATF_PLATFORM}/release/bl31.bin ${DEPLOYDIR}/bl31-${ATF_PLATFORM}-cockpit.bin-$flavor
            install -Dm 0644 ${S}/$flavor/${ATF_PLATFORM}/release/bl31.bin ${DEPLOYDIR}/${BOOT_TOOLS}/bl31-${ATF_PLATFORM}-cockpit.bin-$flavor
        done
    done
}
