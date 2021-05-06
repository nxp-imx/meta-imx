# Copyright 2021 NXP
SUMMARY = "TensorFlow Lite used by TF Lite Delegate for Arm NN"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=64a34301f8e355f57ec992c2af3e5157"

DEPENDS = "flatbuffers zlib unzip-native"

SRC_URI = " \
    git://source.codeaurora.org/external/imx/tensorflow-imx.git;branch=imx_5.4.70_2.3.0;protocol=https;name=tensorflow \
    git://github.com/ARM-software/armnn.git;branch=branches/armnn_21_02;name=armnn;destsuffix=armnn \
"

SRCREV_tensorflow = "afa81316fd3a4512d7998627ae8372acb55650f3"
SRCREV_armnn = "bc9b09801fcb9489c3742cf4691c39c050cbfbc4"
SRCREV_FORMAT = "tensorflow_armnn"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = "'TARGET_ARCH=${TARGET_ARCH}' 'CXX=${CXX}' 'CC=${CC}' 'AR=${AR}'"

do_configure() {

    export HTTP_PROXY=${http_proxy}
    export HTTPS_PROXY=${https_proxy}
    export http_proxy=${http_proxy}
    export https_proxy=${https_proxy}

    ${S}/tensorflow/lite/tools/make/download_dependencies.sh

    # Create Makefile in repo root so we can use do_compile command 'as-is'
    echo "include tensorflow/lite/tools/make/Makefile" > Makefile
}

do_install() {  
    # install libraries
    install -d ${D}${datadir}/${BPN}
    for lib in ${S}/tensorflow/lite/tools/make/gen/linux_${TARGET_ARCH}/lib/*
    do
        install -m 0555 $lib ${D}${datadir}/${BPN}
    done
    
    # install header files
    install -d ${D}${datadir}/${BPN}/tensorflow/lite
    cd ${S}/tensorflow/lite
    cp --parents \
        $(find . -name "*.h*") \
        ${D}${datadir}/${BPN}/tensorflow/lite

    # install version.h from core
    install -d ${D}${datadir}/${BPN}/tensorflow/core/public
    cp ${S}/tensorflow/core/public/version.h ${D}${datadir}/${BPN}/tensorflow/core/public    
}

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

INSANE_SKIP_${PN} += " \
    already-stripped \
    staticdev \
"
