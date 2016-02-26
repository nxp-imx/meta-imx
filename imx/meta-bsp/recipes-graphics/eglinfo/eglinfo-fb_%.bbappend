FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_mx6 = " \
    file://0001-Uuse-generic-eglplatform.h-rather-than-vendor-specif.patch \
"
