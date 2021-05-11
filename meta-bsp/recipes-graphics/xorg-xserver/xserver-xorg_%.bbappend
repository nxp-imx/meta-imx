FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_imxgpu = " \
    file://0001-xfree86-define-FOURCC_NV12-and-XVIMAGE_NV12.patch \
    file://0002-glamor-add-support-for-GL_RG.patch \
    file://0003-glamor-add-support-for-NV12-in-Xv.patch \
    file://0004-glamor-Remove-unused-format_for_pixmap-helper.patch \
    file://0005-glamor-Stop-trying-to-store-the-pixmap-s-format-in-g.patch \
    file://0006-glamor-Plumb-the-pixmap-through-fbo-creation-instead.patch \
    file://0007-glamor-Switch-the-gl_flavor-to-a-boolean-is_gles.patch \
    file://0008-glamor-Introduce-a-central-place-for-our-pixmap-form.patch \
"

