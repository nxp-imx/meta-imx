# Copyright 2019-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Add packages for AI/ML build"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

ML_NNSTREAMER_PKGS_LIST = " \
    nnshark \
    nnstreamer \
    nnstreamer-armnn \
    nnstreamer-protobuf \
    nnstreamer-python3 \
    nnstreamer-tensorflow-lite \
"

ML_NNSTREAMER_PKGS = ""
ML_NNSTREAMER_PKGS:imxgpu:mx8 = "${ML_NNSTREAMER_PKGS_LIST}"

ML_PKGS            = ""
ML_PKGS:imxgpu:mx8 = " \
    armnn \
    tensorflow-lite \
    tensorflow-lite-vx-delegate \
    onnxruntime \
    ml-security \
    pytorch \
    torchvision \
"
ML_PKGS:mx8ulp = " \
    armnn \
    tensorflow-lite \
    onnxruntime \
    pytorch \
    torchvision \
"
ML_PKGS:remove:mx8mm = "tensorflow-lite-vx-delegate"

ML_DEEPVIEW_PKGS            = ""
ML_DEEPVIEW_PKGS:imxgpu:mx8 = "deepview-rt-examples"
ML_DEEPVIEW_PKGS:mx8mm      = ""

ML_EIQ_PKGS       = ""
ML_EIQ_PKGS:mx8mm = " \
    eiq-apps \
"
ML_EIQ_PKGS:mx8mp = " \
    eiq-apps \
"

ML_TVM_PKGS            = ""
ML_TVM_PKGS:imxgpu:mx8 = "tvm"
ML_TVM_PKGS:mx8mm      = ""

RDEPENDS:${PN} = " \
    ${ML_PKGS} \
    ${ML_DEEPVIEW_PKGS} \
    ${ML_EIQ_PKGS} \
    ${ML_TVM_PKGS} \
    ${ML_NNSTREAMER_PKGS} \
"
