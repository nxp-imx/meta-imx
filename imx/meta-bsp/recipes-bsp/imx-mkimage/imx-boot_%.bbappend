### mx8mq is using FIT image and ATF

DEPENDS_append_mx8mq = " ${@bb.utils.contains('COMBINED_FEATURES', 'optee', 'optee-os', '', d)}"

do_compile_append_mx8mq[depends] += "${@bb.utils.contains('COMBINED_FEATURES', 'optee', 'optee-os:do_deploy', '', d)}"

DEPLOY_OPTEE = "false"
DEPLOY_OPTEE_mx8mq = "${@bb.utils.contains('COMBINED_FEATURES', 'optee', 'true', 'false', d)}"

do_compile_prepend () {
    if ${DEPLOY_OPTEE}; then
        cp ${DEPLOY_DIR_IMAGE}/tee.bin             ${S}/${SOC_TARGET}/
    fi
}

do_deploy_append () {
    if "${DEPLOY_OPTEE}"; then
        install -m 0644 ${DEPLOY_DIR_IMAGE}/tee.bin ${DEPLOYDIR}/${DEPLOYDIR_IMXBOOT}
    fi
}
