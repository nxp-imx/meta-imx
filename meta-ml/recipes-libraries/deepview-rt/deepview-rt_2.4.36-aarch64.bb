DESCRIPTION = "This package includes the updated and experimental ModelRunner for TensorFlow Lite and ARM NN. Also in this repository is a pre-release of DeepViewRT with support for the OpenVX backend."

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "aebbce8db9a26b2f4c94512833d8798e"
SRC_URI[sha256sum] = "70b7ebbfb516ddd46fd9f64abb46142c1af1f958ef77d4f21698bbc3a2927b64"

S = "${WORKDIR}/${BPN}-${PV}"

inherit fsl-eula-unpack python3native

DEPENDS = "python3 python3-pip-native opencv"

RDEPENDS_MX8       = ""
RDEPENDS_MX8:mx8   = "nn-imx"
RDEPENDS_MX8:mx8mm = ""
RDEPENDS_MX8:mx8mnul = ""
RDEPENDS_MX8:mx8mpul = ""
RDEPENDS_MX8:mx8ulp = ""
RDEPENDS:${PN} += " ${RDEPENDS_MX8} "

IS_RM_OVXRTM  = ""
IS_RM_OVXRTM:mx8mm =  "1"
IS_RM_OVXRTM:mx8mnul =  "1"
IS_RM_OVXRTM:mx8mpul =  "1"
IS_RM_OVXRTM:mx8ulp =  "1"

do_install () {
    install -d ${D}${bindir}
    install -d ${D}${libdir}
    install -d ${D}${includedir}
    install -d ${D}/${PYTHON_SITEPACKAGES_DIR}

    cp -fr   ${S}/modelrunner/bin/* ${D}${bindir}
    cp -frP  ${S}/modelrunner/lib/* ${D}${libdir}
    if [ ${IS_RM_OVXRTM} = "1" ]  
    then
      rm -fr  ${D}${libdir}/libovx-rtm.so
    fi
    cp -frP  ${S}/${BPN}/lib/* ${D}${libdir}
    cp -fr   ${S}/${BPN}/include/* ${D}${includedir}
 
    ${STAGING_BINDIR_NATIVE}/pip3 install --disable-pip-version-check -v \
        -t ${D}/${PYTHON_SITEPACKAGES_DIR} --no-cache-dir --no-deps \
        ${S}/whl/deepview_rt-*.whl

    chown -R root:root "${D}"
}

FILES:${PN} += " \
    ${libdir}/* \
"

FILES_SOLIBSDEV = ""

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_SYSROOT_STRIP = "1"

INSANE_SKIP:${PN} += "dev-so dev-deps ldflags"

COMPATIBLE_MACHINE = "(mx8)"
BBCLASSEXTEND = "nativesdk"
