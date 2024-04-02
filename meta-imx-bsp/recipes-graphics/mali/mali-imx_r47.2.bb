require mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1142bc333cf4971d6b10bd8292363f02"

SRC_URI[md5sum] = "73d3bd830e7f1326ecd259019e71cc9b"
SRC_URI[sha256sum] = "02d4cd7bc2314669c233c73ef35b1c5e9054cfd6f4ad85e3baf14359b827683f"
IMX_SRCREV_ABBREV = "6b97897"

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
