FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_imxgpu2d = " \
    file://0016-MGS-2343-ccc-XWLD-T3DStressTest_Wayland-displays-abn.patch \
    file://0017-MGS-2343-1-ccc-XWLD-T3DStressTest_Wayland-displays-a.patch \
    file://0018-xwayland-Fix-crash-when-run-with-no-input-device.patch \
"

DEPENDS_append_imxgpu2d = " virtual/libg2d"
