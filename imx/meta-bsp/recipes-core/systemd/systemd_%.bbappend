FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Work around the Weston's Suspend/resume issue
SRC_URI_append_mx8 = " ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', \
                  'file://0001-login-Disable-the-drm-ioctl-call-to-set-drop-the-drm.patch ', '', d)}"
