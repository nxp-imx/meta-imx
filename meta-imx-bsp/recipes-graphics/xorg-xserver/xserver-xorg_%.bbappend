FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append:imxgpu = " \
    file://0001-glamor-Fix-fbo-pixmap-format-with-GL_BGRA_EXT.patch \
"

