require mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a93b654673e1bc8398ed1f30e0813359" 

SRC_URI[sha256sum] = "340067a8e83913392a1f7360264192b1f9cb0fe8f6da129a40da300dada861d2"
IMX_SRCREV_ABBREV = "5311525"

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
