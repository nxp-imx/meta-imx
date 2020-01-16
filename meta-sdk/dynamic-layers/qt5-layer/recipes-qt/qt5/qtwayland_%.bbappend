FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
    file://0001-tst_client.cpp-Fix-no-opengl-build.patch \
    file://0001-Compositor-Fix-access-to-member-of-null-reference.patch \
    file://0002-Compositor-Fix-crashes-when-destroying-uninitialized.patch \
    file://0003-Client-Fix-crash-when-showing-a-child-window-with-a-.patch \
    file://0004-Client-really-use-OpenGL-ES-2-API-for-decoration-bli.patch \
    file://0005-Client-Always-close-popups-when-hiding-a-window.patch \
    file://0006-Avoid-potential-double-deletion.patch \
"
SRC_URI_append_mx6sl = " file://0001-hardwareintegration-Do-not-include-shm-emulation-ser.patch \
"

PACKAGECONFIG_remove_mx6 = "xcomposite-egl xcomposite-glx"
PACKAGECONFIG_remove_mx6sl = "wayland-egl"
PACKAGECONFIG_remove_mx7 = "xcomposite-egl xcomposite-glx"
PACKAGECONFIG_remove_mx8 = "xcomposite-egl xcomposite-glx"

do_install_append() {
if ls ${D}${libdir}/pkgconfig/Qt5*.pc >/dev/null 2>&1; then
    sed -i 's,-L${STAGING_DIR_HOST}/usr/lib,,' ${D}${libdir}/pkgconfig/Qt5*.pc
fi
}
