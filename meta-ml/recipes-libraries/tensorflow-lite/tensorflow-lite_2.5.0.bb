# Copyright 2020-2021 NXP
DESCRIPTION = "TensorFlow Lite C++ Library"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5131e32d71a4eb06326ea1772d0de6fd"

DEPENDS = "python3-numpy-native python3-pip-native python3-pybind11-native python3-wheel-native unzip-native \
    python3 tensorflow-protobuf jpeg zlib"


TENSORFLOW_LITE_SRC ?= "git://github.com/nxp-imx/tensorflow-imx.git;protocol=https"
SRCBRANCH = "lf-5.10.52_2.1.0"

SRC_URI = "${TENSORFLOW_LITE_SRC};branch=${SRCBRANCH}"
SRCREV = "53686a2ad172f3f77c65d66ed0ac69ea13d55fb6"

SRC_URI += "https://storage.googleapis.com/download.tensorflow.org/models/mobilenet_v1_2018_08_02/mobilenet_v1_1.0_224_quant.tgz;name=model-mobv1"
SRC_URI[model-mobv1.md5sum] = "36af340c00e60291931cb30ce32d4e86"
SRC_URI[model-mobv1.sha256sum] = "d32432d28673a936b2d6281ab0600c71cf7226dfe4cdcef3012555f691744166"

SRC_URI += " file://0001-vx-delegate-CMakeLists.txt-Fix-TIM_VX-library-path.patch"

S = "${WORKDIR}/git"

inherit python3native cmake

PACKAGECONFIG_OPENVX = ""
PACKAGECONFIG_OPENVX_imxgpu3d_mx8 = "openvx"
PACKAGECONFIG_OPENVX_mx8mm = ""
PACKAGECONFIG_OPENVX_mx8ulp = ""

PACKAGECONFIG ?= "${PACKAGECONFIG_OPENVX}"

PACKAGECONFIG[openvx] = "-DTFLITE_ENABLE_VX=on -DTIM_VX_INSTALL=${STAGING_DIR_HOST}/usr,-DTFLITE_ENABLE_VX=off,tim-vx,libnn-imx nn-imx"

EXTRA_OECMAKE = "-DCMAKE_SYSROOT=${PKG_CONFIG_SYSROOT_DIR}"
EXTRA_OECMAKE += "-DTFLITE_PYTHON_WRAPPER_BUILD_CMAKE2=on -DTFLITE_ENABLE_XNNPACK=on -DTFLITE_ENABLE_RUY=on -DTFLITE_ENABLE_NNAPI=on -DTFLITE_BUILD_EVALTOOLS=on -DTFLITE_BUILD_SHARED_LIB=on -DTFLITE_ENABLE_NNAPI_VERBOSE_VALIDATION=on ${S}/tensorflow/lite/"

CXXFLAGS += "-fPIC"

do_configure_prepend() {
    export HTTP_PROXY=${http_proxy}
    export HTTPS_PROXY=${https_proxy}
    export http_proxy=${http_proxy}
    export https_proxy=${https_proxy}
}


do_compile_append () {
    # build pip package
      cd ${B}
      CI_BUILD_PYTHON=${PYTHON} BUILD_NUM_JOBS=8 ${S}/tensorflow/lite/tools/pip_package/build_pip_package_with_cmake2.sh ${TARGET_ARCH}
}

do_install() {
    # install libraries
    install -d ${D}${libdir}
    for lib in ${B}/lib*.so*
    do
        cp --no-preserve=ownership -d $lib ${D}${libdir}
    done

    # install header files
    install -d ${D}${includedir}/tensorflow/lite
    cd ${S}/tensorflow/lite
    cp --parents \
        $(find . -name "*.h*") \
        ${D}${includedir}/tensorflow/lite

    # install version.h from core
    install -d ${D}${includedir}/tensorflow/core/public
    cp ${S}/tensorflow/core/public/version.h ${D}${includedir}/tensorflow/core/public

    # install examples
    install -d ${D}${bindir}/${PN}-${PV}/examples
    install -m 0555 ${B}/examples/label_image/label_image ${D}${bindir}/${PN}-${PV}/examples
    install -m 0555 ${B}/tools/benchmark/benchmark_model ${D}${bindir}/${PN}-${PV}/examples
    install -m 0555 ${B}/coco_object_detection_run_eval ${D}${bindir}/${PN}-${PV}/examples
    install -m 0555 ${B}/imagenet_image_classification_run_eval ${D}${bindir}/${PN}-${PV}/examples
    install -m 0555 ${B}/inference_diff_run_eval ${D}${bindir}/${PN}-${PV}/examples

    # install label_image data
    cp ${S}/tensorflow/lite/examples/label_image/testdata/grace_hopper.bmp ${D}${bindir}/${PN}-${PV}/examples
    cp ${S}/tensorflow/lite/java/ovic/src/testdata/labels.txt ${D}${bindir}/${PN}-${PV}/examples


    # Install python example
    cp ${S}/tensorflow/lite/examples/python/label_image.py ${D}${bindir}/${PN}-${PV}/examples

    # Install mobilenet tflite file
    cp ${WORKDIR}/mobilenet_*.tflite ${D}${bindir}/${PN}-${PV}/examples

    # Install pip package
    install -d ${D}/${PYTHON_SITEPACKAGES_DIR}
    ${STAGING_BINDIR_NATIVE}/pip3 install --disable-pip-version-check -v \
        -t ${D}/${PYTHON_SITEPACKAGES_DIR} --no-cache-dir --no-deps \
        ${B}/tflite_pip/dist/tflite_runtime-*.whl
}

RDEPENDS_${PN}   = " \
    flatbuffers \
    python3 \
    python3-numpy \
"
# TensorFlow and TensorFlow Lite both exports few files, suppres the error
# SSTATE_DUPWHITELIST = "${D}${includedir}"
SSTATE_DUPWHITELIST = "/"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

INSANE_SKIP_${PN} += " \
    already-stripped \
    staticdev \
"

FILES_${PN} += "${libdir}/python*"
