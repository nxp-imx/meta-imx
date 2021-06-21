DESCRIPTION = "This package includes the updated and experimental ModelRunner for TensorFlow Lite and ARM NN. Also in this repository is a pre-release of DeepViewRT with support for the OpenVX backend."

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=f35df765ff17e69043ea21f350e3229c"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "97312789878207dedd7636a36a4772d6"
SRC_URI[sha256sum] = "640af9ce248d2974318b63aa6bd9f6069f710d9bc9ecf4d76fc34ca5ad19db14"

S = "${WORKDIR}/${BPN}-${PV}"

inherit fsl-eula-unpack python3native

DEPENDS = "python3 python3-pip-native opencv"
RDEPENDS_${PN} += "nn-imx"

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

FILES_SOLIBSDEV = ""

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_SYSROOT_STRIP = "1"

INSANE_SKIP_${PN} += "dev-so dev-deps ldflags"

COMPATIBLE_MACHINE = "(mx8)"
COMPATIBLE_MACHINE_mx8mm = "(^$)"
COMPATIBLE_MACHINE_mx8mnlite = "(^$)"
BBCLASSEXTEND = "nativesdk"
