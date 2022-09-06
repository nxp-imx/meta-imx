SUMMARY = "Open Deep Learning Compiler Stack"
DESCRIPTION = "Apache TVM (incubating) is a compiler stack for deep learning systems. \
It is designed to close the gap between the productivity-focused deep learning frameworks, \
and the performance- and efficiency-focused hardware backends. TVM works with deep learning \
frameworks to provide end to end compilation to different backends."
LICENSE = "Apache-2.0 & BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e313a9b6eda820e35716d9529001537f \
                    file://3rdparty/dlpack/LICENSE;md5=f62d4e85ba68a1574b74d97ab8dea9ab \
                    file://3rdparty/dmlc-core/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
                    file://3rdparty/rang/LICENSE;md5=911690f51af322440237a253d695d19f \
                    file://3rdparty/vta-hw/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
"

DEPENDS = "tim-vx"
RDEPENDS:${PN} = "tim-vx python3-decorator python3-numpy python3-attrs python3-psutil python3"

SRCBRANCH = "lf-5.15.32_2.0.0"
TVM_SRC ?= "git://github.com/nxp-imx/eiq-tvm-imx.git;protocol=ssh"
SRC_URI = "${TVM_SRC};branch=${SRCBRANCH}\
               git://github.com/dmlc/dlpack;protocol=https;nobranch=1;destsuffix=${S}/3rdparty/dlpack;name=dlpack \
               git://github.com/dmlc/dmlc-core;protocol=https;nobranch=1;destsuffix=${S}/3rdparty/dmlc-core;name=dmlc-core \
               git://github.com/agauniyal/rang;protocol=https;nobranch=1;destsuffix=${S}/3rdparty/rang;name=rang \
               git://github.com/apache/incubator-tvm-vta;protocol=https;nobranch=1;destsuffix=${S}/3rdparty/vta-hw;name=vta-hw \
               file://0001-tvm-CMakeLists.txt-Use-CMAKE-variables-for-libs-inst.patch \
"

SRCREV = "7042d137a6a50588363c27297e0ab57b3e7f43a8"
SRCREV_dlpack = "3ec04430e89a6834e5a1b99471f415fa939bf642"
SRCREV_dmlc-core = "6c401e242c59a1f4c913918246591bb13fd714e7"
SRCREV_rang = "cabe04d6d6b05356fa8f9741704924788f0dd762"
SRCREV_vta-hw = "87ce9acfae550d1a487746e9d06c2e250076e54c"

S = "${WORKDIR}/git"
SETUPTOOLS_SETUP_PATH = "${S}/python"

inherit setuptools3 cmake python3native

EXTRA_OECMAKE += "-DUSE_VSI_NPU=ON -DUSE_VSI_NPU_RUNTIME=ON"

do_compile:append() {
    export TVM_LIBRARY_PATH=${WORKDIR}/build/
    setuptools3_do_compile
}

do_install () {
    cmake_do_install

    install -d ${D}${bindir}/${PN}-${PV}/examples
    # Install python example
    cp ${S}/tests/python/contrib/test_vsi_npu/label_image.py ${D}${bindir}/${PN}-${PV}/examples

    setuptools3_do_install
    rm -fr ${D}${datadir}
}

INSANE_SKIP:${PN} += "dev-deps"

FILES_SOLIBSDEV = ""
FILES:${PN} = "${bindir}/* ${libdir}/*"

COMPATIBLE_MACHINE = "(mx8-nxp-bsp)"
