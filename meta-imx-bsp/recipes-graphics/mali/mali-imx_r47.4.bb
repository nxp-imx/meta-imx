require mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a" 

SRC_URI[md5sum] = "529cf0b0a0d50d46ddb5816b79f60989"
SRC_URI[sha256sum] = "e732598be61d095815c6a1f7fa9f695421382c2d81a2e00ced2f1e559de1fbf5"
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
