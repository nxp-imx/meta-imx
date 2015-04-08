# look for files in the layer first
FILESEXTRAPATHS_prepend_mx6 := "${THISDIR}/${PN}:"

SRC_URI_append_mx6 = " file://0001-Additional-eglSwapBuffer-calling-makes-wrong-throttl.patch"
