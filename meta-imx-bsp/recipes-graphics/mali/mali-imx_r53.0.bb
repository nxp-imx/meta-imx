require mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=c0fb372b5d7f12181de23ef480f225f3" 

SRC_URI[sha256sum] = "d14caf328c62bb1c0bebbd3debb216f94e3aea248b9700b4f486526b5ef16c8f"
IMX_SRCREV_ABBREV = "9cb28e2"

S = "${WORKDIR}/git"

inherit fsl-eula2-unpack2 fsl-eula-recent

do_install:append() {
    # Move firmware to nonarch_base_libdir
    if [ "${base_libdir}" != "${nonarch_base_libdir}" ]; then
        install -d ${D}${nonarch_base_libdir}
        mv ${D}${base_libdir}/firmware ${D}${nonarch_base_libdir}
    fi
}

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
