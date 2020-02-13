SUMMARY = "Python Wrapper for armnn"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://licences.txt;md5=7b94dcac13999be0b219832a72afef36"

DEPENDS = "python3 python3-pip-native python3-wheel-native"

PV = "19.08"

PYARMNN_SRC ?= "git://source.codeaurora.org/external/imx/pyarmnn-release.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "f25fe31527db043acebb611f617b925d2c7253a6"

SRC_URI = " \
    ${PYARMNN_SRC};branch=${SRCBRANCH} \
"
inherit python3native

S = "${WORKDIR}/git"

RDEPENDS_${PN} += "armnn protobuf"

do_install(){
	# Install wheel file
	install -d ${D}/${PYTHON_SITEPACKAGES_DIR}
	${STAGING_BINDIR_NATIVE}/pip3 install --disable-pip-version-check -v \
	    -t ${D}/${PYTHON_SITEPACKAGES_DIR} --no-cache-dir --no-deps \
	    ${S}/whl/pyarmnn-*.whl
}

FILES_${PN} += "${libdir}/python*"
