FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

DEPENDS = "mesa"

SRC_URI_append_imxgpu = " file://Replace-glWindowPos2iARB-calls-with-glWindowPos2i.patch \
                    file://fix-clear-build-break.patch \
                    file://Additional-eglSwapBuffer-calling-makes-wrong-throttl.patch \
                    file://Add-OpenVG-demos-to-support-wayland.patch"

PACKAGECONFIG_IMX_REMOVE_IF_2D_ONLY          = ""
PACKAGECONFIG_IMX_REMOVE_IF_2D_ONLY_imxgpu2d = "gles1 gles2"
PACKAGECONFIG_IMX_REMOVE_IF_2D_ONLY_imxgpu3d = ""

PACKAGECONFIG_remove_imxgpu = " \
    ${PACKAGECONFIG_IMX_REMOVE_IF_2D_ONLY} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'glu x11', '', d)} \
"

PACKAGECONFIG_append_imxgpu = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland vg', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES',     'x11',       'glut', '', d)} \
"

PACKAGECONFIG[glut] = "--with-glut=${STAGING_EXECPREFIXDIR},--without-glut,freeglut"
