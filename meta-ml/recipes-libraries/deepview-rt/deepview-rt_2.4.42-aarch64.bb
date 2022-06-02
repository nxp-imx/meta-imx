DESCRIPTION = "This package includes the updated and experimental ModelRunner for TensorFlow Lite and ARM NN. Also in this repository is a pre-release of DeepViewRT with support for the OpenVX backend."
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d3c315c6eaa43e07d8c130dc3a04a011"

DEPENDS = "python3 python3-pip-native opencv"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"
SRC_URI[md5sum] = "c2b59035841397bacf4f0b6247dc869d"
SRC_URI[sha256sum] = "3d66ca8d3253bf42f634bf05f23059b71d4dcc02961e9b1b64b2d78bb5330545"
S = "${WORKDIR}/${BPN}-${PV}"

inherit fsl-eula-unpack python3native

PACKAGECONFIG ?= " \
    ${PACKAGECONFIG_DEFAULT} \
    ${PACKAGECONFIG_OPENVX} \
"
PACKAGECONFIG_DEFAULT                 = ""
PACKAGECONFIG_DEFAULT:mx8-nxp-bsp     = "onnxruntime tensorflow-lite"
PACKAGECONFIG_DEFAULT:mx8mm-nxp-bsp   = ""
PACKAGECONFIG_DEFAULT:mx8mnul-nxp-bsp = ""
PACKAGECONFIG_DEFAULT:mx8mpul-nxp-bsp = ""
PACKAGECONFIG_OPENVX                  = ""
PACKAGECONFIG_OPENVX:mx8-nxp-bsp      = "openvx"
PACKAGECONFIG_OPENVX:mx8mm-nxp-bsp    = ""
PACKAGECONFIG_OPENVX:mx8mnul-nxp-bsp  = ""
PACKAGECONFIG_OPENVX:mx8mpul-nxp-bsp  = ""
# The tensorflow-lite implementation for 8ULP uses CPU, and so doesn't
# support OpenVX
PACKAGECONFIG_OPENVX:mx8ulp-nxp-bsp   = ""

PACKAGECONFIG[onnxruntime] = ",,,onnxruntime"
PACKAGECONFIG[openvx] = ",,,libopenvx-imx"
PACKAGECONFIG[tensorflow-lite] = ",,,tensorflow-lite"

do_install () {
    install -d ${D}${bindir}
    install -d ${D}${libdir}
    install -d ${D}${includedir}
    install -d ${D}/${PYTHON_SITEPACKAGES_DIR}

    cp -r  ${S}/modelrunner/bin/* ${D}${bindir}
    cp -rP ${S}/modelrunner/lib/* ${D}${libdir}
    cp -rP ${S}/${BPN}/lib/* ${D}${libdir}
    if ! [ "${@bb.utils.filter('PACKAGECONFIG', 'openvx', d)}" ]; then
        rm ${D}${libdir}/deepview-rt-openvx.so
    fi
    cp -r  ${S}/${BPN}/include/* ${D}${includedir}
 
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

BBCLASSEXTEND = "nativesdk"

COMPATIBLE_MACHINE = "(mx8-nxp-bsp)"
