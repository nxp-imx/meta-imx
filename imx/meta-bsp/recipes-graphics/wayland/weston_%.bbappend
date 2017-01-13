FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_imxgpu2d = " \
    file://0018-xwayland-Fix-crash-when-run-with-no-input-device.patch \
    file://0019-MGS-2397-ccc-Enable-double-buffer-with-fb_pan_displa.patch \
"

DEPENDS_append_imxgpu2d = " virtual/libg2d"
