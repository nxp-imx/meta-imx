SUMMARY = "Freescale GPU SDK Samples"
DESCRIPTION = "Set of sample applications for Freescale GPU"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=3880bb9c943b135a30fad5e8aabd3ee9"
DEPENDS = "${X11_DEPENDS} ${WL_DEPENDS} devil gstreamer1.0 gstreamer1.0-plugins-base"
DEPENDS_append_mx6q = " virtual/libgles2"
DEPENDS_append_mx6dl = " virtual/libgles2"
DEPENDS_append_mx6sx = " virtual/libgles2"
DEPENDS_append_mx6sl = " virtual/libopenvg"

X11_DEPENDS = "${@base_contains('DISTRO_FEATURES', 'x11', 'xrandr', '', d)}"
WL_DEPENDS = "${@base_contains('DISTRO_FEATURES', 'wayland', 'wayland', '', d)}"

inherit fsl-eula-unpack

# For backwards compatibility
RPROVIDES_${PN} = "vivante-gpu-sdk"
RREPLACES_${PN} = "vivante-gpu-sdk"
RCONFLICTS_${PN} = "vivante-gpu-sdk"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "8da0f60f30f960de05c537325a355f9a"
SRC_URI[sha256sum] = "717f51e101c2e32371fb5b1836cd293db2eaad3220225fd6c34735633d8fc33a"

BACKEND = "${@base_contains('DISTRO_FEATURES', 'wayland', 'Wayland', \
                base_contains('DISTRO_FEATURES', 'x11', 'X11', 'FB', d), d)}"

HAS_VPU = "1"
HAS_VPU_mx6sx = "0"

IS_MX6SL = "0"
IS_MX6SL_mx6sl = "1"

do_compile () {
    export FSL_GRAPHICS_SDK=${S}
    export FSL_PLATFORM_NAME=Yocto
    export ROOTFS=${STAGING_DIR_HOST}
    if [ "${IS_MX6SL}" = "0" ]; then
        ./build.sh -f GNUmakefile_Yocto EGLBackend=${BACKEND}
    else
        ./build_OpenVG.sh -f GNUmakefile_Yocto EGLBackend=${BACKEND}  
    fi 
}

do_install () {
    export FSL_GRAPHICS_SDK=${S}
    export FSL_PLATFORM_NAME=Yocto
    install -d "${D}/opt/${PN}"
    if [ "${IS_MX6SL}" = "0" ]; then
        ./build.sh -f GNUmakefile_Yocto EGLBackend=${BACKEND} install
    else
        ./build_OpenVG.sh -f GNUmakefile_Yocto EGLBackend=${BACKEND} install  
    fi 
    cp -r bin/* "${D}/opt/${PN}"
    if [ "${HAS_VPU}" = "0" ]; then
        rm -rf ${D}/opt/${PN}/GLES2/DirectMultiSamplingVideoYUV
        rm -rf ${D}/opt/${PN}/GLES3/DirectMultiSamplingVideoYUV
    fi
    rm -rf ${D}/opt/${PN}/GLES2/S05_PrecompiledShader
    rm -rf ${D}/opt/${PN}/GLES3/S05_PrecompiledShader
}

FILES_${PN} += "/opt/${PN}"
FILES_${PN}-dbg += "/opt/${PN}/*/*/.debug /usr/src/debug"
INSANE_SKIP_${PN} += "already-stripped rpaths"

COMPATIBLE_MACHINE = "(mx6)"
