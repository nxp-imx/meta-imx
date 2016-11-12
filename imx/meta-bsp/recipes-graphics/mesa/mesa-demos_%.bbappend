FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

DEPENDS = "mesa"

SRC_URI_append_mx7ulp = " file://Replace-glWindowPos2iARB-calls-with-glWindowPos2i.patch \
                    file://fix-clear-build-break.patch \
                    file://Additional-eglSwapBuffer-calling-makes-wrong-throttl.patch \
                    file://Add-OpenVG-demos-to-support-wayland.patch"

PACKAGECONFIG[glut] = "--with-glut=${STAGING_EXECPREFIXDIR},--without-glut,freeglut"

PACKAGECONFIG_append_imxgpu2d = " ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'glut', '', d)}"
