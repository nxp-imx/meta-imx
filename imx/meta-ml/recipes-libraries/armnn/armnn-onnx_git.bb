SUMMARY = "ONNX protobuf files - used in ARMNN for Caffe network models"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=077ce3eaeaea91462d41c566300d2a02"

SRC_URI = "git://github.com/onnx/onnx.git"

PV = "1.3.0"

SRCREV = "bae6333e149a59a3faa9c4d9c44974373dcf5256"

DEPENDS = "protobuf-native"

inherit cmake

S = "${WORKDIR}/git"

do_install() {
    install -d ${D}${datadir}/${BPN}/onnx/
    for file in ${B}/onnx/*
    do
        install -m 0644 $file ${D}${datadir}/${BPN}/onnx/
    done

}
