SUMMARY = "Python Wrapper for armnn"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7b94dcac13999be0b219832a72afef36"

DEPENDS = "python3 python3-pip-native python3-wheel-native"

PV = "20.02"

PYARMNN_SRC ?= "git://github.com/nxpmicro/pyarmnn-release.git;protocol=https"
SRCBRANCH = "imx_20.02"

SRCREV = "89371577c8fb16fd1bd5f73ff917ecc253f4c761"

SRC_URI = " \
    ${PYARMNN_SRC};branch=${SRCBRANCH} \
"
inherit python3native

S = "${WORKDIR}/git"

RDEPENDS_${PN} += "armnn protobuf python3-pillow python3-pip python3-requests python3-numpy"

do_install(){
	# Install examples
	install -d ${D}${bindir}/armnn-${PV}/examples
	for example in ${S}/python/pyarmnn/examples/*
	do
	    install -m 0555 $example ${D}${bindir}/armnn-${PV}/examples
	done

	# Install wheel file
	install -d ${D}/${PYTHON_SITEPACKAGES_DIR}
	${STAGING_BINDIR_NATIVE}/pip3 install --disable-pip-version-check -v \
	    -t ${D}/${PYTHON_SITEPACKAGES_DIR} --no-cache-dir --no-deps \
	    ${S}/whl/pyarmnn-20.2.0-cp37-cp37m-linux_aarch64.whl
}

FILES_${PN} += "${libdir}/python*"
