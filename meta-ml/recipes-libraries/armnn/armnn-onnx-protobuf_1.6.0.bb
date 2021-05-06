# Copyright 2020-2021 NXP
SUMMARY = "ONNX protobuf files - used in Arm NN for ONNX parser"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=efff5c5110f124a1e2163814067b16e7"

SRC_URI = "git://github.com/onnx/onnx.git;branch=rel-1.6.0"
SRCREV = "553df22c67bee5f0fe6599cff60f1afc6748c635"
DEPENDS = "protobuf-native"

inherit cmake

S = "${WORKDIR}/git"

do_configure[noexec] = "1"

do_compile() {
    ${STAGING_BINDIR_NATIVE}/protoc \
    ${S}/onnx/onnx.proto \
    --proto_path=${S} \
    --proto_path=${STAGING_INCDIR_NATIVE} \
    --cpp_out ${S}
}

do_install() {
    install -d ${D}${datadir}/${BPN}/onnx/
    for file in ${S}/onnx/onnx.pb.*
    do
        install -m 0644 $file ${D}${datadir}/${BPN}/onnx/
    done
}
