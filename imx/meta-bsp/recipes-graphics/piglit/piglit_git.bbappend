FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_imxgpu2d = " \
    file://new_egl_header.patch \
"
