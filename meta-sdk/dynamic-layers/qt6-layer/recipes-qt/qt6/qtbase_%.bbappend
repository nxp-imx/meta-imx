# Copyright (C) 2013 Eric Bénard - Eukréa Electromatique
# Copyright (C) 2016 O.S. Systems Software LTDA.
# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2021 NXP

### Copy qtbase bbappend from meta-freescale

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append:imxgpu = " \
    file://0014-Add-IMX-GPU-support.patch \
    file://0001-egl.prf-Fix-build-error-when-egl-headers-need-platfo.patch \
"

PACKAGECONFIG_GRAPHICS_IMX_GPU     = ""
PACKAGECONFIG_GRAPHICS_IMX_GPU:mx8-nxp-bsp = "gbm kms"

PACKAGECONFIG_GRAPHICS:imxpxp   = "gles2"
PACKAGECONFIG_GRAPHICS:imxgpu2d = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', ' gl', '', d)} \
                             ${PACKAGECONFIG_GRAPHICS_IMX_GPU}"
PACKAGECONFIG_GRAPHICS:imxgpu3d = "gles2 \
                             ${PACKAGECONFIG_GRAPHICS_IMX_GPU}"
PACKAGECONFIG_GRAPHICS:use-mainline-bsp ?= "gles2 gbm kms"

PACKAGECONFIG_PLATFORM          = ""
PACKAGECONFIG_PLATFORM:imxgpu2d = "no-opengl linuxfb"
PACKAGECONFIG_PLATFORM:imxgpu3d = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11',     '', \
       bb.utils.contains('DISTRO_FEATURES', 'wayland', '', \
                                                       'eglfs', d), d)}"
PACKAGECONFIG_PLATFORM:use-mainline-bsp = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', '', 'eglfs', d)}"
PACKAGECONFIG += "${PACKAGECONFIG_PLATFORM}"

PACKAGECONFIG_VULKAN_IMX_GPU       = ""
PACKAGECONFIG_VULKAN_IMX_GPU:mx8-nxp-bsp   = "vulkan"
PACKAGECONFIG_VULKAN_IMX_GPU:mx8mm-nxp-bsp = ""
PACKAGECONFIG_VULKAN               = ""
PACKAGECONFIG_VULKAN:imxgpu        = "${PACKAGECONFIG_VULKAN_IMX_GPU}"
PACKAGECONFIG += "${@bb.utils.contains('DISTRO_FEATURES', 'vulkan', '${PACKAGECONFIG_VULKAN}', '', d)}"

##### End of meta-freescale qtbase bbappend

IMX_BACKEND = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland',\
        bb.utils.contains('DISTRO_FEATURES',     'x11',     'x11', \
                                                             'fb', d), d)}"

SRC_URI:append = " \
    file://qt-${IMX_BACKEND}.sh \
"

PACKAGECONFIG += "examples"

PACKAGECONFIG_PLATFORM_IMX_GPU     = ""
PACKAGECONFIG_PLATFORM_IMX_GPU:mx8-nxp-bsp = "eglfs"
PACKAGECONFIG_PLATFORM:imxgpu2d += "${PACKAGECONFIG_PLATFORM_IMX_GPU}"
PACKAGECONFIG_PLATFORM:imxgpu3d += "${PACKAGECONFIG_PLATFORM_IMX_GPU}"

do_install:append () {
    install -d ${D}${sysconfdir}/profile.d/
    install -m 0755 ${WORKDIR}/qt-${IMX_BACKEND}.sh ${D}${sysconfdir}/profile.d/qt.sh
}
