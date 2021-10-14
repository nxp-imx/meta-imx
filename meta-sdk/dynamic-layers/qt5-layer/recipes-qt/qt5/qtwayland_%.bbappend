FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_mx6sl = " file://0001-hardwareintegration-Do-not-include-shm-emulation-ser.patch"

PACKAGECONFIG_remove_mx6sl = "wayland-egl"

do_install_append() {
    if ls ${D}${libdir}/pkgconfig/Qt5*.pc >/dev/null 2>&1; then
        sed -i 's,-L${STAGING_DIR_HOST}/usr/lib,,' ${D}${libdir}/pkgconfig/Qt5*.pc
    fi
}
