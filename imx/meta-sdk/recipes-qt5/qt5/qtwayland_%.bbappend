FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI_append = " file://0001-Fix-crash-when-wl_surface-was-destroyed-before-eglDe.patch"

PACKAGECONFIG_remove_mx6 = "xcomposite-egl xcomposite-glx"
PACKAGECONFIG_remove_mx7 = "xcomposite-egl xcomposite-glx"
PACKAGECONFIG_remove_mx8 = "xcomposite-egl xcomposite-glx"

