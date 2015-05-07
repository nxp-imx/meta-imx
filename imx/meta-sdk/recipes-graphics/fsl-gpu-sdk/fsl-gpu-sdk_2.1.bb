SUMMARY = "Freescale GPU SDK Samples"
DESCRIPTION = "Set of sample applications for Freescale GPU"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=acdb807ac7275fe32f9f64992e111241"
DEPENDS = "${WL_DEPENDS} ${DFB_DEPENDS} "
DEPENDS_append_mx6q = " virtual/libgles2"
DEPENDS_append_mx6dl = " virtual/libgles2"
DEPENDS_append_mx6sx = " virtual/libgles2"

WL_DEPENDS = "${@base_contains('DISTRO_FEATURES', 'wayland', 'wayland', '', d)}"
DFB_DEPENDS =  "${@base_contains('DISTRO_FEATURES', 'directfb', 'directfb', '', d)}"

inherit fsl-eula-unpack

# For backwards compatibility
RPROVIDES_${PN} = "vivante-gpu-sdk"
RREPLACES_${PN} = "vivante-gpu-sdk"
RCONFLICTS_${PN} = "vivante-gpu-sdk"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "4e7057a0daf33b62fb36a884071a9f58"
SRC_URI[sha256sum] = "167109b71e9f472bd04ce3ce7a83eb254aa1278da0e5540cd945adcd9f8d8990"

BACKEND = "${@base_contains('DISTRO_FEATURES', 'x11', 'X11', \
                    base_contains('DISTRO_FEATURES', 'wayland', 'Wayland', \
                           base_contains('DISTRO_FEATURES', 'directfb', 'DirectFB', 'FB', d), d), d)}"
do_compile () {
    export FSL_GRAPHICS_SDK=${S}
    export FSL_PLATFORM_NAME=Yocto
    export ROOTFS=${STAGING_DIR_HOST}
    ./build.sh -f GNUmakefile_Yocto EGLBackend=${BACKEND}
}

do_install () {
    export FSL_GRAPHICS_SDK=${S}
    export FSL_PLATFORM_NAME=Yocto
    install -d "${D}/opt/${PN}"
    ./build.sh -f  GNUmakefile_Yocto EGLBackend=${BACKEND} install 
    cp -r bin/* "${D}/opt/${PN}"
    rm -rf ${D}/opt/${PN}/GLES2/S05_PrecompiledShader
    rm -rf ${D}/opt/${PN}/GLES3/S05_PrecompiledShader
}

FILES_${PN} += "/opt/${PN}"
FILES_${PN}-dbg += "/opt/${PN}/*/*/.debug /usr/src/debug"
INSANE_SKIP_${PN} += "rpaths"

COMPATIBLE_MACHINE = "(mx6)"
