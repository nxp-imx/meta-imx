FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_imxgpu = " \
    file://0009-glamor-MGS-6375-ximagesink-show-wrong-color.patch \
"

