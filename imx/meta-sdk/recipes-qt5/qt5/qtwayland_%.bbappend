FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI_append = " file://0001-Fix-crash-when-wl_surface-was-destroyed-before-eglDe.patch"

SRC_URI_append = " ${@bb.utils.contains('DISTRO_FEATURES', 'x11', '', \
                     bb.utils.contains('DISTRO_FEATURES', 'wayland', 'file://0001-wayland-egl.pri-Fix-waylandeglclientbufferintegratio.patch', '', d), d)}"

PACKAGECONFIG_remove_mx6 = "xcomposite-egl xcomposite-glx"
PACKAGECONFIG_remove_mx6sl = "wayland-egl"
PACKAGECONFIG_remove_mx7 = "xcomposite-egl xcomposite-glx"
PACKAGECONFIG_remove_mx8 = "xcomposite-egl xcomposite-glx"

do_install_append() {
if ls ${D}${libdir}/pkgconfig/Qt5*.pc >/dev/null 2>&1; then
    sed -i 's,-L${STAGING_DIR_HOST}/usr/lib,,' ${D}${libdir}/pkgconfig/Qt5*.pc
fi
}
