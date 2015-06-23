FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://disable_xcomposite_egl_qt_wayland_client_buffer_integration.patch"
