SUMMARY = "Freescale GPU SDK Samples"
DESCRIPTION = "Set of sample applications for Freescale GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=44e96dac83a60d6c21a6055f7b31cf0c"
DEPENDS = "virtual/libgles1 virtual/libgles2 ${WL_DEPENDS}"
WL_DEPENDS = "${@base_contains('DISTRO_FEATURES', 'wayland', 'wayland', '', d)}"

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
SRC_URI[md5sum] = "7cf0e66cfc6202a51bdd42573e601e6a"
SRC_URI[sha256sum] = "89e3753b343b67e3a0d82fe3e96f0b388e73a650c2a00c767cf67efce7d0c217"

S = "${WORKDIR}/${PN}-${PV}"

SUPPORTED_APIS = "GLES1.1 GLES2.0 OpenVG"
MAKEFILE_NO_X11 = "${@base_contains('DISTRO_FEATURES', 'wayland', 'Makefile.wl', 'Makefile.fbdev', d)}"
MAKEFILE = "${@base_contains('DISTRO_FEATURES', 'x11', 'Makefile.x11', '${MAKEFILE_NO_X11}', d)}"

EXTRA_OEMAKE += "YOCTO_BUILD=1"

do_compile () {
    export ROOTFS=${STAGING_DIR_HOST}
    for API in ${SUPPORTED_APIS}; do
        cd "${S}/Samples/${API}"
        oe_runmake -f "${MAKEFILE}"
    done
}

do_install () {
    install -d "${D}/opt/${PN}"
    for API in ${SUPPORTED_APIS}; do
        cd "${S}/Samples/${API}"
        oe_runmake -f "${MAKEFILE}" install
        cp -r bin/* "${D}/opt/${PN}"
    done
}

FILES_${PN} += "/opt/${PN}"
FILES_${PN}-dbg += "/opt/${PN}/*/.debug"
