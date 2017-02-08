FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

DEPENDS_append_imxgpu2d = " virtual/libg2d"

SRC_URI_remove = " \
    file://0007-xwayland-Fix-crash-when-run-with-no-input-device.patch     \
"
SRC_URI_append = " \
    file://0008-xwayland-Fix-crash-when-run-with-no-input-device.patch     \
"
