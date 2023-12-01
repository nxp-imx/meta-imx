require mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=2827219e81f28aba7c6a569f7c437fa7"

SRC_URI[md5sum] = "1a1ae1ed266888635d2170bb06398b08"
SRC_URI[sha256sum] = "8ad752933dbb17e0ecd2ca1aeb48ed0645ae2a84ce0ffc83d60d02d8d5979e6c"
IMX_SRCREV_ABBREV = "d220281"

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
