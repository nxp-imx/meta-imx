# Copyright 2023-2024 NXP
DESCRIPTION = "TensorFlow Lite Neutron Delegate"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "tensorflow-lite neutron"

require tensorflow-lite-${PV}.inc

NEUTRON_DELEGATE_SRC ?= "git://github.com/nxp-imx/tflite-neutron-delegate.git;protocol=https"
SRCBRANCH_neutron = "lf-6.6.3_1.0.0"
SRCREV_neutron = "f6ed0fc8ebea2980b28f54658a9c79e757508a0e"

SRCREV_FORMAT = "neutron_tf"

SRC_URI = "${NEUTRON_DELEGATE_SRC};branch=${SRCBRANCH_neutron};name=neutron \
           ${TENSORFLOW_LITE_SRC};branch=${SRCBRANCH_tf};name=tf;destsuffix=tfgit \
"

S = "${WORKDIR}/git"

inherit python3native cmake

EXTRA_OECMAKE = "-DCMAKE_SYSROOT=${PKG_CONFIG_SYSROOT_DIR}"
EXTRA_OECMAKE += " \
     -DFETCHCONTENT_FULLY_DISCONNECTED=OFF \
     -DFETCHCONTENT_SOURCE_DIR_TENSORFLOW=${WORKDIR}/tfgit \
     -DTFLITE_LIB_LOC=${STAGING_DIR_HOST}${libdir}/libtensorflow-lite.so \
     ${S} \
"

CXXFLAGS += "-fPIC"

do_configure[network] = "1"
do_configure:prepend() {
    export HTTP_PROXY=${http_proxy}
    export HTTPS_PROXY=${https_proxy}
    export http_proxy=${http_proxy}
    export https_proxy=${https_proxy}

    # There is no Fortran compiler in the toolchain, but bitbake sets this variable anyway
    # with unavailable binary.
    export FC=""
}

do_install() {
    # install libraries
    install -d ${D}${libdir}
    for lib in ${B}/lib*.so*
    do
        cp --no-preserve=ownership -d $lib ${D}${libdir}
    done
}

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

# Output library is unversioned
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

COMPATIBLE_MACHINE = "(mx95-nxp-bsp)"
