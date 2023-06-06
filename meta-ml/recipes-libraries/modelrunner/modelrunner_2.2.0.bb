DESCRIPTION = "This package includes the updated and experimental ModelRunner for TensorFlow Lite and ARM NN. Also in this repository is a pre-release of DeepViewRT with support for the OpenVX backend."
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=673fa34349fa40f59e0713cb0ac22b1f"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"
SRC_URI[md5sum] = "1aece2be77abb83928ef5ec61cfb39b9"
SRC_URI[sha256sum] = "27045433cbd400feef4dcc96f14f7d0dceca662c42faf0e77e3a93336b6cf4c1"
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
    install -d ${D}${bindir}
    install -d ${D}${libdir}

    cp -r  ${S}/modelrunner/bin/* ${D}${bindir}
    cp -rP ${S}/modelrunner/lib/* ${D}${libdir}

    chown -R root:root "${D}"
}

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_SYSROOT_STRIP = "1"

FILES_SOLIBSDEV = ""

FILES:${PN} += "${libdir}/*"
RDEPENDS:${PN} = "deepview-rt onnxruntime tensorflow-lite"
INSANE_SKIP:${PN} += "dev-so dev-deps ldflags"

BBCLASSEXTEND = "nativesdk"

COMPATIBLE_MACHINE = "(mx8-nxp-bsp|mx9-nxp-bsp)"
