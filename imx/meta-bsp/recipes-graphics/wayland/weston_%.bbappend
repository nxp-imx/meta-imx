FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_IMX = " \
    file://0008-MGS-1668-xwld-System-can-not-boot-up-to-desktop.patch \
    file://0009-MGS-1284-xwld-Re-implement-weston-2d-renderer-with-p.patch \
    file://0010-MGS-1284-1-xwld-Re-implement-weston-2d-renderer-with.patch \
    file://0011-MGS-1724-xwld-G2D-compositor-build-failed-in-slevk-b.patch \
"
SRC_URI_XWAYLAND = " \
    file://xwayland.weston-start \
    file://make-weston-launch-exit-for-unrecognized-option.patch \
    file://0001-weston-launch-Provide-a-default-version-that-doesn-t.patch \
"
SRC_URI_append_mx6   = " ${SRC_URI_IMX} ${SRC_URI_XWAYLAND}"
SRC_URI_append_mx6ul = " ${SRC_URI_XWAYLAND}"
SRC_URI_append_mx8   = " ${SRC_URI_IMX} ${SRC_URI_XWAYLAND}"

PACKAGECONFIG_append_mx8   = " cairo-glesv2"

PACKAGECONFIG_remove_mx6sl = "egl"
PACKAGECONFIG_remove_mx6ul = "egl"

PACKAGECONFIG_append = " ${@bb.utils.contains('DISTRO_FEATURES', 'x11 wayland', 'xwayland', '', d)}"
PACKAGE_BEFORE_PN += "${@bb.utils.contains('PACKAGECONFIG', 'xwayland', '${PN}-xwayland', '', d)}"
FILES_${PN}-xwayland = "${libdir}/${BPN}/xwayland.so"
RDEPENDS_${PN}-xwayland += "xserver-xorg-xwayland"

PACKAGECONFIG_append = " ${@bb.utils.contains('DISTRO_FEATURES', 'pam', 'pam', '', d)}"
PACKAGECONFIG_append = " launch"
DEPENDS_${PN}-launch_remove = "libpam"
PACKAGECONFIG[pam] = "--with-pam,--without-pam,libpam"

do_install_append() {
	if [ "${@bb.utils.contains('PACKAGECONFIG', 'xwayland', 'yes', 'no', d)}" = "yes" ]; then
		install -Dm 644 ${WORKDIR}/xwayland.weston-start ${D}${datadir}/weston-start/xwayland
	fi
}

EXTRA_OECONF_IMX = " \
    --disable-libunwind \
    --disable-xwayland-test \
    WESTON_NATIVE_BACKEND=fbdev-backend.so \
"
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
EXTRA_OEMAKE_append_mx8  = " ${EXTRA_OEMAKE_IMX_CFLAGS} ${EXTRA_OEMAKE_IMX_LIBS}"
