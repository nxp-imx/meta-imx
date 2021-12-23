# Copyright 2020-2021 NXP
SUMMARY = "Tensors and Dynamic neural networks in Python with strong GPU acceleration"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9c57cfb31165de565a47b65b896391c2"

DEPENDS = "python3 python3-pip-native python3-wheel-native"
RDEPENDS:${PN} += "python3-core python3-numpy python3-future python3-typing-extensions"

PV = "1.9.1"
PYV = "cp39"

PYTORCH_SRC ?= "git://github.com/nxpmicro/pytorch-release.git;protocol=https"
SRCBRANCH = "lf-5.15.5_1.0.0"
SRCREV = "753daeef9a16f95dc3acb56e5339ccc4fabdef5e" 

SRC_URI = " \
    ${PYTORCH_SRC};branch=${SRCBRANCH} \
"
inherit python3native

S = "${WORKDIR}/git"

do_install(){
    install -d ${D}/${PYTHON_SITEPACKAGES_DIR}
    install -d ${D}${bindir}
    install -d ${D}${bindir}/${PN}/examples

    install -m 0555 ${S}/examples/* ${D}${bindir}/${PN}/examples
    install -m 0555 ${S}/src/build.sh ${D}${bindir}/${PN}/

    ${STAGING_BINDIR_NATIVE}/pip3 install --disable-pip-version-check -v --platform linux_${TARGET_ARCH} \
        -t ${D}/${PYTHON_SITEPACKAGES_DIR} --no-cache-dir --no-deps \
        ${S}/whl/torch-${PV}-${PYV}*.whl

    for app in `ls ${D}${PYTHON_SITEPACKAGES_DIR}/bin/*`; do
        sed -i 's,^#!.*,#!/usr/bin/python3,g' $app
        mv $app ${D}${bindir}
    done

    rm -fr ${D}${PYTHON_SITEPACKAGES_DIR}/bin
    rm -fr ${D}${PYTHON_SITEPACKAGES_DIR}/torch/bin/test_cpp_rpc
}

FILES:${PN} += "${libdir}/python*"
