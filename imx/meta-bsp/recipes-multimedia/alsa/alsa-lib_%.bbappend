FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0001-pcm_plugin-fix-appl-pointer-not-correct-when-mmap_co.patch"

