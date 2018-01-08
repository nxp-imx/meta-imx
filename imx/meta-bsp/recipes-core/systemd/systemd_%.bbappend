FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://Fix-for-hostnamed-not-starting.patch \
                   file://Machine-system-ctl-always-pass-changes-and-n_changes.patch \
                   file://0001-systemctl-avoid-spurious-warning-about-missing-reboo.patch"

# Work around the Weston's Suspend/resume issue
SRC_URI_append_mx8 = " ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', \
                  'file://0001-login-Disable-the-drm-ioctl-call-to-set-drop-the-drm.patch ', '', d)}"
