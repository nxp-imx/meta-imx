# Copyright 2019 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Add packages for AI/ML build"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

ML_PKGS = " \
    armnn \
    pyarmnn \
    tensorflow-lite \
    onnxruntime \
    ml-security \
    pytorch \
    torchvision \
"
RDEPENDS_${PN} = " \
    ${ML_PKGS} \
"
