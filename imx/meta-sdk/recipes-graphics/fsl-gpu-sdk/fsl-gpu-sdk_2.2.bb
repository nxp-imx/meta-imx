SUMMARY = "Freescale GPU SDK Samples"
DESCRIPTION = "Set of sample applications for Freescale GPU"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=01ba08a2b77c3a0a9d0ab5d4d83fed64"
DEPENDS = "${X11_DEPENDS} ${WL_DEPENDS} ${DFB_DEPENDS} devil"
DEPENDS_append_mx6q = " virtual/libgles2"
DEPENDS_append_mx6dl = " virtual/libgles2"
DEPENDS_append_mx6sx = " virtual/libgles2"

X11_DEPENDS = "${@base_contains('DISTRO_FEATURES', 'x11', 'xrandr', '', d)}"
WL_DEPENDS = "${@base_contains('DISTRO_FEATURES', 'wayland', 'wayland', '', d)}"
DFB_DEPENDS =  "${@base_contains('DISTRO_FEATURES', 'directfb', 'directfb', '', d)}"

inherit fsl-eula-unpack

# For backwards compatibility
RPROVIDES_${PN} = "vivante-gpu-sdk"
RREPLACES_${PN} = "vivante-gpu-sdk"
RCONFLICTS_${PN} = "vivante-gpu-sdk"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "95e3479cccc10167aeede9aed84ec777"
SRC_URI[sha256sum] = "7ac9637d67762472936b634c719d8c5af0168843f2f8306543fadf8a784eb3e7"

BACKEND = "${@base_contains('DISTRO_FEATURES', 'x11', \
                    base_contains('DISTRO_FEATURES', 'wayland', 'Wayland', 'X11', d), \
                        base_contains('DISTRO_FEATURES', 'wayland', 'Wayland', \
                           base_contains('DISTRO_FEATURES', 'directfb', 'DirectFB', 'FB', d), d),d)}"

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
INSANE_SKIP_${PN} += "already-stripped rpaths"

COMPATIBLE_MACHINE = "(mx6)"
