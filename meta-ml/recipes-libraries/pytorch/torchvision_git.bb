# Copyright 2020-2021 NXP
SUMMARY = "The torchvision package consists of popular datasets, model architectures, and common image transformations for computer vision."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9c57cfb31165de565a47b65b896391c2"

DEPENDS = "python3 python3-pip-native python3-wheel-native"
RDEPENDS:${PN} += "pytorch python3-numpy python3-future python3-pillow libjpeg-turbo libswscale libswresample libavutil libavcodec libavformat"

PV = "0.15.1"
PYV = "cp311"

PYTORCH_SRC ?= "git://github.com/nxp-imx/pytorch-release.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "b9efb9490cc06a5907c43453493c738d4647f74a"

SRC_URI = " \
    ${PYTORCH_SRC};branch=${SRCBRANCH} \
"
inherit python3native

S = "${WORKDIR}/git"

do_install(){
    install -d ${D}/${PYTHON_SITEPACKAGES_DIR}

    ${STAGING_BINDIR_NATIVE}/pip3 install --disable-pip-version-check -v --platform linux_${TARGET_ARCH} \
        -t ${D}/${PYTHON_SITEPACKAGES_DIR} --no-cache-dir --no-deps \
        ${S}/whl/torchvision-${PV}-${PYV}*.whl
    rm -fr ${D}${PYTHON_SITEPACKAGES_DIR}/bin
}

FILES:${PN} += "${libdir}/python*"
