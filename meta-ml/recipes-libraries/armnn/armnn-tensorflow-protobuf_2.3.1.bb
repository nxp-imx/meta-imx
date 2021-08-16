# Copyright 2020-2021 NXP
SUMMARY = "TensorFlow and TensorFlow Lite protobuf files - used in Arm NN for TensorFlow and TensorFlow Lite parsers"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=64a34301f8e355f57ec992c2af3e5157"

SRC_URI = " \
    git://github.com/tensorflow/tensorflow.git;branch=r2.3;name=tensorflow \
    git://github.com/ARM-software/armnn.git;branch=branches/armnn_21_02;name=armnn;subdir=${WORKDIR}/armnn;destsuffix=armnn \
"

SRCREV_tensorflow = "fcc4b966f1265f466e82617020af93670141b009"
SRCREV_armnn = "bc9b09801fcb9489c3742cf4691c39c050cbfbc4"
SRCREV_FORMAT = "tensorflow"

DEPENDS = " \
        protobuf-native \
        flatbuffers \
"

S = "${WORKDIR}/git"

do_install() {
    # Install TF sources + build artifacts as reuired by ARMNN
    install -d ${D}${datadir}/${BPN}

    # Convert protobuf sources to C sources and install
    ${WORKDIR}/armnn/scripts/generate_tensorflow_protobuf.sh ${D}${datadir}/${BPN} ${STAGING_DIR_NATIVE}${prefix}

    # Install sources as required by ARMNN
    install -d ${D}${datadir}/${BPN}-lite
    for file in ${S}/tensorflow/lite/schema/*
    do
        [ -f $file ] && install -m 0644 $file ${D}${datadir}/${BPN}-lite
    done
}

FILES:${PN} += "${datadir}"
