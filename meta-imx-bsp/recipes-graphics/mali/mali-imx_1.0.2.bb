require mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f" 

SRC_URI[md5sum] = "91e5f3372c7315b3d312a3e166351566"
SRC_URI[sha256sum] = "0106f0842c5c4059996510405ac48a202c4a7e33fef4ad903b7cc7ae23c11fba"
IMX_SRCREV_ABBREV = "7cc9a7c"

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
