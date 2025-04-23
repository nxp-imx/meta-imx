require mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf2070b16b9d4acf60a98e8cbc32a25a"

SRC_URI[sha256sum] = "864c6b4ce9b0f705d1f96a6e1222d69e3414ec85b4c23153b61a458f9dda3f74"
IMX_SRCREV_ABBREV = "b4b02da"

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
