SUMMARY = "Freescale GPU SDK Samples"
DESCRIPTION = "Set of sample applications for Freescale GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=44e96dac83a60d6c21a6055f7b31cf0c"
DEPENDS = "virtual/libgles1 virtual/libgles2 virtual/libopenvg ${WL_DEPENDS}"
WL_DEPENDS = "${@base_contains('DISTRO_FEATURES', 'wayland', 'wayland', '', d)}"

DEPENDS_remove_mx6sl= "virtual/libgles1 virtual/libgles2"

inherit fsl-eula-unpack

# For backwards compatibility
RPROVIDES_${PN} = "vivante-gpu-sdk"
RREPLACES_${PN} = "vivante-gpu-sdk"
RCONFLICTS_${PN} = "vivante-gpu-sdk"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "9e9bd05dd12c709d8d91ea7ac2445e86"
SRC_URI[sha256sum] = "12c78f8c666fdfb1745af9cc22416f03ef670b6ee3db079f6e90e1a3e5ddf0ea"

S = "${WORKDIR}/${PN}-${PV}"

SUPPORTED_APIS = "GLES1.1 GLES2.0 OpenVG"
SUPPORTED_APIS_remove_mx6sl = "GLES1.1 GLES2.0"
MAKEFILE_NO_X11 = "${@base_contains('DISTRO_FEATURES', 'wayland', 'Makefile.wl', \
                                     base_contains('DISTRO_FEATURES', 'directfb', 'Makefile.Dfb', 'Makefile.fbdev', d), d)}"
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
