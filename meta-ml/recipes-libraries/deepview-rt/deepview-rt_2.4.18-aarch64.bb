DESCRIPTION = "This package includes the updated and experimental ModelRunner for TensorFlow Lite and ARM NN. Also in this repository is a pre-release of DeepViewRT with support for the OpenVX backend."

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "2bcb15d55f53ab6acae5e416f64e8a27"
SRC_URI[sha256sum] = "b8b93dad86afca8c6fee34b8bad25c0f393bdbed4e4ea3d8d2cfc3e12040ac0c"

S = "${WORKDIR}/${BPN}-${PV}"

inherit fsl-eula-unpack python3native

DEPENDS = "python3 python3-pip-native opencv"
RDEPENDS_MX8_mx8   = "nn-imx"
RDEPENDS_MX8_mx8mm = ""
RDEPENDS_${PN} += "armnn ${RDEPENDS_MX8} python3-numpy python3-pathlib2 python3-cffi python3-pycparser"
RDEPENDS_${PN}-dev += "armnn ${RDEPENDS_MX8} onnxruntime"

do_install () {
    install -d ${D}${bindir}
    install -d ${D}${libdir}
    install -d ${D}${includedir}
    install -d ${D}/${PYTHON_SITEPACKAGES_DIR}

    cp -fr   ${S}/modelrunner/bin/* ${D}${bindir}
    cp -frP  ${S}/modelrunner/lib/* ${D}${libdir}
    cp -frP  ${S}/${BPN}/lib/* ${D}${libdir}
    cp -fr   ${S}/${BPN}/include/* ${D}${includedir}
 
    ${STAGING_BINDIR_NATIVE}/pip3 install --disable-pip-version-check -v \
        -t ${D}/${PYTHON_SITEPACKAGES_DIR} --no-cache-dir --no-deps \
        ${S}/whl/deepview_rt-*.whl

    chown -R root:root "${D}"
}

FILES_${PN} += " \
    ${libdir}/* \
"

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_SYSROOT_STRIP = "1"

INSANE_SKIP_${PN} += "dev-deps ldflags"

BBCLASSEXTEND = "nativesdk"

COMPATIBLE_MACHINE = "(mx8)"
