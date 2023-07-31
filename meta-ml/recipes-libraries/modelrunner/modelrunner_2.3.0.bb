DESCRIPTION = "This package includes the updated and experimental ModelRunner for TensorFlow Lite and ARM NN"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac" 

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"
SRC_URI[md5sum] = "7437844644098c9f8cc350da8507335a"
SRC_URI[sha256sum] = "9066b3917be717028c914a5a87a03268f84e196d1f143b57c78dfc2ddc20ac11"
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
