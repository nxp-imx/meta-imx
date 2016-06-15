FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Note, patch 0001 requires Vivante driver v6
SRC_URI_IMX = " \
    file://0001-Add-Imx-GPU-support-for-weston-1.10.patch \
"
SRC_URI_append_mx6 = " ${SRC_URI_IMX}"
SRC_URI_append_mx8 = " ${SRC_URI_IMX}"

PACKAGECONFIG_append_mx6q  = " cairo-glesv2"
PACKAGECONFIG_append_mx6dl = " cairo-glesv2"
PACKAGECONFIG_append_mx6sx = " cairo-glesv2"
PACKAGECONFIG_append_mx8   = " cairo-glesv2"

PACKAGECONFIG_remove_mx6sl = "egl"
PACKAGECONFIG_remove_mx6ul = "egl"

EXTRA_OECONF_IMX = " \
    --disable-libunwind \
    --disable-xwayland-test \
    WESTON_NATIVE_BACKEND=fbdev-backend.so \
"
EXTRA_OECONF_append_mx6   = " ${EXTRA_OECONF_IMX}"
EXTRA_OECONF_append_mx6ul = " ${EXTRA_OECONF_IMX}"
EXTRA_OECONF_append_mx8   = " ${EXTRA_OECONF_IMX}"

EXTRA_OEMAKE_IMX_CFLAGS = " \
    COMPOSITOR_CFLAGS="-I ${STAGING_INCDIR}/pixman-1 -DLINUX=1 -DEGL_API_FB -DEGL_API_WL" \
    FB_COMPOSITOR_CFLAGS="-DLINUX=1 -DEGL_API_FB -DEGL_API_WL" \
    SIMPLE_EGL_CLIENT_CFLAGS="-DLINUX -DEGL_API_FB -DEGL_API_WL" \
    EGL_TESTS_CFLAGS="-DLINUX -DEGL_API_FB -DEGL_API_WL" \
    CLIENT_CFLAGS="-I ${STAGING_INCDIR}/cairo -I ${STAGING_INCDIR}/pixman-1 -DLINUX -DEGL_API_FB -DEGL_API_WL" \
"
EXTRA_OEMAKE_IMX_LIBS = " \
    COMPOSITOR_LIBS="-lGLESv2 -lEGL -lGAL -lwayland-server -lxkbcommon -lpixman-1" \
    FB_COMPOSITOR_LIBS="-lGLESv2 -lEGL -lwayland-server -lxkbcommon" \
"
EXTRA_OEMAKE_IMX_LIBS_mx6sl = " \
    COMPOSITOR_LIBS="-lEGL -lGAL -lwayland-server -lxkbcommon -lpixman-1" \
    FB_COMPOSITOR_LIBS="-lEGL -lwayland-server -lxkbcommon" \
"
EXTRA_OEMAKE_append_mx6  = " ${EXTRA_OEMAKE_IMX_CFLAGS} ${EXTRA_OEMAKE_IMX_LIBS}"
EXTRA_OEMAKE_append_mx8  = " ${EXTRA_OEMAKE_IMX_CFLAGS} ${EXTRA_OEMAKE_IMX_LIBS}"
