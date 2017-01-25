FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_remove_imxgpu3d = " \
    file://0002-MGS-1111-Add-GPU-VIV-suport-for-wayland-and-weston-1.patch \
    file://0003-MGS-1192-xwld-g2d-compositor-dose-not-work.patch \
    file://0004-MGS-1235-Fix-setenv-and-clear-environments.patch \
    file://0005-MGS-1252-Fix-for-Qt5_CinematicExperience-will-meet-s.patch \
    file://0006-MGS-1236-imx6qp-imx6dl-First-frame-distored-when-som.patch \
    file://0007-MGS-1236-1-imx6qp-imx6dl-First-frame-distored-when-s.patch \
    file://0009-MGS-1284-xwld-Re-implement-weston-2d-renderer-with-p.patch \
    file://0010-MGS-1284-1-xwld-Re-implement-weston-2d-renderer-with.patch \
    file://0011-MGS-1724-xwld-G2D-compositor-build-failed-in-slevk-b.patch \
    file://0012-MGS-1783-xwld-Add-clone-mode-support-for-multi-displ.patch \
    file://0013-MGS-1945-Use-common-API-to-support-G2d-compositor.patch    \
    file://0014-MGS-1987-Get-stride-from-the-FB-buffe.patch                \
    file://0015-MGS-2221-imx-171-Fix-weston-build-failed.patch             \
    file://0016-Link-compositor-to-egl.patch                               \
"

SRC_URI_append_imxgpu3d = " \
    file://0001-MGS-2352-ccc-Add-GPU-VIV-support-for-weston-1.11.patch     \
    file://0002-MGS-2521-ccc-Enable-g2d-renderer-for-weston-1.11.patch     \
    file://0003-MGS-1783-xwld-Add-clone-mode-support-for-multi-displ.patch \
    file://0004-MGS-1668-xwld-System-can-not-boot-up-to-desktop.patch      \
    file://0005-MGS-1724-xwld-G2D-compositor-build-failed-in-slevk-b.patch \
    file://0006-Link-compositor-to-egl.patch                               \
"

SRC_URI_append = " \
    file://0007-xwayland-Fix-crash-when-run-with-no-input-device.patch     \
"

DEPENDS_append_imxgpu2d = " virtual/libg2d"
