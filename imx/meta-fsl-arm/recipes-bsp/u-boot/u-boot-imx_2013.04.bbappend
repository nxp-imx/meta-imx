
SRCBRANCH = "imx_v2013.04_3.10.17_1.0.0_ga"
SRC_URI = "git://${FSL_ARM_GIT_SERVER}/uboot-imx.git;protocol=git;branch=${SRCBRANCH}"
SRCREV = "738fa47255b9d8becc09df38178da175c2fc0527"

# save UBOOT_CONFIG as separate names
do_deploy_append() {
    install ${S}/${UBOOT_BINARY} ${DEPLOYDIR}/${UBOOT_IMAGE}_${UBOOT_CONFIG}
}
