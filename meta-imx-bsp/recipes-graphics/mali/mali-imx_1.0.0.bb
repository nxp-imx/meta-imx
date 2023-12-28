require mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f"

SRC_URI[md5sum] = "7c303c4bee9e6f7e94ddd6e04612acf4"
SRC_URI[sha256sum] = "cd587aa3d49c6694dabbc60e2f1fe29a389c66d09c9353614a220d6dbf597f69"
IMX_SRCREV_ABBREV = "7b3e2eb"

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
