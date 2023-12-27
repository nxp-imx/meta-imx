require mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f"

SRC_URI[md5sum] = "11e2be29ed518bd645252f77b6c0b0b1"
SRC_URI[sha256sum] = "452a3dbbc4dcc7e9eed7b60192247d56ee0dcc858eaebabee54d967dfdf7554b"
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
