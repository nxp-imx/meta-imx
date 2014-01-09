
SRCBRANCH = "imx_v2013.04"
SRC_URI = "git://${FSL_ARM_GIT_SERVER}//uboot-imx.git;protocol=git;branch=${SRCBRANCH}"
SRCREV = "${AUTOREV}"

# save UBOOT_CONFIG as separate names
do_deploy_append() {
    install ${S}/${UBOOT_BINARY} ${DEPLOYDIR}/${UBOOT_IMAGE}_${UBOOT_CONFIG}
}
