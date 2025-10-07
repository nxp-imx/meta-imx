do_configure:imx8qm-cockpit() {
    oe_runmake clean BUILD_BASE=a53
    oe_runmake clean BUILD_BASE=a72
}

do_compile:imx8qm-cockpit() {
    unset ${CLEAR_FLAGS} COCKPIT_A72 LDFLAGS
    oe_runmake BUILD_BASE=a53 COCKPIT_A53=1 SPD=none
    unset ${CLEAR_FLAGS} COCKPIT_A53
    oe_runmake BUILD_BASE=a72 COCKPIT_A72=1 SPD=none
}

ANNOTATED_NAME:imx8qm-cockpit = "bl31-${ATF_PLATFORM}-cockpit.bin"

do_deploy:imx8qm-cockpit() {
    OUTPUT_FOLDER="${@bb.utils.contains('PACKAGECONFIG', 'debug', 'debug', 'release', d)}"
    for core in a53 a72; do
        for deploydir in ${DEPLOYDIR} ${DEPLOYDIR}/imx-boot-tools; do
            install -Dm 0644 ${S}/$core/${ATF_PLATFORM}/${OUTPUT_FOLDER}/bl31.bin \
                $deploydir/${ANNOTATED_NAME}-$core
        done
    done
}
