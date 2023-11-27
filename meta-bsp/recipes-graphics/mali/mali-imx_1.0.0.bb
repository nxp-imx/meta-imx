require recipes-graphics/mali/mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=2827219e81f28aba7c6a569f7c437fa7"

SRC_URI[md5sum] = "cc702c45679b3617e8c2e7ccd4d83df0"
SRC_URI[sha256sum] = "19794cb2fb3159822aa62d32cad4b1a29d408c378f7e64990343f1b0d1b2f4ed"
IMX_SRCREV_ABBREV = "047f9c7"

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
