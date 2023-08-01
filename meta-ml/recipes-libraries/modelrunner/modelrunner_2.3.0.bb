DESCRIPTION = "This package includes the updated and experimental ModelRunner for TensorFlow Lite and ARM NN"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac" 

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"
SRC_URI[md5sum] = "c1e293af3bcb44925bff11fbd63cb1bd"
SRC_URI[sha256sum] = "a7008d3d3ecd09fe2450ef8ed721ecde07ebf04dfff714f59424625a3cb5ba0d"
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
RDEPENDS:${PN} = "onnxruntime tensorflow-lite"
INSANE_SKIP:${PN} += "dev-so dev-deps ldflags"

BBCLASSEXTEND = "nativesdk"

COMPATIBLE_MACHINE = "(mx8-nxp-bsp|mx9-nxp-bsp)"
