require mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=2827219e81f28aba7c6a569f7c437fa7"

SRC_URI[md5sum] = "cd62cd7d701d7dd1fb7ff9cd9de6b41e"
SRC_URI[sha256sum] = "ddfd75fd0e83e69b7bc9dc22c27845862c4f4c74b5955e838981f9c76fc8f056"
IMX_SRCREV_ABBREV = "8c56d88"

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
