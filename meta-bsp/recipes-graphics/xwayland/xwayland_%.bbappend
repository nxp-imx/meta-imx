FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-Prefer-to-create-GLES2-context-for-glamor-EGL.patch \
    file://0002-MGS-5186-Per-Specification-EGL_NATIVE_PIXMAP_KHR-req.patch \
    file://0003-glamor-Fix-fbo-pixmap-format-with-GL_BGRA_EXT.patch \
"

OPENGL_PKGCONFIGS:remove:imxgpu = "glx"

RRECOMMENDS:${PN} += "xkbcomp"
