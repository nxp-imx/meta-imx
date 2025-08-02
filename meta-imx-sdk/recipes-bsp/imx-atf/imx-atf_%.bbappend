# For optee builds, generate non-optee binaries as well.
ANNOTATED_NAME_EXTRA_BUILD = \
    "${@bb.utils.contains('PACKAGECONFIG', 'crrm',  '', \
        bb.utils.contains('PACKAGECONFIG', 'optee', 'bl31-${ATF_PLATFORM}.bin', \
                                                    '', d), d)}"

EXTRA_OEMAKE_EXTRA_BUILD = "${EXTRA_OEMAKE} BUILD_BASE=build-ci"
EXTRA_OEMAKE_EXTRA_BUILD:remove = "SPD=opteed"

do_compile:append() {
    if [ "${ANNOTATED_NAME_EXTRA_BUILD}" != "" ]; then
        bbnote ${MAKE} ${EXTRA_OEMAKE_EXTRA_BUILD} "$@"
        ${MAKE} ${EXTRA_OEMAKE_EXTRA_BUILD} "$@" || die "CI oe_runmake failed"
    fi
}

do_deploy:append() {
    if [ "${ANNOTATED_NAME_EXTRA_BUILD}" != "" ]; then
        install -Dm 0644 ${S}/build-ci/${ATF_PLATFORM}/${OUTPUT_FOLDER}/bl31.bin \
            ${DEPLOYDIR}/imx-boot-tools/${ANNOTATED_NAME_EXTRA_BUILD}
    fi
}
