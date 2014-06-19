SUMMARY = "Freescale GPU SDK Samples"
DESCRIPTION = "Set of sample applications for Freescale GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=44e96dac83a60d6c21a6055f7b31cf0c"
DEPENDS = "virtual/libgles1 virtual/libgles2 ${WL_DEPENDS}"
WL_DEPENDS = "${@base_contains('DISTRO_FEATURES', 'wayland', 'wayland', '', d)}"

inherit fsl-eula-unpack

# For backwards compatibility
RPROVIDES_${PN} = "vivante-gpu-sdk"
RREPLACES_${PN} = "vivante-gpu-sdk"
RCONFLICTS_${PN} = "vivante-gpu-sdk"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
SRC_URI[md5sum] = "61cdbdc080855a619a1f1cccd00c058e"
SRC_URI[sha256sum] = "a9529c103618c1e62dfc52cda14611c015bff739c6c6733c1c5854635da5c448"

S = "${WORKDIR}/${PN}-${PV}"

SUPPORTED_APIS = "GLES1.1 GLES2.0 ${@base_contains('DISTRO_FEATURES', 'x11', '', 'OpenVG', d)}"
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
