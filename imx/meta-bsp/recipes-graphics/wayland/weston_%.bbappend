DEPENDS_append_imxgpu2d = " virtual/libg2d"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

REQUIRED_DISTRO_FEATURES_remove_mx6sl = "opengl"
DEPENDS_remove_mx6sl = "virtual/egl"
SRC_URI_append_mx6sl = " \
    file://0001-MGS-2352-ccc-Add-GPU-VIV-support-for-weston-1.11.patch     \
    file://0002-MGS-2521-ccc-Enable-g2d-renderer-for-weston-1.11.patch     \
    file://0003-MGS-1783-xwld-Add-clone-mode-support-for-multi-displ.patch \
    file://0004-MGS-1668-xwld-System-can-not-boot-up-to-desktop.patch      \
    file://0005-MGS-1724-xwld-G2D-compositor-build-failed-in-slevk-b.patch \
"
SRC_URI_append_imxgpu2d = " \
    file://0006-MGS-2762-Fix-g2d-renderer-artifacts-on-single-and-du.patch \
    file://MGS-2821-Fix-gpu-viv-6-2-2-build-break.patch\
    file://0007-MGS-2787-ccc-Check-if-g2d_format-has-an-alpha-when-d.patch \
    file://0008-MGS-1285-ccc-Refine-g2d-renderer-to-optimize-Weston-.patch \
"
SRC_URI_append = " \
    file://0009-MGS-2921-ccc-Fix-gl-renderer-of-using-create_platfor.patch \
"

EXTRA_OEMAKE_append_mx6sl = " \
    COMPOSITOR_CFLAGS="-I ${STAGING_INCDIR}/pixman-1 -DLINUX=1 -DEGL_API_FB -DEGL_API_WL" \
    FB_COMPOSITOR_CFLAGS="-DLINUX=1 -DEGL_API_FB -DEGL_API_WL" \
    CLIENT_CFLAGS="-I ${STAGING_INCDIR}/cairo -I ${STAGING_INCDIR}/pixman-1 -DLINUX -DEGL_API_FB -DEGL_API_WL" \
"
