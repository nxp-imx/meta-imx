
SRCBRANCH = "imx_v2013.04_3.10.31_1.1.0_alpha"
SRC_URI = "git://${FSL_ARM_GIT_SERVER}/uboot-imx.git;protocol=git;branch=${SRCBRANCH}"
SRCREV = "e8782fdd1c96a2c155f64db150fcb3bff6abed1a"

# save UBOOT_CONFIG as separate names
do_deploy_append() {
    install ${S}/${UBOOT_BINARY} ${DEPLOYDIR}/${UBOOT_IMAGE}_${UBOOT_CONFIG}
}
