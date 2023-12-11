require mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f"

SRC_URI[md5sum] = "029fcbfa886073076e70bf39efaf59c5"
SRC_URI[sha256sum] = "34c09817df9889a84c4bff3e88529f6bea7aa42bc8654c4d7ec5a6b013947cdf"
IMX_SRCREV_ABBREV = "0ccf1ff"

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
