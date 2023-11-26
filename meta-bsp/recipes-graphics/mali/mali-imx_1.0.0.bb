require recipes-graphics/mali/mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=2827219e81f28aba7c6a569f7c437fa7" 

SRC_URI[md5sum] = "250753b878d810bf0f2693d79761ba4a"
SRC_URI[sha256sum] = "f255266546f39ca669f53037d3ac88e79d38f4093df6b23292f5f5027d43bfb8"
IMX_SRCREV_ABBREV = "66a6632"

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
