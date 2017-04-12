SUMMARY = "i.MX  GPU SDK Samples"
DESCRIPTION = "Set of sample applications for i.MX GPU"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=6b552f505eedab4a11ab538cf3db743a"
DEPENDS = "${X11_DEPENDS} ${WL_DEPENDS} devil assimp gstreamer1.0 gstreamer1.0-plugins-base"
DEPENDS_append_mx6q  = " virtual/libgles2"
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

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "473e6a39baed16aa1f0ed66261a7df46"
SRC_URI[sha256sum] = "76c630e5f1436e4109673790912723053acd94364208afac0b2eac0dcad66f7d"

BACKEND = "${@base_contains('DISTRO_FEATURES', 'wayland', 'Wayland', \
                base_contains('DISTRO_FEATURES', 'x11', 'X11', 'FB', d), d)}"

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

    rm -rf ${D}/opt/${PN}/GLES2/S05_PrecompiledShader
    rm -rf ${D}/opt/${PN}/GLES3/S05_PrecompiledShader
    rm -rf ${D}/opt/${PN}/GLES2/DeBayer
    rm -rf ${D}/opt/${PN}/GLES2/DirectMultiSamplingVideoYUV
    rm -rf ${D}/opt/${PN}/GLES3/DirectMultiSamplingVideoYUV
}

FILES_${PN} += "/opt/${PN}"
FILES_${PN}-dbg += "/opt/${PN}/*/*/.debug /usr/src/debug"
INSANE_SKIP_${PN} += "already-stripped rpaths"

COMPATIBLE_MACHINE = "(mx6)"
