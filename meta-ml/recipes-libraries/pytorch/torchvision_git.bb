SUMMARY = "The torchvision package consists of popular datasets, model architectures, and common image transformations for computer vision."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a9ac7eab1246f4785ebb6e1dd18d5ffc"

DEPENDS = "python3 python3-pip-native python3-wheel-native"
RDEPENDS_${PN} += "pytorch python3-numpy python3-future python3-pillow"

PV = "0.6.0"

TORCHVISION_SRC ?= "git://bitbucket.sw.nxp.com/eiqcloud/pytorch-release.git;protocol=ssh"
SRCBRANCH = "master"
SRCREV = "be32d33c94af19229c2536a12154c6d40e1d7229"

SRC_URI = " \
    ${TORCHVISION_SRC};branch=${SRCBRANCH} \
"
inherit python3native

S = "${WORKDIR}/git"

do_install(){
    install -d ${D}/${PYTHON_SITEPACKAGES_DIR}

    ${STAGING_BINDIR_NATIVE}/pip3 install --disable-pip-version-check -v \
        -t ${D}/${PYTHON_SITEPACKAGES_DIR} --no-cache-dir --no-deps \
        ${S}/whl/torchvision-*.whl
    rm -fr ${D}${PYTHON_SITEPACKAGES_DIR}/bin
}

FILES_${PN} += "${libdir}/python*"
