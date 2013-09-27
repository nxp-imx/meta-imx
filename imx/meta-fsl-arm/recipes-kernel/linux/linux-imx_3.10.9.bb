# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

COMPATIBLE_MACHINE = "(mx6)"

SRC_URI = "git://${FSL_ARM_GIT_SERVER}/linux-2.6-imx.git;protocol=git;branch=imx_3.10.9_1.0.0_alpha"

SRCREV = "${AUTOREV}"

# 3.10.9-1.0.0 rc1 commit
#SRCREV = "dbf364b3d0123e5328ae28455c57e588635232c7"

LOCALVERSION = "-1.0.0_alpha"

IMX_TEST_SUPPORT = "y"

do_configure_prepend() {
    echo " Internal Kernel build - copy latest defconfig"
    cp ${S}/arch/arm/configs/imx_v7_defconfig ${S}/.config
    cp ${S}/arch/arm/configs/imx_v7_defconfig ${S}/../defconfig
}

do_configure_append() {
    kernel_conf_variable LOCALVERSION "\"${LOCALVERSION}\""
    kernel_conf_variable LOCALVERSION_AUTO y

    # Add GIT revision to the local version
    head=`git rev-parse --verify --short HEAD 2> /dev/null`
    printf "+%s%s"  $head > ${S}/.scmversion
}

# copy zImage to deploy directory
do_deploy_append () {
    install -d ${DEPLOY_DIR}
    install -d ${DEPLOY_DIR}/images
    install  arch/arm/boot/zImage ${DEPLOY_DIR_IMAGE}/zImage
}

# install nedded headers for gstreamer configuration
do_install_append() {
    if [ -d include/uapi/linux ]; then
        cp include/uapi/linux/mxc*.h ${STAGING_INCDIR}/uapi
    fi
}
