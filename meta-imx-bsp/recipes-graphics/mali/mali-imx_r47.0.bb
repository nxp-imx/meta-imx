require mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f" 

SRC_URI[md5sum] = "452c13731972651a3633c0b0d9564552"
SRC_URI[sha256sum] = "bc33f31eabfec685a1eed5f6a2716aa62c8dc8af56cd3d2a4eb53f1b49c494c7"
IMX_SRCREV_ABBREV = "b867f39"

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
