SUMMARY = "Tensorflow protobuf files - used in ARMNN for Tensorflow network models"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=64a34301f8e355f57ec992c2af3e5157"

SRC_URI = " \
    git://github.com/tensorflow/tensorflow.git;branch=r1.15;name=tensorflow \
    git://github.com/ARM-software/armnn.git;branch=branches/armnn_20_02;name=armnn;subdir=${WORKDIR}/armnn;destsuffix=armnn \
"
PV = "1.15.0"

SRCREV_tensorflow = "590d6eef7e91a6a7392c8ffffb7b58f2e0c8bc6b"
SRCREV_armnn = "8c3259fa007d43fcc5ea56fe6928526dbe79f3c0"
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

FILES_${PN} += "${datadir}"
