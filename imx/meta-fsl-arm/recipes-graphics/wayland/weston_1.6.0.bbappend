FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI_append_mx6 = " file://0001-Add-Vivante-EGL-and-GAL2D-compositor-support.patch \
				       file://weston.sh "

PACKAGECONFIG_mx6 = "fbdev"
PACKAGECONFIG_append_mx6q = " egl cairo-glesv2"
PACKAGECONFIG_append_mx6dl = " egl cairo-glesv2"
PACKAGECONFIG_append_mx6sx = " egl cairo-glesv2"

EXTRA_OECONF_append_mx6 = " \
    --disable-libunwind \
    --disable-xwayland-test \
    WESTON_NATIVE_BACKEND=fbdev-backend.so \
"

EXTRA_OEMAKE_append_mx6 = " \
    COMPOSITOR_CFLAGS="-I ${STAGING_INCDIR}/pixman-1 -DLINUX=1 -DEGL_API_FB -DEGL_API_WL" \
    FB_COMPOSITOR_CFLAGS="-DLINUX=1 -DEGL_API_FB -DEGL_API_WL" \
    SIMPLE_EGL_CLIENT_CFLAGS="-DLINUX -DEGL_API_FB -DEGL_API_WL" \
    EGL_TESTS_CFLAGS="-DLINUX -DEGL_API_FB -DEGL_API_WL" \
    CLIENT_CFLAGS="-I ${STAGING_INCDIR}/cairo -I ${STAGING_INCDIR}/pixman-1 -DLINUX -DEGL_API_FB -DEGL_API_WL" \
"
EXTRA_OEMAKE_append_mx6sl = " \
    COMPOSITOR_LIBS="-lEGL -lGAL -lwayland-server -lxkbcommon -lpixman-1" \
    FB_COMPOSITOR_LIBS="-lEGL -lwayland-server -lxkbcommon" \
    "
EXTRA_OEMAKE_append_mx6q = " \
    COMPOSITOR_LIBS="-lGLESv2 -lEGL -lGAL -lwayland-server -lxkbcommon -lpixman-1" \
    FB_COMPOSITOR_LIBS="-lGLESv2 -lEGL -lwayland-server -lxkbcommon" \
    "
EXTRA_OEMAKE_append_mx6dl = " \
    COMPOSITOR_LIBS="-lGLESv2 -lEGL -lGAL -lwayland-server -lxkbcommon -lpixman-1" \
    FB_COMPOSITOR_LIBS="-lGLESv2 -lEGL -lwayland-server -lxkbcommon" \
    "
EXTRA_OEMAKE_append_mx6sx = " \
    COMPOSITOR_LIBS="-lGLESv2 -lEGL -lGAL -lwayland-server -lxkbcommon -lpixman-1" \
    FB_COMPOSITOR_LIBS="-lGLESv2 -lEGL -lwayland-server -lxkbcommon" \
    "

do_install_append_mx6 () {
    install -d ${D}${sysconfdir}/profile.d/
    install -m 0755 ${WORKDIR}/weston.sh ${D}${sysconfdir}/profile.d/
}

FILES_${PN}_append_mx6 = " ${sysconfdir}/profile.d/weston.sh"

PACKAGE_ARCH_mx6 = "${MACHINE_ARCH}"
