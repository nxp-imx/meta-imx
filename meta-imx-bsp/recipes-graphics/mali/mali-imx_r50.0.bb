require mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ca53281cc0caa7e320d4945a896fb837"

SRC_URI[sha256sum] = "66d560a22bc55bc08a022efd26c538239fc64a5c083cf194de5802c6120d2f31"
IMX_SRCREV_ABBREV = "ca078f2"

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
