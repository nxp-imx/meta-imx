# Copyright 2019-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Add packages for AI/ML build"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PACKAGE_ARCH = "${TUNE_PKGARCH}"

inherit packagegroup

ML_NNSTREAMER_PKGS_LIST = " \
    nnshark \
    nnstreamer \
    nnstreamer-deepview-rt \
    nnstreamer-protobuf \
    nnstreamer-python3 \
    nnstreamer-tensorflow-lite \
"

ML_NNSTREAMER_PKGS = ""
ML_NNSTREAMER_PKGS:mx8-nxp-bsp:imxgpu = "${ML_NNSTREAMER_PKGS_LIST} nnstreamer-tvm"
ML_NNSTREAMER_PKGS:mx8mm-nxp-bsp      = "${ML_NNSTREAMER_PKGS_LIST}"

# These packages don't require any acceleration
ML_PKGS            = ""
ML_PKGS:mx8-nxp-bsp = " \
    deepview-rt-examples \
    onnxruntime-tests \
    tensorflow-lite \
    torchvision \
"
ML_PKGS:mx9-nxp-bsp = " \
    deepview-rt-examples \
    onnxruntime-tests \
    tensorflow-lite \
    torchvision \
"
# These packages require acceleration, which currently maps to
# all SOCs with GPU except for 8M Mini
ML_ACCELERATED_PKGS                    = ""
ML_ACCELERATED_PKGS:mx8-nxp-bsp:imxgpu = " \
    tensorflow-lite-vx-delegate \
    tvm \
"
ML_ACCELERATED_PKGS:mx8mm-nxp-bsp      = ""

RDEPENDS:${PN} = " \
    ${ML_PKGS} \
    ${ML_ACCELERATED_PKGS} \
    ${ML_NNSTREAMER_PKGS} \
"
