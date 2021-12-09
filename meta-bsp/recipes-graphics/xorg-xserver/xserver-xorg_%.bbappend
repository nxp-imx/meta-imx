FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append:imxgpu = " \
    file://0009-glamor-MGS-6375-ximagesink-show-wrong-color.patch \
"

