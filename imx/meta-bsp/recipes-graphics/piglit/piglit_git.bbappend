FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# This patch is only necessary for morty
SRC_URI_append_imxgpu2d = " \
    file://new_egl_header.patch \
"
