# Copyright (C) 2015 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-fsl/images/imx-image-multimedia.bb

inherit populate_sdk_qt6

CONFLICT_DISTRO_FEATURES = "directfb"

IMAGE_INSTALL += " \
    curl \
    packagegroup-imx-ml \
    packagegroup-qt6-imx \
    tzdata \
    ${IMAGE_INSTALL_OPENCV} \
    ${IMAGE_INSTALL_PARSEC}"

IMAGE_INSTALL_OPENCV              = ""
IMAGE_INSTALL_OPENCV:imxgpu       = "${IMAGE_INSTALL_OPENCV_PKGS}"
IMAGE_INSTALL_OPENCV:mx93-nxp-bsp = "${IMAGE_INSTALL_OPENCV_PKGS}"
IMAGE_INSTALL_OPENCV_PKGS = " \
    opencv-apps \
    opencv-samples \
    python3-opencv"

IMAGE_INSTALL_PARSEC = " \
    packagegroup-security-tpm2 \
    packagegroup-security-parsec \
    swtpm \
    softhsm \
    os-release \
    ${@bb.utils.contains('MACHINE_FEATURES', 'optee', 'optee-client optee-os', '', d)}"
