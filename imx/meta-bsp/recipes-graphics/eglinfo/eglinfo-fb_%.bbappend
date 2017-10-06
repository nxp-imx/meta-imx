FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# This patch is needed for V6 graphics

SRC_URI_append_imxgpu3d = " \
    file://0001-Replace-vendor-specific-header-with-generic.patch \
"
