
SRC_URI = "git://${FSL_ARM_GIT_SERVER}/uboot-imx.git;protocol=git;branch=imx_v2013.04_3.10.17_1.0.0_beta"

SRCREV = "2013c87b86e1c493270dc7d810adff821331abfb"

# save UBOOT_CONFIG as separate names
do_deploy_append() {
    install ${S}/${UBOOT_BINARY} ${DEPLOYDIR}/${UBOOT_IMAGE}-${UBOOT_CONFIG}
}
