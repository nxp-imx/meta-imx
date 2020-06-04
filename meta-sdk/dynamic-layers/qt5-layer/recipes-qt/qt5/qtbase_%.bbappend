# Copyright (C) 2013 Eric Bénard - Eukréa Electromatique
# Copyright (C) 2016 O.S. Systems Software LTDA.
# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2018 NXP

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

IMX_BACKEND = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland',\
        bb.utils.contains('DISTRO_FEATURES',     'x11',     'x11', \
                                                             'fb', d), d)}"

SRC_URI_append = " \
    file://qt5-${IMX_BACKEND}.sh \
"
SRC_URI_3D_ONLY = " \
    file://0014-Add-IMX-GPU-support.patch \
    file://0001-egl.prf-Fix-build-error-when-egl-headers-need-platfo.patch \
"
SRC_URI_3D_ONLY_imxgpu2d = ""
SRC_URI_append_imxgpu3d = " ${SRC_URI_3D_ONLY}"

PACKAGECONFIG += "examples"

PACKAGECONFIG_GL_IMX_GPU      = ""
PACKAGECONFIG_GL_IMX_GPU_mx8  = "gbm kms"
PACKAGECONFIG_GL_imxgpu2d += "${PACKAGECONFIG_GL_IMX_GPU}"
PACKAGECONFIG_GL_imxgpu3d += "${PACKAGECONFIG_GL_IMX_GPU}"

PACKAGECONFIG_PLATFORM_IMX_GPU     = ""
PACKAGECONFIG_PLATFORM_IMX_GPU_mx8 = "eglfs"
PACKAGECONFIG_PLATFORM_imxgpu2d += "${PACKAGECONFIG_PLATFORM_IMX_GPU}"
PACKAGECONFIG_PLATFORM_imxgpu3d += "${PACKAGECONFIG_PLATFORM_IMX_GPU}"

PACKAGECONFIG_VULKAN_IMX_GPU       = ""
PACKAGECONFIG_VULKAN_IMX_GPU_mx8   = "vulkan"
PACKAGECONFIG_VULKAN_IMX_GPU_mx8mm = ""
PACKAGECONFIG_VULKAN_imxgpu = "${PACKAGECONFIG_VULKAN_IMX_GPU}"
PACKAGECONFIG += "${@bb.utils.contains('DISTRO_FEATURES', 'vulkan', '${PACKAGECONFIG_VULKAN}', '', d)}"

PARALLEL_MAKEINST = ""
PARALLEL_MAKE_task-install = "${PARALLEL_MAKEINST}"

do_install_append () {
    if ls ${D}${libdir}/pkgconfig/Qt5*.pc >/dev/null 2>&1; then
        sed -i 's,-L${STAGING_DIR_HOST}/usr/lib,,' ${D}${libdir}/pkgconfig/Qt5*.pc
    fi
    install -d ${D}${sysconfdir}/profile.d/
    install -m 0755 ${WORKDIR}/qt5-${IMX_BACKEND}.sh ${D}${sysconfdir}/profile.d/qt5.sh
}

FILES_${PN} += "${sysconfdir}/profile.d/qt5.sh"
