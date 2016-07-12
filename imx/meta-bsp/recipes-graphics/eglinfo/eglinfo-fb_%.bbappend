FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# This patch is needed for V6 graphics

SRC_URI_append_mx6 = " \
    file://0001-Uuse-generic-eglplatform.h-rather-than-vendor-specif.patch \
"

SRC_URI_append_mx8 = " \
    file://0001-Uuse-generic-eglplatform.h-rather-than-vendor-specif.patch \
"
