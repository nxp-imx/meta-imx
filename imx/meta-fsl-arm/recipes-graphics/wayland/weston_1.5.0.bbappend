FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-Add-Vivante-EGL-support.patch \
            file://0002-Add-Vivante-GAL2D-support.patch \
            file://0003-Distorted-line-and-shadow-if-use-2d-com.patch \
            file://0004-Desktop-shell-Don-t-assume-there-is-a-pointer.patch \
            file://weston.sh"

PACKAGECONFIG_mx6 = "fbdev egl cairo-glesv2"

EXTRA_OECONF_append_mx6 = " \
    --disable-libunwind \
    --disable-xwayland-test \
    WESTON_NATIVE_BACKEND=fbdev-backend.so \
"

EXTRA_OEMAKE_append_mx6 = " \
    COMPOSITOR_LIBS="-lGLESv2 -lEGL -lGAL -lwayland-server -lxkbcommon -lpixman-1" \
    COMPOSITOR_CFLAGS="-I ${STAGING_INCDIR}/pixman-1 -DLINUX=1 -DEGL_API_FB -DEGL_API_WL" \
    FB_COMPOSITOR_CFLAGS="-DLINUX=1 -DEGL_API_FB -DEGL_API_WL" \
    FB_COMPOSITOR_LIBS="-lGLESv2 -lEGL -lwayland-server -lxkbcommon" \
    SIMPLE_EGL_CLIENT_CFLAGS="-DLINUX -DEGL_API_FB -DEGL_API_WL" \
    EGL_TESTS_CFLAGS="-DLINUX -DEGL_API_FB -DEGL_API_WL" \
    CLIENT_CFLAGS="-I ${STAGING_INCDIR}/cairo -I ${STAGING_INCDIR}/pixman-1 -DLINUX -DEGL_API_FB -DEGL_API_WL" \
"

do_install_append () {
    install -d ${D}${sysconfdir}/profile.d/
    install -m 0755 ${WORKDIR}/weston.sh ${D}${sysconfdir}/profile.d/
}

FILES_${PN} += "${sysconfdir}/profile.d/weston.sh"

PACKAGE_ARCH_mx6 = "${MACHINE_ARCH}"
