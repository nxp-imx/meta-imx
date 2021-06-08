# Copyright 2019-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Add packages for AI/ML build"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

ML_PKGS = " \
    armnn \
    tensorflow-lite \
    onnxruntime \
    ml-security \
    pytorch \
    torchvision \
    tvm \
    deepview-rt-examples \
"

ML_PKGS_append_mx8mm = "eiq-apps"
ML_PKGS_append_mx8mp = "eiq-apps"

ML_PKGS_remove_mx8mm = "tvm deepview-rt-examples"
ML_PKGS_remove_mx8mnlite = "tvm deepview-rt-examples"

RDEPENDS_${PN} = " \
    ${ML_PKGS} \
"
