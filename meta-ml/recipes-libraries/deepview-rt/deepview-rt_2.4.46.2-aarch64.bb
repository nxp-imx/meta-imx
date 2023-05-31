DESCRIPTION = "This package includes the updated and experimental ModelRunner for TensorFlow Lite and ARM NN. Also in this repository is a pre-release of DeepViewRT with support for the OpenVX backend."
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374"

DEPENDS = "python3 python3-pip-native"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"
SRC_URI[md5sum] = "19a0921cc39435929f96bc376fa36fcd"
SRC_URI[sha256sum] = "5e63eadfbd3fbf9e4184aa4546acfa3fd546d488b4df40977a97b933a8e4502b"
S = "${WORKDIR}/${BPN}-${PV}"

inherit fsl-eula-unpack python3native

PACKAGECONFIG ?= "${PACKAGECONFIG_OPENVX}"
PACKAGECONFIG_OPENVX                    = ""
PACKAGECONFIG_OPENVX:mx8-nxp-bsp:imxgpu = "openvx"
PACKAGECONFIG_OPENVX:mx8mm-nxp-bsp      = ""
# The tensorflow-lite implementation for 8ULP uses CPU, and so doesn't
# support OpenVX
PACKAGECONFIG_OPENVX:mx8ulp-nxp-bsp     = ""

PACKAGECONFIG[openvx] = ",,,libopenvx-imx"

do_install () {
    install -d ${D}${libdir}
    install -d ${D}${includedir}
    install -d ${D}/${PYTHON_SITEPACKAGES_DIR}

    cp -rP ${S}/${BPN}/lib/* ${D}${libdir}
    cp -r  ${S}/${BPN}/include/* ${D}${includedir}
    if ${@bb.utils.contains('PACKAGECONFIG', 'openvx', 'false', 'true', d)} ; then
        rm ${D}${libdir}/deepview-rt-openvx.so
    fi
 
    ${STAGING_BINDIR_NATIVE}/pip3 install --disable-pip-version-check -v \
        -t ${D}/${PYTHON_SITEPACKAGES_DIR} --no-cache-dir --no-deps \
        ${S}/whl/deepview_rt-*.whl

    chown -R root:root "${D}"
}

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_SYSROOT_STRIP = "1"

FILES_SOLIBSDEV = ""

FILES:${PN} += "${libdir}/*"
INSANE_SKIP:${PN} += "dev-so dev-deps ldflags"

BBCLASSEXTEND = "nativesdk"

COMPATIBLE_MACHINE = "(mx8-nxp-bsp|mx9-nxp-bsp)"
