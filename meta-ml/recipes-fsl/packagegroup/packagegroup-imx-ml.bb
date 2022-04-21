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
    nnstreamer-protobuf \
    nnstreamer-python3 \
    nnstreamer-tensorflow-lite \
"

ML_NNSTREAMER_PKGS = ""
ML_NNSTREAMER_PKGS:mx8-nxp-bsp:imxgpu = "${ML_NNSTREAMER_PKGS_LIST}"

ML_PKGS            = ""
ML_PKGS:mx8-nxp-bsp:imxgpu = " \
    tensorflow-lite \
    tensorflow-lite-vx-delegate \
    onnxruntime \
    ml-security \
    pytorch \
    torchvision \
"
ML_PKGS:mx8ulp-nxp-bsp = " \
    tensorflow-lite \
    onnxruntime \
    pytorch \
    torchvision \
"
ML_PKGS:remove:mx8mm-nxp-bsp = "tensorflow-lite-vx-delegate"

ML_DEEPVIEW_PKGS                    = ""
ML_DEEPVIEW_PKGS:mx8-nxp-bsp:imxgpu = "deepview-rt-examples"
ML_DEEPVIEW_PKGS:mx8mm-nxp-bsp      = ""

ML_TVM_PKGS                    = ""
ML_TVM_PKGS:mx8-nxp-bsp:imxgpu = "tvm"
ML_TVM_PKGS:mx8mm-nxp-bsp      = ""

RDEPENDS:${PN} = " \
    ${ML_PKGS} \
    ${ML_DEEPVIEW_PKGS} \
    ${ML_TVM_PKGS} \
    ${ML_NNSTREAMER_PKGS} \
"
