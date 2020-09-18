DESCRIPTION = "TensorFlow Lite C++ Library"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=64a34301f8e355f57ec992c2af3e5157"

DEPENDS = "zlib unzip-native swig-native python3 python3-numpy-native python3-pip-native python3-wheel-native"

TENSORFLOW_LITE_SRC ?= "git://source.codeaurora.org/external/imx/tensorflow-imx.git;protocol=https"
SRCBRANCH = "imx_5.4.47_2.2.0"

SRC_URI = "${TENSORFLOW_LITE_SRC};branch=${SRCBRANCH}"

SRCREV = "8828092b9dfef251b4bea82a771570b4975c2d6e"

SRC_URI += "https://storage.googleapis.com/download.tensorflow.org/models/mobilenet_v1_2018_08_02/mobilenet_v1_1.0_224_quant.tgz;name=model-mobv1"
SRC_URI[model-mobv1.md5sum] = "36af340c00e60291931cb30ce32d4e86"
SRC_URI[model-mobv1.sha256sum] = "d32432d28673a936b2d6281ab0600c71cf7226dfe4cdcef3012555f691744166"

inherit python3native

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

do_compile_append () {
    # build pip package
    export PYTHONPATH="${STAGING_LIBDIR_NATIVE}/${PYTHON_DIR}/site-packages"
    export PIP_BUILD_ROOT="${WORKDIR}"
    export TENSORFLOW_TARGET="${TARGET_ARCH}"
    chmod +x ${S}/tensorflow/lite/tools/pip_package/build_pip_package.sh
    ${S}/tensorflow/lite/tools/pip_package/build_pip_package.sh
}

do_install() {
    # install libraries
    install -d ${D}${libdir}
    for lib in ${S}/tensorflow/lite/tools/make/gen/linux_${TARGET_ARCH}/lib/*
    do
        install -m 0555 $lib ${D}${libdir}
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
    for example in ${S}/tensorflow/lite/tools/make/gen/linux_${TARGET_ARCH}/bin/*
    do
        install -m 0555 $example ${D}${bindir}/${PN}-${PV}/examples
    done

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
        ${WORKDIR}/tflite_pip/dist/tflite_runtime-*.whl
}

RDEPENDS_MX8       = ""
RDEPENDS_MX8_mx8   = "libnn-imx nn-imx"
RDEPENDS_MX8_mx8mm = ""
RDEPENDS_${PN}   = " \
    flatbuffers \
    python3 \
    python3-numpy \
    ${RDEPENDS_MX8} \
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
