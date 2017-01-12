SUMMARY = "Freescale GPU SDK Samples"
DESCRIPTION = "Set of sample applications for Freescale GPU"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=be67a88e9e6c841043b005ad7bcf8309"
DEPENDS = "${X11_DEPENDS} ${WL_DEPENDS} devil assimp gstreamer1.0 gstreamer1.0-plugins-base"

IMX_DEPENDS_APPEND          = ""
IMX_DEPENDS_APPEND_imxgpu2d = "virtual/libg2d virtual/libopenvg"
IMX_DEPENDS_APPEND_imxgpu3d = "virtual/libg2d virtual/libgles2"
DEPENDS_append = " ${IMX_DEPENDS_APPEND}"

X11_DEPENDS = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'xrandr', '', d)}"
WL_DEPENDS = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', '', d)}"

inherit fsl-eula-unpack

# For backwards compatibility
RPROVIDES_${PN} = "vivante-gpu-sdk"
RREPLACES_${PN} = "vivante-gpu-sdk"
RCONFLICTS_${PN} = "vivante-gpu-sdk"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "18773fcd8e468b64043eb8967946bfbd"
SRC_URI[sha256sum] = "48f0a7ee043e14dcccece665603abb2a7515179f63890dd3410c3041b99dd5e7"


BACKEND = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'Wayland', \
                bb.utils.contains('DISTRO_FEATURES', 'x11', 'X11', 'FB', d), d)}"

IS_MX6SX = "0"
IS_MX6SX_mx6sx = "1"

IS_MX8 = "0"
IS_MX8_mx8 = "1"

IS_MX6SL = "0"
IS_MX6SL_mx6sl = "1"

IS_MX7ULP = "0"
IS_MX7ULP_mx7ulp = "1"

do_compile () {
    export FSL_GRAPHICS_SDK=${S}
    export FSL_PLATFORM_NAME=Yocto
    export ROOTFS=${STAGING_DIR_HOST}
    cd ${S}/.Config

    if [ "${IS_MX8}" = "1" ]; then
        ./FslBuild.py -t sdk -u [EGL,OpenVG,OpenGLES2,OpenGLES3,OpenGLES3.1,OpenCL,OpenCL1.1,OpenCL1.2,OpenVX,OpenVX1.0.1,Vulkan,G2D] -- -j 2 EGLBackend=${BACKEND} ROOTFS=${STAGING_DIR_HOST}

    elif [ "${IS_MX6SL}" = "1" ]; then
        ./FslBuild.py -t sdk -u [EGL,OpenVG,G2D] -- -j 2 EGLBackend=${BACKEND} ROOTFS=${STAGING_DIR_HOST}

    elif [ "${IS_MX6SX}" = "1" ]; then
        ./FslBuild.py -t sdk -u [EGL,OpenVG,G2D,OpenGLES2] -- -j 2 EGLBackend=${BACKEND} ROOTFS=${STAGING_DIR_HOST}

    elif [ "${IS_MX7ULP}" = "1" ]; then
        ./FslBuild.py -t sdk -u [EGL,OpenVG,G2D,OpenGLES2] -- -j 2 EGLBackend=${BACKEND} ROOTFS=${STAGING_DIR_HOST}

    else
        ./FslBuild.py -t sdk -u [EGL,OpenVG,G2D,OpenGLES2,OpenGLES3] -- -j 2 EGLBackend=${BACKEND} ROOTFS=${STAGING_DIR_HOST}
    fi

}

do_install () {
    export FSL_GRAPHICS_SDK=${S}
    export FSL_PLATFORM_NAME=Yocto
    install -d "${D}/opt/${PN}"
    cd ${S}/.Config

    if [ "${IS_MX8}" = "1" ]; then
        ./FslBuild.py -t sdk -u [EGL,OpenVG,OpenGLES2,OpenGLES3,OpenGLES3.1,OpenCL,OpenCL1.1,OpenCL1.2,OpenVX,OpenVX1.0.1,Vulkan,G2D] -- -j 2 EGLBackend=${BACKEND} install

    elif [ "${IS_MX6SL}" = "1" ]; then
        ./FslBuild.py -t sdk -u [EGL,OpenVG,G2D] -- -j 2 EGLBackend=${BACKEND} install

    elif [ "${IS_MX6SX}" = "1" ]; then
        ./FslBuild.py -t sdk -u [EGL,OpenVG,G2D,OpenGLES2] -- -j 2 EGLBackend=${BACKEND} install

    elif [ "${IS_MX7ULP}" = "1" ]; then
        ./FslBuild.py -t sdk -u [EGL,OpenVG,G2D,OpenGLES2] -- -j 2 EGLBackend=${BACKEND} install

    else
        ./FslBuild.py -t sdk -u [EGL,OpenVG,G2D,OpenGLES2,OpenGLES3] -- -j 2 EGLBackend=${BACKEND} install
    fi

    cp -r ${S}/bin/* ${D}/opt/${PN}

    rm -rf ${D}/opt/${PN}/GLES2/DirectMultiSamplingVideoYUV
    rm -rf ${D}/opt/${PN}/GLES3/DirectMultiSamplingVideoYUV
    rm -rf ${D}/opt/${PN}/GLES2/DeBayer

    if [ "${IS_MX8}" = "1" ]; then
        rm -rf ${D}/opt/${PN}/G2D/EightLayers
    fi
}

FILES_${PN} += "/opt/${PN}"
FILES_${PN}-dbg += "/opt/${PN}/*/*/.debug /usr/src/debug"
INSANE_SKIP_${PN} += "already-stripped rpaths"

COMPATIBLE_MACHINE = "(mx6|mx8|mx7ulp)"
