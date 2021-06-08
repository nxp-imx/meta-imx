DESCRIPTION = "This package includes the updated and experimental ModelRunner for TensorFlow Lite and ARM NN. Also in this repository is a pre-release of DeepViewRT with support for the OpenVX backend."

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=417b82f17fc02b88125331ed312f6f1b"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "b705045e7eb2c31b396fb582f169fecb"
SRC_URI[sha256sum] = "de344d462f70d21b00dfd3375ce11ed05cacf917164a1410a4ce486c040587ea"

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
