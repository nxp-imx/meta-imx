require mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f" 

SRC_URI[md5sum] = "dbc41148e54df16f7d094b75cded34b2"
SRC_URI[sha256sum] = "c2b3ef5f61fcda3888f365b5b19a3a0c5a337c803a4da22c8d036544cd340b2e"
IMX_SRCREV_ABBREV = "5178a20"

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
