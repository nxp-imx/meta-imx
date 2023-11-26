require recipes-graphics/mali/mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=2827219e81f28aba7c6a569f7c437fa7" 

SRC_URI[md5sum] = "b4fd58445dc05892c2605908678814fa"
SRC_URI[sha256sum] = "62e3017901377e8527434ef59a772c322e281ceef3b16c24388fec0ef822a8e6"
IMX_SRCREV_ABBREV = "66a6632"

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
