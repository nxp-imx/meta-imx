require mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"

SRC_URI[md5sum] = "4967ba53fa7d332662565453eeeff8ed"
SRC_URI[sha256sum] = "0731f0da5f0e61cc0239ff282caf9e3aebae3ec7a041c9efbd3d261e8bc6f36e"
IMX_SRCREV_ABBREV = "01561d4"

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
