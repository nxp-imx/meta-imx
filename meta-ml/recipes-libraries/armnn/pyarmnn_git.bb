SUMMARY = "Python Wrapper for armnn"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7b94dcac13999be0b219832a72afef36"

DEPENDS = "python3 python3-pip-native python3-wheel-native"

PV = "20.08"

PYARMNN_SRC ?= "git://github.com/nxpmicro/pyarmnn-release.git;protocol=https"
SRCBRANCH = "imx_20.08"

SRCREV = "31188064528e9f5de9626ecb2d0c210c88be32f2" 

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
	    ${S}/whl/pyarmnn-22.0.0-cp38-cp38-linux_aarch64.whl
}

FILES_${PN} += "${libdir}/python*"
