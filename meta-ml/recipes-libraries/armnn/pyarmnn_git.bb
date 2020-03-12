SUMMARY = "Python Wrapper for armnn"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://licences.txt;md5=7b94dcac13999be0b219832a72afef36"

DEPENDS = "python3 python3-pip-native python3-wheel-native"

PV = "19.08"

PYARMNN_SRC ?= "git://github.com/nxpmicro/pyarmnn-release.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "9cb28c0451db9aa1acae1df5be286bbed089782a"

SRC_URI = " \
    ${PYARMNN_SRC};branch=${SRCBRANCH} \
"
inherit python3native

S = "${WORKDIR}/git"

RDEPENDS_${PN} += "armnn protobuf python3-pillow python3-pip python3-requests python3-numpy"

do_install(){
	# Install examples
	install -d ${D}${bindir}/armnn-${PV}/examples
	for example in ${S}/examples/*
	do
	    install -m 0555 $example ${D}${bindir}/armnn-${PV}/examples
	done

	# Install wheel file
	install -d ${D}/${PYTHON_SITEPACKAGES_DIR}
	${STAGING_BINDIR_NATIVE}/pip3 install --disable-pip-version-check -v \
	    -t ${D}/${PYTHON_SITEPACKAGES_DIR} --no-cache-dir --no-deps \
	    ${S}/whl/pyarmnn-*.whl
}

FILES_${PN} += "${libdir}/python*"
