LICENSE = "MIT"

SRC_URI = "git://${FSL_ARM_GIT_SERVER}/linux-2.6-imx.git;protocol=git;branch=imx_3.10.17"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

do_configure_prepend() {
    cp ${S}/arch/arm/configs/imx_v7_mfg_defconfig ${S}/.config
    cp ${S}/arch/arm/configs/imx_v7_mfg_defconfig ${S}/../defconfig
}

# copy zImage to deploy directory
# update uImage with defconfig ane git info in name
# this is since build script can build multiple ways
# and will overwrite previous builds

do_deploy () {
    install -d ${DEPLOY_DIR_IMAGE}

    install  arch/arm/boot/uImage ${DEPLOY_DIR_IMAGE}/uImage_mfgtool
    install  arch/arm/boot/zImage ${DEPLOY_DIR_IMAGE}/zImage_mfgtool
}
