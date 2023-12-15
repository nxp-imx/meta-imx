FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://qt-linuxfb.sh"

PACKAGECONFIG_GRAPHICS:imxdrm = "gbm kms"
PACKAGECONFIG_GRAPHICS:imxpxp = "${PACKAGECONFIG_GRAPHICS_IMX_DRM}"
PACKAGECONFIG_GRAPHICS_IMX_DRM        = ""
PACKAGECONFIG_GRAPHICS_IMX_DRM:imxdrm = "gbm kms"

PACKAGECONFIG_PLATFORM = "no-opengl linuxfb"

PACKAGECONFIG_VULKAN_IMX_GPU:mx8mm-nxp-bsp = "vulkan"
PACKAGECONFIG_VULKAN_IMX_GPU:mx9-nxp-bsp   = "vulkan"

QT_QPA_DEFAULT_PLATFORM = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', '${QT_QPA_DEFAULT_PLATFORM_FB}', d)}"
QT_QPA_DEFAULT_PLATFORM_FB          = "linuxfb"
QT_QPA_DEFAULT_PLATFORM_FB:imxgpu3d = "eglfs"

# Use eglfs_viv for framebuffer backend on i.MX 3D GPU
EXTRA_OECMAKE:append:class-target = " ${QT_QPA_DEFAULT_EGLFS_INTEGRATION}"
QT_QPA_DEFAULT_EGLFS_INTEGRATION          = ""
QT_QPA_DEFAULT_EGLFS_INTEGRATION:imxgpu3d = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '', '-DQT_QPA_DEFAULT_EGLFS_INTEGRATION=eglfs_viv', d)}"

do_install:append () {
    if ! ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'true', 'false', d)}; then
        install -Dm 0755 ${WORKDIR}/qt-linuxfb.sh ${D}${sysconfdir}/profile.d/qt-linuxfb.sh
    fi
}
