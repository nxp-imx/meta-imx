DESCRIPTION = "This package includes the updated and experimental ModelRunner for TensorFlow Lite and ARM NN. Also in this repository is a pre-release of DeepViewRT with support for the OpenVX backend."
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829" 

DEPENDS = "python3 python3-pip-native opencv"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"
SRC_URI[md5sum] = "36d67f09395740dc3aa77781ce83077f"
SRC_URI[sha256sum] = "698820f87b3cb3db478b589ba3ad42cd8aac53ba21272c9094ac3742707470c2"
S = "${WORKDIR}/${BPN}-${PV}"

inherit fsl-eula-unpack python3native

IS_RM_OVXRTM  = ""
IS_RM_OVXRTM:mx8mm-nxp-bsp =  "1"
IS_RM_OVXRTM:mx8mnul-nxp-bsp =  "1"
IS_RM_OVXRTM:mx8mpul-nxp-bsp =  "1"
IS_RM_OVXRTM:mx8ulp-nxp-bsp =  "1"

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

FILES_SOLIBSDEV = ""

FILES:${PN} += "${libdir}/*"

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_SYSROOT_STRIP = "1"

INSANE_SKIP:${PN} += "dev-so dev-deps ldflags"

RDEPENDS_MX8                 = ""
RDEPENDS_MX8:mx8-nxp-bsp     = "nn-imx"
RDEPENDS_MX8:mx8mm-nxp-bsp   = ""
RDEPENDS_MX8:mx8mnul-nxp-bsp = ""
RDEPENDS_MX8:mx8mpul-nxp-bsp = ""
RDEPENDS_MX8:mx8ulp-nxp-bsp  = ""
RDEPENDS:${PN} += "${RDEPENDS_MX8} "

BBCLASSEXTEND = "nativesdk"

COMPATIBLE_MACHINE = "(mx8-nxp-bsp)"
